package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Main extends Application {
    Controller controller = new Controller();
    @FXML
    private Button btnUpload;
    @FXML
    private Button btnType;
    @FXML
    private Button btnOutPutOpen;
    @FXML
    private Button btnGenerate;
    @FXML
    private TextField txtFldOutPut;
    @FXML
    private LineChart chrtLine;
    @FXML
    private Label lblStatus;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 650, 600));
        primaryStage.show();
        primaryStage.setResizable(false);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
