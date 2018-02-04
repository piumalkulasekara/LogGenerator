package sample;

import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;

import java.io.File;

public class Controller {
    @FXML
    private Button btnUpload;
    @FXML
    private SplitMenuButton btnType;
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


    public void handleUploadButton() {

        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extensionFilter = new FileChooser.ExtensionFilter("CSV files (*.csv)", "*.csv");
        fileChooser.getExtensionFilters().add(extensionFilter);
        File file = fileChooser.showOpenDialog(null);
        System.out.println(file);
        if (!(file == null)) {
            lblStatus.setTextFill(Color.GREEN);
            lblStatus.setText("Upload Successful !!");
        } else {
            lblStatus.setTextFill(Color.RED);
            lblStatus.setText("Upload failed !");
        }

    }


}
