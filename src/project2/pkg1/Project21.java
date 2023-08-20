package project2.pkg1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Ali Faruk Shihab
 */
public class Project21 extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root=FXMLLoader.load(getClass().getResource("Login1.fxml"));
        //Parent root=FXMLLoader.load(getClass().getResource("History.fxml"));
        Stage stage=new Stage();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
