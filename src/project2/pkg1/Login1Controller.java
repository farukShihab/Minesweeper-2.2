/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package project2.pkg1;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class Login1Controller implements Initializable {

    @FXML
    public Button login_btn=new Button();
    @FXML
    public TextField username=new TextField();
    @FXML
    public PasswordField password=new PasswordField();
    
      @FXML
    private Hyperlink login_acc;

    @FXML
    private TextField su_email;

    @FXML
    private AnchorPane signup_form;

    @FXML
    private PasswordField su_password;

    @FXML
    private AnchorPane login_form;

    @FXML
    private Button signup_btn;

    @FXML
    private TextField su_username;

    @FXML
    private Hyperlink creat_acc;

    
    private Connection connect;
    private PreparedStatement statement;
    private ResultSet result;
    
    public Connection connectDb(){
        
        try{
            
            connect = DriverManager.getConnection("jdbc:mysql://localhost/admin","root","");
            return connect;
            
        }catch(Exception e){e.printStackTrace();}
        
        return null;
            
        
    }
    
    public static String Password="";
    public static String Username="shihab";
    
    
     @FXML
    public void loginAction(ActionEvent event){
       
        connect = connectDb();
        try{
            String sql = "SELECT * FROM data WHERE username = ? and password = ?";
            statement = connect.prepareStatement(sql);
            statement.setString(1,username.getText());
            statement.setString(2,password.getText());
            result = statement.executeQuery();
            
            
            if(result.next()){
                this.Username=this.username.getText();
                this.Password=this.password.getText();
                JOptionPane.showMessageDialog(null,"Login successfull","minesweeper message",JOptionPane.INFORMATION_MESSAGE);
                //login_btn.getScene().getWindow().hide();
                
                Parent root=FXMLLoader.load(getClass().getResource("HomePage.fxml"));
               
                Scene scene = new Scene(root);
                Stage stage= new Stage();
                
                stage.setScene(scene);
                stage.setTitle("Homepage");
                stage.show();
               
                
            }else{
                JOptionPane.showMessageDialog(null,"Wrong username/password","minesweeper message",JOptionPane.INFORMATION_MESSAGE);
            }
            
            
            
        }catch(Exception e){e.printStackTrace();}
            
    }
    
   public void signUp(ActionEvent event){
       
       connect = connectDb();
       
       try{
           String sql = "INSERT INTO data VALUES(?,?,?)";
           statement = connect.prepareStatement(sql);
           statement.setString(1,su_username.getText());
           statement.setString(2,su_password.getText());
           statement.setString(3,su_email.getText());
           statement.execute();
           
           JOptionPane.showMessageDialog(null,"Successfully Created new account","minesweeper message",JOptionPane.INFORMATION_MESSAGE);
           
       }catch(Exception e){e.printStackTrace();}
   } 
    
   public void changeForm(ActionEvent event){
       
       if(event.getSource() == login_acc ){
           
           signup_form.setVisible(false);
           login_form.setVisible(true);
           
       }else if(event.getSource() == creat_acc ){
           
            signup_form.setVisible(true);
           login_form.setVisible(false);
       }
   }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }    
    
}
