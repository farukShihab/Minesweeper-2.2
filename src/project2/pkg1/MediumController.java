package project2.pkg1;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ali Faruk Shihab
 */
public class MediumController implements Initializable {

    @FXML
    public Button b1=new Button();
    @FXML
    public Button b2=new Button();
    @FXML
    public Button b3=new Button();
    @FXML
    public Button b4=new Button();
    @FXML
    public Button b5=new Button();
    @FXML
    public Button b6=new Button();
    @FXML
    public Button b7=new Button();
    @FXML
    public Button b8=new Button();
    @FXML
    public Button b9=new Button();
    @FXML
    public Button b10=new Button();
    @FXML
    public Button b11=new Button();
    @FXML
    public Button b12=new Button();
    @FXML
    public Button b13=new Button();
    @FXML
    public Button b14=new Button();
    @FXML
    public Button b15=new Button();
    @FXML
    public Button b16=new Button();
    @FXML
    public Button b17=new Button();
    @FXML
    public Button b18=new Button();
    @FXML
    public Button b19=new Button();
    @FXML
    public Button b20=new Button();
    @FXML
    public Button b21=new Button();
    @FXML
    public Button b22=new Button();
    @FXML
    public Button b23=new Button();
    @FXML
    public Button b24=new Button();
    @FXML
    public Button b25=new Button();
    @FXML
    public Button b26=new Button();
    @FXML
    public Button b27=new Button();
    @FXML
    public Button b28=new Button();
    @FXML
    public Button b29=new Button();
    @FXML
    public Button b30=new Button();
    @FXML
    public Button b31=new Button();
    @FXML
    public Button b32=new Button();
    @FXML
    public Button b33=new Button();
    @FXML
    public Button b34=new Button();
    @FXML
    public Button b35=new Button();
    @FXML
    public Button b36=new Button();
    @FXML
    public Button b37=new Button();
    @FXML
    public Button b38=new Button();
    @FXML
    public Button b39=new Button();
    @FXML
    public Button b40=new Button();
    @FXML
    public Button b41=new Button();
    @FXML
    public Button b42=new Button();
    @FXML
    public Button b43=new Button();
    @FXML
    public Button b44=new Button();
    @FXML
    public Button b45=new Button();
    @FXML
    public Button b46=new Button();
    @FXML
    public Button b47=new Button();
    @FXML
    public Button b48=new Button();
    @FXML
    public Button b49=new Button();
    @FXML
    public Button b50=new Button();
    @FXML
    public Button b51=new Button();
    @FXML
    public Button b52=new Button();
    @FXML
    public Button b53=new Button();
    @FXML
    public Button b54=new Button();
    @FXML
    public Button b55=new Button();
    @FXML
    public Button b56=new Button();
    @FXML
    public Button b57=new Button();
    @FXML
    public Button b58=new Button();
    @FXML
    public Button b59=new Button();
    @FXML
    public Button b60=new Button();
    @FXML
    public Button b61=new Button();
    @FXML
    public Button b62=new Button();
    @FXML
    public Button b63=new Button();
    @FXML
    public Button b64=new Button();
    
    
    
    
    @FXML
    public Polygon p1=new Polygon();
    @FXML
    public Polygon p2=new Polygon();
    @FXML
    public Polygon p3=new Polygon();
    @FXML
    public Polygon p4=new Polygon();
    @FXML
    public Polygon p5=new Polygon();
    @FXML
    public Polygon p6=new Polygon();
    @FXML
    public Polygon p7=new Polygon();
    @FXML
    public Polygon p8=new Polygon();
    @FXML
    public Polygon p9=new Polygon();
    @FXML
    public Polygon p10=new Polygon();
    @FXML
    public Polygon p11=new Polygon();
    @FXML
    public Polygon p12=new Polygon();
    @FXML
    public Polygon p13=new Polygon();
    @FXML
    public Polygon p14=new Polygon();
    @FXML
    public Polygon p15=new Polygon();
    @FXML
    public Polygon p16=new Polygon();
    @FXML
    public Polygon p17=new Polygon();
    @FXML
    public Polygon p18=new Polygon();
    @FXML
    public Polygon p19=new Polygon();
    @FXML
    public Polygon p20=new Polygon();
    @FXML
    public Polygon p21=new Polygon();
    @FXML
    public Polygon p22=new Polygon();
    @FXML
    public Polygon p23=new Polygon();
    @FXML
    public Polygon p24=new Polygon();
    @FXML
    public Polygon p25=new Polygon();
    @FXML
    public Polygon p26=new Polygon();
    @FXML
    public Polygon p27=new Polygon();
    @FXML
    public Polygon p28=new Polygon();
    @FXML
    public Polygon p29=new Polygon();
    @FXML
    public Polygon p30=new Polygon();
    @FXML
    public Polygon p31=new Polygon();
    @FXML
    public Polygon p32=new Polygon();
    @FXML
    public Polygon p33=new Polygon();
    @FXML
    public Polygon p34=new Polygon();
    @FXML
    public Polygon p35=new Polygon();
    @FXML
    public Polygon p36=new Polygon();
    @FXML
    public Polygon p37=new Polygon();
    @FXML
    public Polygon p38=new Polygon();
    @FXML
    public Polygon p39=new Polygon();
    @FXML
    public Polygon p40=new Polygon();
    @FXML
    public Polygon p41=new Polygon();
    @FXML
    public Polygon p42=new Polygon();
    @FXML
    public Polygon p43=new Polygon();
    @FXML
    public Polygon p44=new Polygon();
    @FXML
    public Polygon p45=new Polygon();
    @FXML
    public Polygon p46=new Polygon();
    @FXML
    public Polygon p47=new Polygon();
    @FXML
    public Polygon p48=new Polygon();
    @FXML
    public Polygon p49=new Polygon();
    @FXML
    public Polygon p50=new Polygon();
    @FXML
    public Polygon p51=new Polygon();
    @FXML
    public Polygon p52=new Polygon();
    @FXML
    public Polygon p53=new Polygon();
    @FXML
    public Polygon p54=new Polygon();
    @FXML
    public Polygon p55=new Polygon();
    @FXML
    public Polygon p56=new Polygon();
    @FXML
    public Polygon p57=new Polygon();
    @FXML
    public Polygon p58=new Polygon();
    @FXML
    public Polygon p59=new Polygon();
    @FXML
    public Polygon p60=new Polygon();
    @FXML
    public Polygon p61=new Polygon();
    @FXML
    public Polygon p62=new Polygon();
    @FXML
    public Polygon p63=new Polygon();
    @FXML
    public Polygon p64=new Polygon();
    
    
    
    @FXML
    public Label totalScore=new Label();
    @FXML
    public Label bombsExploded=new Label();
    @FXML
    public Label bombsDetected=new Label();
    
    
    
    
    
    public Random rand=new Random();
    public ArrayList<Integer> randomInts=new ArrayList<>();
    public Integer score=0;
    public Integer buttonsClicked=64;
    public Integer numberOfBombs=0;
    
    
    
    private Connection connect;
    private Statement statement;
    private ResultSet result;
    private PreparedStatement ps;
    
    public Connection connectDb(){
        
        try{
            
            connect = DriverManager.getConnection("jdbc:mysql://localhost/admin","root","");
            return connect;
            
        }catch(Exception e){e.printStackTrace();}
        
        return null;
            
        
    }
    
    
    
    
    public void isGameEnded(){
        if(buttonsClicked==0){
            System.out.println("Number of bombs detected= "+this.numberOfBombs);
            totalScore.setText(score.toString());
            Integer numberOfBombsDetected=score/10;
            this.bombsDetected.setText(numberOfBombsDetected.toString()+"/"+this.numberOfBombs.toString());
            numberOfBombsDetected=this.numberOfBombs-numberOfBombsDetected;
            this.bombsExploded.setText(numberOfBombsDetected.toString()+"/"+this.numberOfBombs.toString());
            connect=connectDb();
            String l;
            int s=0;
            try{
                String sql="SELECT * FROM highscore WHERE level='medium'";
                connect=connectDb();
                statement=connect.createStatement();
                result=statement.executeQuery(sql);
                int n=0;
                while(result.next()){
                    System.out.println(result.getString("level"));
                    n=result.getInt("score");
                    System.out.println("SQL score= "+n);
                }
                if(n<score){
                    sql="UPDATE highscore SET score=? , totalBombs=? , bombsDetected=? WHERE level='medium'";
                
                    ps=connect.prepareStatement(sql);
                    ps.setInt(1, score);
                    ps.setInt(2, this.numberOfBombs);
                    ps.setInt(3, this.numberOfBombs-numberOfBombsDetected);
                    ps.executeUpdate();
                }
                sql="INSERT INTO history VALUES (?,?,?,?,?)";
                ps=connect.prepareStatement(sql);
                ps.setString(1, Login1Controller.Username);
                ps.setString(2, "medium");
                ps.setInt(3, score);
                ps.setString(4, java.time.LocalTime.now().toString());
                ps.setString(5, java.time.LocalDate.now().toString());
                ps.execute();
            }catch(SQLException e){
                System.out.println(e);
            }
            
        }
        System.out.println("buttons clicked: "+buttonsClicked);
        System.out.println("score: "+score);
    }
    
    
    
    @FXML
    public void exitButton(ActionEvent event) throws Exception{
        Parent root=FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    
    
    @FXML
    public void b1press(){
        if(p1.getOpacity()==0)b1.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b1release(){
        if(p1.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(1)){
            b1.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(2) || randomInts.contains(9) || randomInts.contains(10)){
            if(randomInts.contains(2))kount++;
            if(randomInts.contains(9))kount++;
            if(randomInts.contains(10))kount++;
            b1.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b1.setText(kount.toString());
        }
        else{
            b1.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b2press(){
        if(p2.getOpacity()==0)b2.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b2release(){
        if(p2.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(2)){
            b2.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(1) || randomInts.contains(3) || randomInts.contains(9) || randomInts.contains(10) || randomInts.contains(11)){
            if(randomInts.contains(1))kount++;
            if(randomInts.contains(3))kount++;
            if(randomInts.contains(9))kount++;
            if(randomInts.contains(10))kount++;
            if(randomInts.contains(11))kount++;
            b2.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b2.setText(kount.toString());
        }
        else{
            b2.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b3press(){
        if(p3.getOpacity()==0)b3.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b3release(){
        if(p3.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(3)){
            b3.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(2) || randomInts.contains(4) || randomInts.contains(10) || randomInts.contains(11) || randomInts.contains(12)){
            if(randomInts.contains(2))kount++;
            if(randomInts.contains(4))kount++;
            if(randomInts.contains(10))kount++;
            if(randomInts.contains(11))kount++;
            if(randomInts.contains(12))kount++;
            b3.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b3.setText(kount.toString());
        }
        else{
            b3.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b4press(){
        if(p4.getOpacity()==0)b4.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b4release(){
        if(p4.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(4)){
            b4.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(3) || randomInts.contains(5) || randomInts.contains(11) || randomInts.contains(12) || randomInts.contains(13)){
            if(randomInts.contains(3))kount++;
            if(randomInts.contains(5))kount++;
            if(randomInts.contains(11))kount++;
            if(randomInts.contains(12))kount++;
            if(randomInts.contains(13))kount++;
            b4.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b4.setText(kount.toString());
        }
        else{
            b4.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b5press(){
        if(p5.getOpacity()==0)b5.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b5release(){
        if(p5.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(5)){
            b5.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(4) || randomInts.contains(6) || randomInts.contains(12) || randomInts.contains(13) || randomInts.contains(14)){
            if(randomInts.contains(4))kount++;
            if(randomInts.contains(6))kount++;
            if(randomInts.contains(12))kount++;
            if(randomInts.contains(13))kount++;
            if(randomInts.contains(14))kount++;
            b5.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b5.setText(kount.toString());
        }
        else{
            b5.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b6press(){
        if(p6.getOpacity()==0)b6.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b6release(){
        if(p6.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(6)){
            b6.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(5) || randomInts.contains(7) || randomInts.contains(13) || randomInts.contains(14) || randomInts.contains(15)){
            if(randomInts.contains(5))kount++;
            if(randomInts.contains(7))kount++;
            if(randomInts.contains(13))kount++;
            if(randomInts.contains(14))kount++;
            if(randomInts.contains(15))kount++;
            b6.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b6.setText(kount.toString());
        }
        else{
            b6.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b7press(){
        if(p7.getOpacity()==0)b7.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b7release(){
        if(p7.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(7)){
            b7.setStyle("-fx-background-color: red");
            System.out.println("set");
        }
        else if(randomInts.contains(6) || randomInts.contains(8) || randomInts.contains(14) || randomInts.contains(15) || randomInts.contains(16)){
            if(randomInts.contains(6))kount++;
            if(randomInts.contains(8))kount++;
            if(randomInts.contains(14))kount++;
            if(randomInts.contains(15))kount++;
            if(randomInts.contains(16))kount++;
            b7.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b7.setText(kount.toString());
        }
        else{
            b7.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b8press(){
        if(p8.getOpacity()==0)b8.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b8release(){
        if(p8.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(8)){
            b8.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(7) || randomInts.contains(15) || randomInts.contains(16)){
            if(randomInts.contains(7))kount++;
            if(randomInts.contains(15))kount++;
            if(randomInts.contains(16))kount++;
            b8.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b8.setText(kount.toString());
        }
        else{
            b8.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b9press(){
        if(p9.getOpacity()==0)b9.setStyle("-fx-background-color: #ffffff");
    }
    //3 4 5 8 10 13 14 15
    @FXML
    public void b9release(){
        if(p9.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(9)){
            b9.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(1) || randomInts.contains(2) || randomInts.contains(10) || randomInts.contains(17) || randomInts.contains(18)){
            if(randomInts.contains(1))kount++;
            if(randomInts.contains(2))kount++;
            if(randomInts.contains(10))kount++;
            if(randomInts.contains(17))kount++;
            if(randomInts.contains(18))kount++;
            b9.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b9.setText(kount.toString());
        }
        else{
            b9.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b10press(){
        if(p10.getOpacity()==0)b10.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b10release(){
        if(p10.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(10)){
            b10.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(1) || randomInts.contains(2) || randomInts.contains(3) || randomInts.contains(9) || randomInts.contains(11) || randomInts.contains(17) || randomInts.contains(18) || randomInts.contains(19)){
            if(randomInts.contains(1))kount++;
            if(randomInts.contains(2))kount++;
            if(randomInts.contains(3))kount++;
            if(randomInts.contains(9))kount++;
            if(randomInts.contains(11))kount++;
            if(randomInts.contains(17))kount++;
            if(randomInts.contains(18))kount++;
            if(randomInts.contains(19))kount++;
            b10.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b10.setText(kount.toString());
        }
        else{
            b10.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b11press(){
        if(p11.getOpacity()==0)b11.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b11release(){
        if(p11.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(11)){
            b11.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(2) || randomInts.contains(3) || randomInts.contains(4) || randomInts.contains(10) || randomInts.contains(12) || randomInts.contains(18) || randomInts.contains(19) || randomInts.contains(20)){
            if(randomInts.contains(2))kount++;
            if(randomInts.contains(3))kount++;
            if(randomInts.contains(4))kount++;
            if(randomInts.contains(10))kount++;
            if(randomInts.contains(12))kount++;
            if(randomInts.contains(18))kount++;
            if(randomInts.contains(19))kount++;
            if(randomInts.contains(20))kount++;
            b11.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b11.setText(kount.toString());
        }
        else{
            b11.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b12press(){
        if(p12.getOpacity()==0)b12.setStyle("-fx-background-color: #ffffff");
    }
    //6 7 8 11 13 16 17 18
    @FXML
    public void b12release(){
        if(p12.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(12)){
            b12.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(3) || randomInts.contains(4) || randomInts.contains(5)|| randomInts.contains(11) || randomInts.contains(13) || randomInts.contains(19) || randomInts.contains(20) || randomInts.contains(21)){
            if(randomInts.contains(3))kount++;
            if(randomInts.contains(4))kount++;
            if(randomInts.contains(5))kount++;
            if(randomInts.contains(11))kount++;
            if(randomInts.contains(13))kount++;
            if(randomInts.contains(19))kount++;
            if(randomInts.contains(20))kount++;
            if(randomInts.contains(21))kount++;
            b12.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b12.setText(kount.toString());
        }
        else{
            b12.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b13press(){
        if(p13.getOpacity()==0)b13.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b13release(){
        Integer kount=0;
        if(p13.getOpacity()==0){
        if(randomInts.contains(13)){
            b13.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(4) || randomInts.contains(5) || randomInts.contains(6)|| randomInts.contains(12) || randomInts.contains(14) || randomInts.contains(20) || randomInts.contains(21) || randomInts.contains(22)){
            if(randomInts.contains(4))kount++;
            if(randomInts.contains(5))kount++;
            if(randomInts.contains(6))kount++;
            if(randomInts.contains(12))kount++;
            if(randomInts.contains(14))kount++;
            if(randomInts.contains(20))kount++;
            if(randomInts.contains(21))kount++;
            if(randomInts.contains(22))kount++;
            b13.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b13.setText(kount.toString());
        }
        else{
            b13.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b14press(){
        if(p14.getOpacity()==0)b14.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b14release(){
        Integer kount=0;
        if(p14.getOpacity()==0){
        if(randomInts.contains(14)){
            b14.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(5) || randomInts.contains(6) || randomInts.contains(7)|| randomInts.contains(13) || randomInts.contains(15) || randomInts.contains(21) || randomInts.contains(22) || randomInts.contains(23)){
            if(randomInts.contains(5))kount++;
            if(randomInts.contains(6))kount++;
            if(randomInts.contains(7))kount++;
            if(randomInts.contains(13))kount++;
            if(randomInts.contains(15))kount++;
            if(randomInts.contains(21))kount++;
            if(randomInts.contains(22))kount++;
            if(randomInts.contains(23))kount++;
            b14.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b14.setText(kount.toString());
        }
        else{
            b14.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b15press(){
        if(p15.getOpacity()==0)b15.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b15release(){
        Integer kount=0;
        if(p15.getOpacity()==0){
        if(randomInts.contains(15)){
            b15.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(6) || randomInts.contains(7) || randomInts.contains(8) || randomInts.contains(14) || randomInts.contains(16) || randomInts.contains(22) || randomInts.contains(23) || randomInts.contains(24)){
            if(randomInts.contains(6))kount++;
            if(randomInts.contains(7))kount++;
            if(randomInts.contains(8))kount++;
            if(randomInts.contains(14))kount++;
            if(randomInts.contains(16))kount++;
            if(randomInts.contains(22))kount++;
            if(randomInts.contains(23))kount++;
            if(randomInts.contains(24))kount++;
            b15.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b15.setText(kount.toString());
        }
        else{
            b15.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b16press(){
        if(p16.getOpacity()==0)b16.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b16release(){
        Integer kount=0;
        if(p16.getOpacity()==0){
        if(randomInts.contains(16)){
            b16.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(7) || randomInts.contains(8) || randomInts.contains(15) || randomInts.contains(23) || randomInts.contains(24)){
            if(randomInts.contains(7))kount++;
            if(randomInts.contains(8))kount++;
            if(randomInts.contains(15))kount++;
            if(randomInts.contains(23))kount++;
            if(randomInts.contains(24))kount++;
            b16.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b16.setText(kount.toString());
        }
        else{
            b16.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b17release(){
        Integer kount=0;
        if(p17.getOpacity()==0){
        if(randomInts.contains(17)){
            b17.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(9) || randomInts.contains(10) || randomInts.contains(18) || randomInts.contains(25) || randomInts.contains(26)){
            if(randomInts.contains(9))kount++;
            if(randomInts.contains(10))kount++;
            if(randomInts.contains(18))kount++;
            if(randomInts.contains(25))kount++;
            if(randomInts.contains(26))kount++;
            b17.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b17.setText(kount.toString());
        }
        else{
            b17.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b17press(){
        if(p17.getOpacity()==0)b17.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b18release(){
        Integer kount=0;
        if(p18.getOpacity()==0){
        if(randomInts.contains(18)){
            b18.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(9) || randomInts.contains(10) || randomInts.contains(11) || randomInts.contains(17) || randomInts.contains(19) || randomInts.contains(25) || randomInts.contains(26) || randomInts.contains(27)){
            if(randomInts.contains(9))kount++;
            if(randomInts.contains(10))kount++;
            if(randomInts.contains(11))kount++;
            if(randomInts.contains(17))kount++;
            if(randomInts.contains(19))kount++;
            if(randomInts.contains(25))kount++;
            if(randomInts.contains(26))kount++;
            if(randomInts.contains(27))kount++;
            b18.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b18.setText(kount.toString());
        }
        else{
            b18.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b18press(){
        if(p18.getOpacity()==0)b18.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b19release(){
        Integer kount=0;
        if(p19.getOpacity()==0){
        if(randomInts.contains(19)){
            b19.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(10) || randomInts.contains(111) || randomInts.contains(12) || randomInts.contains(18) || randomInts.contains(20) || randomInts.contains(26) || randomInts.contains(27) || randomInts.contains(28)){
            if(randomInts.contains(10))kount++;
            if(randomInts.contains(11))kount++;
            if(randomInts.contains(12))kount++;
            if(randomInts.contains(18))kount++;
            if(randomInts.contains(20))kount++;
            if(randomInts.contains(26))kount++;
            if(randomInts.contains(27))kount++;
            if(randomInts.contains(28))kount++;
            b19.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b19.setText(kount.toString());
        }
        else{
            b19.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b19press(){
        if(p19.getOpacity()==0)b19.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b20release(){
        Integer kount=0;
        if(p20.getOpacity()==0){
        if(randomInts.contains(20)){
            b20.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(11) || randomInts.contains(12) || randomInts.contains(13) || randomInts.contains(19) || randomInts.contains(21) || randomInts.contains(27) || randomInts.contains(28) || randomInts.contains(29)){
            if(randomInts.contains(11))kount++;
            if(randomInts.contains(12))kount++;
            if(randomInts.contains(13))kount++;
            if(randomInts.contains(19))kount++;
            if(randomInts.contains(21))kount++;
            if(randomInts.contains(27))kount++;
            if(randomInts.contains(28))kount++;
            if(randomInts.contains(29))kount++;
            b20.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b20.setText(kount.toString());
        }
        else{
            b20.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b20press(){
        if(p20.getOpacity()==0)b20.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b21press(){
        if(p21.getOpacity()==0)b21.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b21release(){
        if(p21.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(21)){
            b21.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(12) || randomInts.contains(13) || randomInts.contains(14) || randomInts.contains(20) || randomInts.contains(22) || randomInts.contains(28) || randomInts.contains(29) || randomInts.contains(30)){
            if(randomInts.contains(12))kount++;
            if(randomInts.contains(13))kount++;
            if(randomInts.contains(14))kount++;
            if(randomInts.contains(20))kount++;
            if(randomInts.contains(22))kount++;
            if(randomInts.contains(28))kount++;
            if(randomInts.contains(29))kount++;
            if(randomInts.contains(30))kount++;
            b21.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b21.setText(kount.toString());
        }
        else{
            b21.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b22press(){
        if(p22.getOpacity()==0)b22.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b22release(){
        if(p22.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(22)){
            b22.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(13) || randomInts.contains(14) || randomInts.contains(15) || randomInts.contains(21) || randomInts.contains(23) || randomInts.contains(29) || randomInts.contains(30) || randomInts.contains(31)){
            if(randomInts.contains(13))kount++;
            if(randomInts.contains(14))kount++;
            if(randomInts.contains(15))kount++;
            if(randomInts.contains(21))kount++;
            if(randomInts.contains(23))kount++;
            if(randomInts.contains(29))kount++;
            if(randomInts.contains(30))kount++;
            if(randomInts.contains(31))kount++;
            b22.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b22.setText(kount.toString());
        }
        else{
            b22.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b23press(){
        if(p23.getOpacity()==0)b23.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b23release(){
        if(p23.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(23)){
            b23.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(14) || randomInts.contains(15) || randomInts.contains(16) || randomInts.contains(22) || randomInts.contains(24) || randomInts.contains(30) || randomInts.contains(31) || randomInts.contains(32)){
            if(randomInts.contains(14))kount++;
            if(randomInts.contains(15))kount++;
            if(randomInts.contains(16))kount++;
            if(randomInts.contains(22))kount++;
            if(randomInts.contains(24))kount++;
            if(randomInts.contains(30))kount++;
            if(randomInts.contains(31))kount++;
            if(randomInts.contains(32))kount++;
            b23.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b23.setText(kount.toString());
        }
        else{
            b23.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b24press(){
        if(p24.getOpacity()==0)b24.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b24release(){
        if(p24.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(24)){
            b24.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(15) || randomInts.contains(16) || randomInts.contains(23) || randomInts.contains(31) || randomInts.contains(32)){
            if(randomInts.contains(15))kount++;
            if(randomInts.contains(16))kount++;
            if(randomInts.contains(23))kount++;
            if(randomInts.contains(31))kount++;
            if(randomInts.contains(32))kount++;
            b24.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b24.setText(kount.toString());
        }
        else{
            b24.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b25press(){
        if(p25.getOpacity()==0)b25.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b25release(){
        if(p25.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(25)){
            b25.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(17) || randomInts.contains(18) || randomInts.contains(26) || randomInts.contains(33) || randomInts.contains(34)){
            if(randomInts.contains(17))kount++;
            if(randomInts.contains(18))kount++;
            if(randomInts.contains(26))kount++;
            if(randomInts.contains(33))kount++;
            if(randomInts.contains(34))kount++;
            b25.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b25.setText(kount.toString());
        }
        else{
            b25.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b26press(){
        if(p26.getOpacity()==0)b26.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b26release(){
        if(p26.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(26)){
            b26.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(17) || randomInts.contains(18) || randomInts.contains(19) || randomInts.contains(25) || randomInts.contains(27) || randomInts.contains(33) || randomInts.contains(34) || randomInts.contains(35)){
            if(randomInts.contains(17))kount++;
            if(randomInts.contains(18))kount++;
            if(randomInts.contains(19))kount++;
            if(randomInts.contains(25))kount++;
            if(randomInts.contains(27))kount++;
            if(randomInts.contains(33))kount++;
            if(randomInts.contains(34))kount++;
            if(randomInts.contains(35))kount++;
            b26.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b26.setText(kount.toString());
        }
        else{
            b26.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b27press(){
        if(p27.getOpacity()==0)b27.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b27release(){
        if(p27.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(27)){
            b27.setStyle("-fx-background-color: red");
            System.out.println("set");
        }
        else if(randomInts.contains(18) || randomInts.contains(19) || randomInts.contains(20) || randomInts.contains(26) || randomInts.contains(28) || randomInts.contains(34) || randomInts.contains(35) || randomInts.contains(36)){
            if(randomInts.contains(18))kount++;
            if(randomInts.contains(19))kount++;
            if(randomInts.contains(20))kount++;
            if(randomInts.contains(26))kount++;
            if(randomInts.contains(28))kount++;
            if(randomInts.contains(34))kount++;
            if(randomInts.contains(35))kount++;
            if(randomInts.contains(36))kount++;
            b27.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b27.setText(kount.toString());
        }
        else{
            b27.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b28press(){
        if(p28.getOpacity()==0)b28.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b28release(){
        if(p28.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(28)){
            b28.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(19) || randomInts.contains(20) || randomInts.contains(21) || randomInts.contains(27) || randomInts.contains(29) || randomInts.contains(35) || randomInts.contains(36) || randomInts.contains(37)){
            if(randomInts.contains(19))kount++;
            if(randomInts.contains(20))kount++;
            if(randomInts.contains(21))kount++;
            if(randomInts.contains(27))kount++;
            if(randomInts.contains(29))kount++;
            if(randomInts.contains(35))kount++;
            if(randomInts.contains(36))kount++;
            if(randomInts.contains(37))kount++;
            b28.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b28.setText(kount.toString());
        }
        else{
            b28.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b29press(){
        if(p29.getOpacity()==0)b29.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b29release(){
        if(p29.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(29)){
            b29.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(20) || randomInts.contains(21) || randomInts.contains(22) || randomInts.contains(28) || randomInts.contains(30) || randomInts.contains(36) || randomInts.contains(37) || randomInts.contains(38)){
            if(randomInts.contains(20))kount++;
            if(randomInts.contains(21))kount++;
            if(randomInts.contains(22))kount++;
            if(randomInts.contains(28))kount++;
            if(randomInts.contains(30))kount++;
            if(randomInts.contains(36))kount++;
            if(randomInts.contains(37))kount++;
            if(randomInts.contains(38))kount++;
            b29.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b29.setText(kount.toString());
        }
        else{
            b29.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b30press(){
        if(p30.getOpacity()==0)b30.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b30release(){
        if(p30.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(30)){
            b30.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(21) || randomInts.contains(22) || randomInts.contains(23) || randomInts.contains(29) || randomInts.contains(31) || randomInts.contains(37) || randomInts.contains(38) || randomInts.contains(39)){
            if(randomInts.contains(21))kount++;
            if(randomInts.contains(22))kount++;
            if(randomInts.contains(23))kount++;
            if(randomInts.contains(29))kount++;
            if(randomInts.contains(31))kount++;
            if(randomInts.contains(37))kount++;
            if(randomInts.contains(38))kount++;
            if(randomInts.contains(39))kount++;
            b30.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b30.setText(kount.toString());
        }
        else{
            b30.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b31press(){
        if(p31.getOpacity()==0)b31.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b31release(){
        if(p31.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(31)){
            b31.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(22) || randomInts.contains(23) || randomInts.contains(24) || randomInts.contains(30) || randomInts.contains(32) || randomInts.contains(38) || randomInts.contains(39) || randomInts.contains(40)){
            if(randomInts.contains(22))kount++;
            if(randomInts.contains(23))kount++;
            if(randomInts.contains(24))kount++;
            if(randomInts.contains(30))kount++;
            if(randomInts.contains(32))kount++;
            if(randomInts.contains(38))kount++;
            if(randomInts.contains(39))kount++;
            if(randomInts.contains(40))kount++;
            b31.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b31.setText(kount.toString());
        }
        else{
            b31.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b32press(){
        if(p32.getOpacity()==0)b32.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b32release(){
        if(p32.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(32)){
            b32.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(23) || randomInts.contains(24) || randomInts.contains(31)|| randomInts.contains(39) || randomInts.contains(40)){
            if(randomInts.contains(23))kount++;
            if(randomInts.contains(24))kount++;
            if(randomInts.contains(31))kount++;
            if(randomInts.contains(39))kount++;
            if(randomInts.contains(40))kount++;
            b32.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b32.setText(kount.toString());
        }
        else{
            b32.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b33press(){
        if(p33.getOpacity()==0)b33.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b33release(){
        Integer kount=0;
        if(p33.getOpacity()==0){
        if(randomInts.contains(33)){
            b33.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(25) || randomInts.contains(26) || randomInts.contains(34)|| randomInts.contains(41) || randomInts.contains(42)){
            if(randomInts.contains(25))kount++;
            if(randomInts.contains(26))kount++;
            if(randomInts.contains(34))kount++;
            if(randomInts.contains(41))kount++;
            if(randomInts.contains(42))kount++;
            b33.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b33.setText(kount.toString());
        }
        else{
            b33.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b34press(){
        if(p34.getOpacity()==0)b34.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b34release(){
        Integer kount=0;
        if(p34.getOpacity()==0){
        if(randomInts.contains(34)){
            b34.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(25) || randomInts.contains(26) || randomInts.contains(27)|| randomInts.contains(33) || randomInts.contains(36) || randomInts.contains(41) || randomInts.contains(42) || randomInts.contains(43)){
            if(randomInts.contains(25))kount++;
            if(randomInts.contains(26))kount++;
            if(randomInts.contains(27))kount++;
            if(randomInts.contains(33))kount++;
            if(randomInts.contains(35))kount++;
            if(randomInts.contains(41))kount++;
            if(randomInts.contains(42))kount++;
            if(randomInts.contains(43))kount++;
            b34.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b34.setText(kount.toString());
        }
        else{
            b34.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b35press(){
        if(p35.getOpacity()==0)b35.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b35release(){
        Integer kount=0;
        if(p35.getOpacity()==0){
        if(randomInts.contains(35)){
            b35.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(26) || randomInts.contains(27) || randomInts.contains(28) || randomInts.contains(34) || randomInts.contains(36) || randomInts.contains(42) || randomInts.contains(43) || randomInts.contains(44)){
            if(randomInts.contains(26))kount++;
            if(randomInts.contains(27))kount++;
            if(randomInts.contains(28))kount++;
            if(randomInts.contains(34))kount++;
            if(randomInts.contains(36))kount++;
            if(randomInts.contains(42))kount++;
            if(randomInts.contains(43))kount++;
            if(randomInts.contains(44))kount++;
            b35.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b35.setText(kount.toString());
        }
        else{
            b35.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b36press(){
        if(p36.getOpacity()==0)b36.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b36release(){
        Integer kount=0;
        if(p36.getOpacity()==0){
        if(randomInts.contains(36)){
            b36.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(27) || randomInts.contains(28) || randomInts.contains(29) || randomInts.contains(35) || randomInts.contains(37) || randomInts.contains(43) || randomInts.contains(44) || randomInts.contains(45)){
            if(randomInts.contains(27))kount++;
            if(randomInts.contains(28))kount++;
            if(randomInts.contains(29))kount++;
            if(randomInts.contains(35))kount++;
            if(randomInts.contains(37))kount++;
            if(randomInts.contains(43))kount++;
            if(randomInts.contains(44))kount++;
            if(randomInts.contains(45))kount++;
            b36.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b36.setText(kount.toString());
        }
        else{
            b36.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b37release(){
        Integer kount=0;
        if(p37.getOpacity()==0){
        if(randomInts.contains(37)){
            b37.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(28) || randomInts.contains(29) || randomInts.contains(30) || randomInts.contains(36) || randomInts.contains(38) || randomInts.contains(44) || randomInts.contains(45) || randomInts.contains(46)){
            if(randomInts.contains(28))kount++;
            if(randomInts.contains(29))kount++;
            if(randomInts.contains(30))kount++;
            if(randomInts.contains(36))kount++;
            if(randomInts.contains(38))kount++;
            if(randomInts.contains(44))kount++;
            if(randomInts.contains(45))kount++;
            if(randomInts.contains(46))kount++;
            b37.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b37.setText(kount.toString());
        }
        else{
            b37.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b37press(){
        if(p37.getOpacity()==0)b37.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b38release(){
        Integer kount=0;
        if(p38.getOpacity()==0){
        if(randomInts.contains(38)){
            b38.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(29) || randomInts.contains(30) || randomInts.contains(31) || randomInts.contains(37) || randomInts.contains(39) || randomInts.contains(45) || randomInts.contains(46) || randomInts.contains(47)){
            if(randomInts.contains(29))kount++;
            if(randomInts.contains(30))kount++;
            if(randomInts.contains(31))kount++;
            if(randomInts.contains(37))kount++;
            if(randomInts.contains(39))kount++;
            if(randomInts.contains(45))kount++;
            if(randomInts.contains(46))kount++;
            if(randomInts.contains(47))kount++;
            b38.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b38.setText(kount.toString());
        }
        else{
            b38.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b38press(){
        if(p38.getOpacity()==0)b38.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b39release(){
        System.out.println("Here");
        Integer kount=0;
        if(p39.getOpacity()==0){
        if(randomInts.contains(39)){
            b39.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(30) || randomInts.contains(31) || randomInts.contains(32) || randomInts.contains(38) || randomInts.contains(40) || randomInts.contains(46) || randomInts.contains(47) || randomInts.contains(48)){
            if(randomInts.contains(30))kount++;
            if(randomInts.contains(31))kount++;
            if(randomInts.contains(32))kount++;
            if(randomInts.contains(38))kount++;
            if(randomInts.contains(40))kount++;
            if(randomInts.contains(46))kount++;
            if(randomInts.contains(47))kount++;
            if(randomInts.contains(48))kount++;
            b39.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b39.setText(kount.toString());
        }
        else{
            b39.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b39press(){
        if(p39.getOpacity()==0)b39.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b40release(){
        Integer kount=0;
        if(p40.getOpacity()==0){
        if(randomInts.contains(40)){
            b40.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(31) || randomInts.contains(32) || randomInts.contains(39) || randomInts.contains(47) || randomInts.contains(48)){
            if(randomInts.contains(31))kount++;
            if(randomInts.contains(32))kount++;
            if(randomInts.contains(39))kount++;
            if(randomInts.contains(47))kount++;
            if(randomInts.contains(48))kount++;
            b40.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b40.setText(kount.toString());
        }
        else{
            b40.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b40press(){
        if(p40.getOpacity()==0)b40.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b41press(){
        if(p41.getOpacity()==0)b41.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b41release(){
        if(p41.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(41)){
            b41.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(33) || randomInts.contains(34) || randomInts.contains(42) || randomInts.contains(49) || randomInts.contains(50)){
            if(randomInts.contains(33))kount++;
            if(randomInts.contains(34))kount++;
            if(randomInts.contains(42))kount++;
            if(randomInts.contains(49))kount++;
            if(randomInts.contains(50))kount++;
            b41.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b41.setText(kount.toString());
        }
        else{
            b41.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b42press(){
        if(p42.getOpacity()==0)b42.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b42release(){
        if(p42.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(42)){
            b42.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(33) || randomInts.contains(34) || randomInts.contains(35) || randomInts.contains(41) || randomInts.contains(43) || randomInts.contains(49) || randomInts.contains(50) || randomInts.contains(51)){
            if(randomInts.contains(33))kount++;
            if(randomInts.contains(34))kount++;
            if(randomInts.contains(35))kount++;
            if(randomInts.contains(41))kount++;
            if(randomInts.contains(43))kount++;
            if(randomInts.contains(49))kount++;
            if(randomInts.contains(50))kount++;
            if(randomInts.contains(51))kount++;
            b42.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b42.setText(kount.toString());
        }
        else{
            b42.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b43press(){
        if(p43.getOpacity()==0)b43.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b43release(){
        if(p43.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(43)){
            b43.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(34) || randomInts.contains(35) || randomInts.contains(36) || randomInts.contains(42) || randomInts.contains(44) || randomInts.contains(50) || randomInts.contains(51) || randomInts.contains(52)){
            if(randomInts.contains(34))kount++;
            if(randomInts.contains(35))kount++;
            if(randomInts.contains(36))kount++;
            if(randomInts.contains(42))kount++;
            if(randomInts.contains(44))kount++;
            if(randomInts.contains(50))kount++;
            if(randomInts.contains(51))kount++;
            if(randomInts.contains(52))kount++;
            b43.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b43.setText(kount.toString());
        }
        else{
            b43.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b44press(){
        if(p44.getOpacity()==0)b44.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b44release(){
        if(p44.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(44)){
            b44.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(35) || randomInts.contains(36) || randomInts.contains(37) || randomInts.contains(43) || randomInts.contains(45) || randomInts.contains(51) || randomInts.contains(52) || randomInts.contains(53)){
            if(randomInts.contains(35))kount++;
            if(randomInts.contains(36))kount++;
            if(randomInts.contains(37))kount++;
            if(randomInts.contains(43))kount++;
            if(randomInts.contains(45))kount++;
            if(randomInts.contains(51))kount++;
            if(randomInts.contains(52))kount++;
            if(randomInts.contains(53))kount++;
            b44.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b44.setText(kount.toString());
        }
        else{
            b44.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b45press(){
        if(p45.getOpacity()==0)b45.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b45release(){
        if(p45.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(45)){
            b45.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(36) || randomInts.contains(37) || randomInts.contains(38) || randomInts.contains(44) || randomInts.contains(46) || randomInts.contains(52) || randomInts.contains(53) || randomInts.contains(54)){
            if(randomInts.contains(36))kount++;
            if(randomInts.contains(37))kount++;
            if(randomInts.contains(38))kount++;
            if(randomInts.contains(44))kount++;
            if(randomInts.contains(46))kount++;
            if(randomInts.contains(52))kount++;
            if(randomInts.contains(53))kount++;
            if(randomInts.contains(54))kount++;
            b45.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b45.setText(kount.toString());
        }
        else{
            b45.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b46press(){
        if(p46.getOpacity()==0)b46.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b46release(){
        if(p46.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(46)){
            b46.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(37) || randomInts.contains(38) || randomInts.contains(39) || randomInts.contains(45) || randomInts.contains(47) || randomInts.contains(53) || randomInts.contains(54) || randomInts.contains(55)){
            if(randomInts.contains(37))kount++;
            if(randomInts.contains(38))kount++;
            if(randomInts.contains(39))kount++;
            if(randomInts.contains(45))kount++;
            if(randomInts.contains(47))kount++;
            if(randomInts.contains(53))kount++;
            if(randomInts.contains(54))kount++;
            if(randomInts.contains(55))kount++;
            b46.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b46.setText(kount.toString());
        }
        else{
            b46.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b47press(){
        if(p47.getOpacity()==0)b47.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b47release(){
        if(p47.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(47)){
            b47.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(38) || randomInts.contains(39) || randomInts.contains(40) || randomInts.contains(46) || randomInts.contains(48) || randomInts.contains(54) || randomInts.contains(55) || randomInts.contains(56)){
            if(randomInts.contains(38))kount++;
            if(randomInts.contains(39))kount++;
            if(randomInts.contains(40))kount++;
            if(randomInts.contains(46))kount++;
            if(randomInts.contains(48))kount++;
            if(randomInts.contains(54))kount++;
            if(randomInts.contains(55))kount++;
            if(randomInts.contains(56))kount++;
            b47.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b47.setText(kount.toString());
        }
        else{
            b47.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b48press(){
        if(p48.getOpacity()==0)b48.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b48release(){
        if(p48.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(48)){
            b48.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(39) || randomInts.contains(40) || randomInts.contains(47) || randomInts.contains(55) || randomInts.contains(56)){
            if(randomInts.contains(39))kount++;
            if(randomInts.contains(40))kount++;
            if(randomInts.contains(47))kount++;
            if(randomInts.contains(55))kount++;
            if(randomInts.contains(56))kount++;
            b48.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b48.setText(kount.toString());
        }
        else{
            b48.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b49press(){
        if(p49.getOpacity()==0)b49.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b49release(){
        if(p49.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(49)){
            b49.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(41) || randomInts.contains(42) || randomInts.contains(50) || randomInts.contains(57) || randomInts.contains(58)){
            if(randomInts.contains(41))kount++;
            if(randomInts.contains(42))kount++;
            if(randomInts.contains(50))kount++;
            if(randomInts.contains(57))kount++;
            if(randomInts.contains(58))kount++;
            b49.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b49.setText(kount.toString());
        }
        else{
            b49.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b50press(){
        if(p50.getOpacity()==0)b50.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b50release(){
        if(p50.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(50)){
            b50.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(41) || randomInts.contains(42) || randomInts.contains(43) || randomInts.contains(49) || randomInts.contains(51) || randomInts.contains(57) || randomInts.contains(58) || randomInts.contains(59)){
            if(randomInts.contains(41))kount++;
            if(randomInts.contains(42))kount++;
            if(randomInts.contains(43))kount++;
            if(randomInts.contains(49))kount++;
            if(randomInts.contains(51))kount++;
            if(randomInts.contains(57))kount++;
            if(randomInts.contains(58))kount++;
            if(randomInts.contains(59))kount++;
            b50.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b50.setText(kount.toString());
        }
        else{
            b50.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b51press(){
        if(p51.getOpacity()==0)b51.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b51release(){
        if(p51.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(51)){
            b51.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(42) || randomInts.contains(43) || randomInts.contains(44) || randomInts.contains(50) || randomInts.contains(52) || randomInts.contains(58) || randomInts.contains(59) || randomInts.contains(60)){
            if(randomInts.contains(42))kount++;
            if(randomInts.contains(43))kount++;
            if(randomInts.contains(44))kount++;
            if(randomInts.contains(50))kount++;
            if(randomInts.contains(52))kount++;
            if(randomInts.contains(58))kount++;
            if(randomInts.contains(59))kount++;
            if(randomInts.contains(60))kount++;
            b51.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b51.setText(kount.toString());
        }
        else{
            b51.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b52press(){
        if(p52.getOpacity()==0)b52.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b52release(){
        if(p52.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(52)){
            b52.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(43) || randomInts.contains(44) || randomInts.contains(45)|| randomInts.contains(51) || randomInts.contains(53) || randomInts.contains(59) || randomInts.contains(60) || randomInts.contains(61)){
            if(randomInts.contains(43))kount++;
            if(randomInts.contains(44))kount++;
            if(randomInts.contains(45))kount++;
            if(randomInts.contains(51))kount++;
            if(randomInts.contains(53))kount++;
            if(randomInts.contains(59))kount++;
            if(randomInts.contains(60))kount++;
            if(randomInts.contains(61))kount++;
            b52.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b52.setText(kount.toString());
        }
        else{
            b52.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b53press(){
        if(p53.getOpacity()==0)b53.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b53release(){
        Integer kount=0;
        if(p53.getOpacity()==0){
        if(randomInts.contains(53)){
            b53.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(44) || randomInts.contains(45) || randomInts.contains(46)|| randomInts.contains(52) || randomInts.contains(54) || randomInts.contains(60) || randomInts.contains(61) || randomInts.contains(62)){
            if(randomInts.contains(44))kount++;
            if(randomInts.contains(45))kount++;
            if(randomInts.contains(46))kount++;
            if(randomInts.contains(52))kount++;
            if(randomInts.contains(54))kount++;
            if(randomInts.contains(60))kount++;
            if(randomInts.contains(61))kount++;
            if(randomInts.contains(62))kount++;
            b53.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b53.setText(kount.toString());
        }
        else{
            b53.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b54press(){
        if(p54.getOpacity()==0)b54.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b54release(){
        Integer kount=0;
        if(p54.getOpacity()==0){
        if(randomInts.contains(54)){
            b54.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(45) || randomInts.contains(46) || randomInts.contains(47)|| randomInts.contains(53) || randomInts.contains(55) || randomInts.contains(61) || randomInts.contains(62) || randomInts.contains(63)){
            if(randomInts.contains(45))kount++;
            if(randomInts.contains(46))kount++;
            if(randomInts.contains(47))kount++;
            if(randomInts.contains(53))kount++;
            if(randomInts.contains(55))kount++;
            if(randomInts.contains(61))kount++;
            if(randomInts.contains(62))kount++;
            if(randomInts.contains(63))kount++;
            b54.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b54.setText(kount.toString());
        }
        else{
            b54.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b55press(){
        if(p55.getOpacity()==0)b55.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b55release(){
        Integer kount=0;
        if(p55.getOpacity()==0){
        if(randomInts.contains(55)){
            b55.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(46) || randomInts.contains(47) || randomInts.contains(48) || randomInts.contains(54) || randomInts.contains(56) || randomInts.contains(62) || randomInts.contains(63) || randomInts.contains(64)){
            if(randomInts.contains(46))kount++;
            if(randomInts.contains(47))kount++;
            if(randomInts.contains(48))kount++;
            if(randomInts.contains(54))kount++;
            if(randomInts.contains(56))kount++;
            if(randomInts.contains(62))kount++;
            if(randomInts.contains(63))kount++;
            if(randomInts.contains(64))kount++;
            b55.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b55.setText(kount.toString());
        }
        else{
            b55.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b56press(){
        if(p56.getOpacity()==0)b56.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b56release(){
        Integer kount=0;
        if(p56.getOpacity()==0){
        if(randomInts.contains(56)){
            b56.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(47) || randomInts.contains(48) || randomInts.contains(55) || randomInts.contains(63) || randomInts.contains(64)){
            if(randomInts.contains(47))kount++;
            if(randomInts.contains(48))kount++;
            if(randomInts.contains(55))kount++;
            if(randomInts.contains(63))kount++;
            if(randomInts.contains(64))kount++;
            b56.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b56.setText(kount.toString());
        }
        else{
            b56.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b57release(){
        Integer kount=0;
        if(p57.getOpacity()==0){
        if(randomInts.contains(57)){
            b57.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(49) || randomInts.contains(50) || randomInts.contains(58)){
            if(randomInts.contains(49))kount++;
            if(randomInts.contains(50))kount++;
            if(randomInts.contains(58))kount++;
            b57.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b57.setText(kount.toString());
        }
        else{
            b57.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b57press(){
        if(p57.getOpacity()==0)b57.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b58release(){
        Integer kount=0;
        if(p58.getOpacity()==0){
        if(randomInts.contains(58)){
            b58.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(49) || randomInts.contains(50) || randomInts.contains(51) || randomInts.contains(57) || randomInts.contains(59)){
            if(randomInts.contains(49))kount++;
            if(randomInts.contains(50))kount++;
            if(randomInts.contains(51))kount++;
            if(randomInts.contains(57))kount++;
            if(randomInts.contains(59))kount++;
            b58.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b58.setText(kount.toString());
        }
        else{
            b58.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b58press(){
        if(p58.getOpacity()==0)b58.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b59release(){
        Integer kount=0;
        if(p59.getOpacity()==0){
        if(randomInts.contains(59)){
            b59.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(50) || randomInts.contains(51) || randomInts.contains(52) || randomInts.contains(58) || randomInts.contains(60)){
            if(randomInts.contains(50))kount++;
            if(randomInts.contains(51))kount++;
            if(randomInts.contains(52))kount++;
            if(randomInts.contains(58))kount++;
            if(randomInts.contains(60))kount++;
            b59.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b59.setText(kount.toString());
        }
        else{
            b59.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b59press(){
        if(p59.getOpacity()==0)b59.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b60release(){
        Integer kount=0;
        if(p60.getOpacity()==0){
        if(randomInts.contains(60)){
            b60.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(51) || randomInts.contains(52) || randomInts.contains(53) || randomInts.contains(59) || randomInts.contains(61)){
            if(randomInts.contains(51))kount++;
            if(randomInts.contains(52))kount++;
            if(randomInts.contains(53))kount++;
            if(randomInts.contains(59))kount++;
            if(randomInts.contains(61))kount++;
            b60.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b60.setText(kount.toString());
        }
        else{
            b60.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b60press(){
        if(p60.getOpacity()==0)b60.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b61press(){
        if(p61.getOpacity()==0)b61.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b61release(){
        if(p61.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(61)){
            b61.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(52) || randomInts.contains(53) || randomInts.contains(54) || randomInts.contains(60) || randomInts.contains(62)){
            if(randomInts.contains(52))kount++;
            if(randomInts.contains(53))kount++;
            if(randomInts.contains(54))kount++;
            if(randomInts.contains(60))kount++;
            if(randomInts.contains(62))kount++;
            b61.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b61.setText(kount.toString());
        }
        else{
            b61.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b62press(){
        if(p62.getOpacity()==0)b62.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b62release(){
        if(p62.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(62)){
            b62.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(53) || randomInts.contains(54) || randomInts.contains(55) || randomInts.contains(61) || randomInts.contains(63)){
            if(randomInts.contains(53))kount++;
            if(randomInts.contains(54))kount++;
            if(randomInts.contains(55))kount++;
            if(randomInts.contains(61))kount++;
            if(randomInts.contains(63))kount++;
            b62.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b62.setText(kount.toString());
        }
        else{
            b62.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b63press(){
        if(p63.getOpacity()==0)b63.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b63release(){
        if(p63.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(63)){
            b63.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(54) || randomInts.contains(55) || randomInts.contains(56) || randomInts.contains(62) || randomInts.contains(64)){
            if(randomInts.contains(54))kount++;
            if(randomInts.contains(55))kount++;
            if(randomInts.contains(56))kount++;
            if(randomInts.contains(62))kount++;
            if(randomInts.contains(64))kount++;
            b63.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b63.setText(kount.toString());
        }
        else{
            b63.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    @FXML
    public void b64press(){
        if(p64.getOpacity()==0)b64.setStyle("-fx-background-color: #ffffff");
    }
    @FXML
    public void b64release(){
        if(p64.getOpacity()==0){
        Integer kount=0;
        if(randomInts.contains(64)){
            b64.setStyle("-fx-background-color: red");
        }
        else if(randomInts.contains(55) || randomInts.contains(56) || randomInts.contains(63)){
            if(randomInts.contains(55))kount++;
            if(randomInts.contains(56))kount++;
            if(randomInts.contains(63))kount++;
            b64.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
            b64.setText(kount.toString());
        }
        else{
            b64.setStyle("-fx-background-color: white; -fx-border-color: red; -fx-border-width: 4;");
        }
        buttonsClicked--;
        this.isGameEnded();
        }
    }
    
    
    
    
    
    @FXML
    public void flag1(){
        if(p1.getOpacity()==1){
            p1.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p1.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(1)){
            if(p1.getOpacity()==1)score+=10;
            else score-=10;
            
        }
        
    }
    @FXML
    public void flag2(){
        if(p2.getOpacity()==1){
            p2.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p2.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(2)){
            if(p2.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag3(){
        if(p3.getOpacity()==1){
            p3.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p3.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(3)){
            if(p3.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag4(){
        if(p4.getOpacity()==1){
            p4.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p4.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(4)){
            if(p4.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag5(){
        if(p5.getOpacity()==1){
            p5.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p5.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(5)){
            if(p5.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag6(){
        if(p6.getOpacity()==1){
            p6.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p6.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(6)){
            if(p6.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag7(){
        if(p7.getOpacity()==1){
            p7.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p7.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(7)){
            if(p7.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag8(){
        if(p8.getOpacity()==1){
            p8.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p8.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(8)){
            if(p8.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag9(){
        if(p9.getOpacity()==1){
            p9.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p9.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(9)){
            if(p9.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag10(){
        if(p10.getOpacity()==1){
            p10.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p10.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(10)){
            if(p10.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag11(){
        if(p11.getOpacity()==1){
            p11.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p11.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(11)){
            if(p11.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag12(){
        if(p12.getOpacity()==1){
            p12.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p12.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(12)){
            if(p12.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag13(){
        if(p13.getOpacity()==1){
            p13.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p13.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(13)){
            if(p13.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag14(){
        if(p14.getOpacity()==1){
            p14.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p14.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(14)){
            if(p14.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag15(){
        if(p15.getOpacity()==1){
            p15.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p15.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(15)){
            if(p15.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag16(){
       if(p16.getOpacity()==1){
            p16.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p16.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(16)){
            if(p16.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag17(){
        if(p17.getOpacity()==1){
            p17.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p17.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(17)){
            if(p17.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag18(){
        if(p18.getOpacity()==1){
            p18.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p18.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(18)){
            if(p18.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag19(){
        if(p19.getOpacity()==1){
            p19.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p19.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(19)){
            if(p19.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag20(){
        if(p20.getOpacity()==1){
            p20.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p20.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(20)){
            if(p20.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag21(){
        if(p21.getOpacity()==1){
            p21.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p21.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(21)){
            if(p21.getOpacity()==1)score+=10;
            else score-=10;
            
        }
        
    }
    @FXML
    public void flag22(){
        if(p22.getOpacity()==1){
            p22.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p22.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(22)){
            if(p22.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag23(){
        if(p23.getOpacity()==1){
            p23.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p23.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(23)){
            if(p23.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag24(){
        if(p24.getOpacity()==1){
            p24.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p24.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(24)){
            if(p24.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag25(){
        if(p25.getOpacity()==1){
            p25.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p25.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(25)){
            if(p25.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag26(){
        if(p26.getOpacity()==1){
            p26.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p26.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(26)){
            if(p26.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag27(){
        if(p27.getOpacity()==1){
            p27.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p27.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(27)){
            if(p27.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag28(){
        if(p28.getOpacity()==1){
            p28.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p28.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(28)){
            if(p28.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag29(){
        if(p29.getOpacity()==1){
            p29.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p29.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(29)){
            if(p29.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag30(){
        if(p30.getOpacity()==1){
            p30.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p30.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(30)){
            if(p30.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag31(){
        if(p31.getOpacity()==1){
            p31.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p31.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(31)){
            if(p31.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag32(){
        if(p32.getOpacity()==1){
            p32.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p32.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(32)){
            if(p32.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag33(){
        if(p33.getOpacity()==1){
            p33.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p33.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(33)){
            if(p33.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag34(){
        if(p34.getOpacity()==1){
            p34.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p34.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(34)){
            if(p34.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag35(){
        if(p35.getOpacity()==1){
            p35.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p35.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(35)){
            if(p35.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag36(){
       if(p36.getOpacity()==1){
            p36.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p36.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(36)){
            if(p36.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag37(){
        if(p37.getOpacity()==1){
            p37.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p37.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(37)){
            if(p37.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag38(){
        if(p38.getOpacity()==1){
            p38.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p38.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(38)){
            if(p38.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag39(){
        if(p39.getOpacity()==1){
            p39.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p39.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(39)){
            if(p39.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag40(){
        if(p40.getOpacity()==1){
            p40.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p40.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(40)){
            if(p40.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag41(){
        if(p41.getOpacity()==1){
            p41.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p41.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(41)){
            if(p41.getOpacity()==1)score+=10;
            else score-=10;
            
        }
        
    }
    @FXML
    public void flag42(){
        if(p42.getOpacity()==1){
            p42.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p42.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(42)){
            if(p42.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag43(){
        if(p43.getOpacity()==1){
            p43.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p43.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(43)){
            if(p43.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag44(){
        if(p44.getOpacity()==1){
            p44.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p44.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(44)){
            if(p44.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag45(){
        if(p45.getOpacity()==1){
            p45.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p45.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(45)){
            if(p45.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag46(){
        if(p46.getOpacity()==1){
            p46.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p46.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(46)){
            if(p46.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag47(){
        if(p47.getOpacity()==1){
            p47.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p47.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(47)){
            if(p47.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag48(){
        if(p48.getOpacity()==1){
            p48.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p48.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(48)){
            if(p48.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag49(){
        if(p49.getOpacity()==1){
            p49.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p49.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(49)){
            if(p49.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag50(){
        if(p50.getOpacity()==1){
            p50.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p50.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(50)){
            if(p50.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag51(){
        if(p51.getOpacity()==1){
            p51.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p51.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(51)){
            if(p51.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag52(){
        if(p52.getOpacity()==1){
            p52.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p52.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(52)){
            if(p52.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag53(){
        if(p53.getOpacity()==1){
            p53.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p53.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(53)){
            if(p53.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag54(){
        if(p54.getOpacity()==1){
            p54.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p54.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(54)){
            if(p54.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag55(){
        if(p55.getOpacity()==1){
            p55.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p55.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(55)){
            if(p55.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag56(){
       if(p56.getOpacity()==1){
            p56.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p56.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(56)){
            if(p56.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag57(){
        if(p57.getOpacity()==1){
            p57.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p57.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(57)){
            if(p57.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag58(){
        if(p58.getOpacity()==1){
            p58.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p58.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(58)){
            if(p58.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag59(){
        if(p59.getOpacity()==1){
            p59.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p59.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(59)){
            if(p59.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag60(){
        if(p60.getOpacity()==1){
            p60.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p60.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(60)){
            if(p60.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag61(){
        if(p61.getOpacity()==1){
            p61.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p61.setOpacity(61);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(61)){
            if(p61.getOpacity()==1)score+=10;
            else score-=10;
            
        }
        
    }
    @FXML
    public void flag62(){
        if(p62.getOpacity()==1){
            p62.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p62.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(62)){
            if(p62.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag63(){
        if(p63.getOpacity()==1){
            p63.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p63.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(63)){
            if(p63.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    @FXML
    public void flag64(){
        if(p64.getOpacity()==1){
            p64.setOpacity(0);
            buttonsClicked++;
            this.isGameEnded();
        }
        else {
            p64.setOpacity(1);
            buttonsClicked--;
            this.isGameEnded();
        }
        if(randomInts.contains(64)){
            if(p64.getOpacity()==1)score+=10;
            else score-=10;
            
        }
    }
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        for(int i=0;i<30;i++){
            this.randomInts.add(rand.nextInt(65));
            System.out.println(this.randomInts.get(i));
        }
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<this.randomInts.size();i++){
            if(this.randomInts.get(i)==0)continue;
            set.add(this.randomInts.get(i));
        }
        this.numberOfBombs=set.size();
        
        System.out.println(this.numberOfBombs);
    }    
    
}
