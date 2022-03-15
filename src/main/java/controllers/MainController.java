package controllers;

import commands.Action;
import commands.BruteForce;
import commands.Decrypt;
import commands.Encrypt;
import constants.Constants;
import data.FileReaderForAction;
import data.FileWorker;
import data.FileWriterForAction;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private Spinner<Integer> spinner;
    @FXML
    private Label label_key;
    @FXML
    private Label label_action;

    @FXML
    private SpinnerValueFactory<Integer> spinnerValueFactory;

    @FXML
    private TextArea textArea;

    @FXML
    private Button closeButton;

    @FXML
    private final FileChooser fileChooser = new FileChooser();
    @FXML
    private final FileChooser.ExtensionFilter extensionFilter = new FileChooser.ExtensionFilter("TXT files", "*.txt");

    private Action action;
    private String afterAction;
    private FileWorker fileWorker;




    @FXML
    void bruteForceOnAction() {
        action = BruteForce.getInstance;
        spinner.setVisible(false);
        label_key.setVisible(false);
        label_action.setText("Brute Force");
    }

    @FXML
    void closeOnAction() {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void compileOnAction() {
        afterAction = action.doAction(textArea.getText(), spinner.getValue());
        textArea.setText(afterAction);
    }

    @FXML
    void decryptOnAction() {
        action = Decrypt.getInstance;
        spinner.setVisible(true);
        label_key.setVisible(true);
        label_action.setText("Decrypt");
    }

    @FXML
    void encryptOnAction() {
        action = Encrypt.getInstance;
        spinner.setVisible(true);
        label_key.setVisible(true);
        label_action.setText("Encrypt");
    }

    @FXML
    void loadFileOnAction() {
        fileWorker = FileReaderForAction.getInstance;
        fileChooser.getExtensionFilters().add(extensionFilter);
        File file = fileChooser.showOpenDialog(new Stage());
        textArea.setText(fileWorker.readFromFile(file.getAbsolutePath()));
    }

    @FXML
    void saveFileOnAction() {
        fileWorker = FileWriterForAction.getInstance;
        fileChooser.getExtensionFilters().add(extensionFilter);
        File file = fileChooser.showSaveDialog(new Stage());
        fileWorker.writeToFile(file.getAbsolutePath(),textArea.getText());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        spinnerValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, Constants.ALPHABET.length-1,1);
        spinner.setValueFactory(spinnerValueFactory);
        spinner.setVisible(true);
        label_key.setVisible(true);
        action = Encrypt.getInstance;
        label_action.setText("Encrypt");
    }
}
