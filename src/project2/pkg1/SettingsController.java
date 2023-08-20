package project2.pkg1;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Ali Faruk Shihab
 */
public class SettingsController implements Initializable {

    public Connection con;
    public ResultSet rs;
    public Statement st;
    public PreparedStatement pst;
    
    @FXML
    public void b1(ActionEvent event){
        Back="-fx-background-color: #95a6c3; -fx-border-color: #273a59";
        butt="-fx-border-color: #273a59";
    }
    @FXML
    public void b2(ActionEvent event){
        Back="-fx-background-color: #e30000; -fx-border-color: #5e0101";
        butt="-fx-border-color: #5e0101";
    }
    @FXML
    public void b3(ActionEvent event){
        Back="-fx-background-color: #ff6767; -fx-border-color: #9e0000";
        butt="-fx-border-color: #9e0000";
    }
    @FXML
    public void b4(ActionEvent event){
        Back="-fx-background-color: #24ff71; -fx-border-color: #005303";
        butt="-fx-border-color: #005303";
    }
    @FXML
    public void b5(ActionEvent event){
        Back="-fx-background-color: #ffffff; -fx-border-color: #000000";
        butt="-fx-border-color: #000000";
    }
    @FXML
    public void b6(ActionEvent event){
        Back="-fx-background-color: #000000; -fx-border-color: #8c8c8c";
        butt="-fx-border-color: #8c8c8c";
    }
    
    
    
    
    
    
    public static String Back="-fx-background-color: #95a6c3; -fx-border-color: #273a59";
    public static String butt="-fx-border-color: #273a59";
    
    
    @FXML
    public void doneButton(ActionEvent event) throws Exception{
        Parent root=FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    
    
    @FXML
    public TextField username=new TextField();
    @FXML
    public PasswordField oldPassword=new PasswordField();
    @FXML
    public PasswordField newPassword=new PasswordField();
    
    @FXML
    public void updateAction(ActionEvent event){
        if(oldPassword.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Old Password Field is empty!!","minesweeper message",JOptionPane.ERROR_MESSAGE);
            return;
        }
        String sql="SELECT * FROM data WHERE password=?";
        try{
            String u=Login1Controller.Username;
            String p=Login1Controller.Password;
            
            pst=con.prepareStatement(sql);
            pst.setString(1, oldPassword.getText());
            rs=pst.executeQuery();
            
            if(rs.next()){
                if(!username.getText().equals("")){
                    u=username.getText();
                }
                if(!newPassword.getText().equals("")){
                    p=newPassword.getText();
                }
                
                sql="UPDATE data SET username=? , password=? WHERE username='"+Login1Controller.Username+"'";
                Login1Controller.Password=p;
                    Login1Controller.Username=u;
                pst=con.prepareStatement(sql);
                pst.setString(1,u);
                pst.setString(2,p);
                pst.executeUpdate();
                
                JOptionPane.showMessageDialog(null,"Credentials Updated!!","minesweeper message",JOptionPane.INFORMATION_MESSAGE);
                
            }
            else{
                JOptionPane.showMessageDialog(null,"Old Password is WRONG!!!!","minesweeper message",JOptionPane.ERROR_MESSAGE);

            }
        }catch(SQLException e){
            System.out.println("SQL Exception");
        }
    }
    
    
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Login1Controller e=new Login1Controller();
        con=e.connectDb();
    }    
    
}
