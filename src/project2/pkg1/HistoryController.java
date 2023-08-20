/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package project2.pkg1;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ali Faruk Shihab
 */
public class HistoryController implements Initializable {

    
    @FXML
    public ListView<String> listView1;
    @FXML
    public ListView<String> listView2;
    @FXML
    public ListView<String> listView3;
    
    @FXML
    public void backButton(ActionEvent event)throws Exception{
        Parent root=FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    
    public Connection con;
    public PreparedStatement ps;
    public ResultSet rs;
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
        Login1Controller e=new Login1Controller();
        con=e.connectDb();
        try{
            String sql="SELECT * FROM history WHERE username='"+Login1Controller.Username+"'";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            System.out.println("Here");
            while(rs.next()){
                listView1.getItems().add("Level: "+rs.getString("level")+"\nScore: "+rs.getInt("score")+"\nDate: "+rs.getString("date")+"\nTime: "+rs.getString("time"));
            }
            
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }    
    
}
