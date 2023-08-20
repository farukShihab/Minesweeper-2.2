package project2.pkg1;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
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
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ali Faruk Shihab
 */
public class HomePageController implements Initializable {
    
    
    @FXML
    AnchorPane anchor=new AnchorPane();
    

    @FXML
    public Button b1=new Button();
    @FXML
    public Button b2=new Button();
    @FXML
    public Button b3=new Button();
    @FXML
    public Button b4=new Button();
    
    @FXML
    public void startGameAction(ActionEvent event) throws Exception{
        Parent root=FXMLLoader.load(getClass().getResource("SelectLevel.fxml"));
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    
    
    @FXML
    public void historyAction(ActionEvent event) throws IOException{
        Parent root=FXMLLoader.load(getClass().getResource("History.fxml"));
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    
    @FXML
    public Label highscore=new Label();
    
    @FXML
    public ImageView settings=new ImageView();
    @FXML
    public void settingsPress(){
        Image img=new Image(getClass().getResourceAsStream("Gear Logo white.png"));
        
        settings.setImage(img);
    }
    @FXML
    public void settingsReleased(ActionEvent event) throws Exception{
        Parent root=FXMLLoader.load(getClass().getResource("Settings.fxml"));
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    
    public void func(){
        Connection con;
        Login1Controller e=new Login1Controller();
        con=e.connectDb();
        Statement st;
        ResultSet rs;
        Integer score=10;
        this.highscore.setText(score.toString());
        System.out.println(this.highscore.getText());
        String sql="SELECT * FROM highscore WHERE level='easy'";
        try{
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                if(rs.getInt("score")>score)score=rs.getInt("score");
            }
            sql="SELECT * FROM highscore WHERE level='medium'";
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                if(rs.getInt("score")>score)score=rs.getInt("score");
            }
            sql="SELECT * FROM highscore WHERE level='hard'";
            st=con.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                if(rs.getInt("score")>score)score=rs.getInt("score");
            }
            this.highscore.setText(score.toString());
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
        func();
        Image img=new Image(getClass().getResourceAsStream("Gear Logo.png"));
        settings.setImage(img);
        anchor.setStyle(SettingsController.Back);
        b1.setStyle(SettingsController.butt);
        
    }    
    
}
