package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("home.fxml"));
        Parent root = loader.load();
        Controller controller = loader.getController();
        primaryStage.setTitle("Longevity Report Generator");
        Scene scene = new Scene(root, 650, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);
        controller.init(primaryStage);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
