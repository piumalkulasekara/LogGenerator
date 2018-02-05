package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;


public class Controller {
    ObservableList<String> types = FXCollections.observableArrayList("Memory", "Total CPU", "KUBE Apps CPU", "Security Apps CPU");
    @FXML
    private Button btnUpload;
    @FXML
    private ChoiceBox choiceBox;
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

    private Stage stage;


    public void init(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private void initialize() {
        choiceBox.setValue(types.get(0));
        choiceBox.setItems(types);
    }

    public void handleUploadButton() {

        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extensionFilter = new FileChooser.ExtensionFilter("CSV files (*.csv)", "*.csv");
        fileChooser.getExtensionFilters().add(extensionFilter);
        File file = fileChooser.showOpenDialog(stage);
        System.out.println(file);
        if (!(file == null)) {
            lblStatus.setTextFill(Color.GREEN);
            lblStatus.setText("Upload Successful !!");
        } else {
            lblStatus.setTextFill(Color.RED);
            lblStatus.setText("Upload failed !");
        }

    }

    public void selectedType() {


    }
}
