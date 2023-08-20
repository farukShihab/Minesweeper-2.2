/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package project2.pkg1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ali Faruk Shihab
 */
public class SelectLevelController implements Initializable {

   
    @FXML
    public Button easy=new Button();
    @FXML
    public Button medium=new Button();
    @FXML
    public Button back=new Button();
    
    
    @FXML
    public void backAction(ActionEvent event) throws IOException{
        Parent root=FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    
    @FXML
    public void easyAction(ActionEvent event) throws Exception{
        Parent root=FXMLLoader.load(getClass().getResource("Easy.fxml"));
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    public void mediumAction(ActionEvent event) throws Exception{
        Parent root=FXMLLoader.load(getClass().getResource("Medium.fxml"));
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
