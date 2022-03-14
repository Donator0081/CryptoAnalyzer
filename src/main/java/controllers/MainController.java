package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private Spinner<?> spinner;

    @FXML
    private TextArea textArea;

    @FXML
    private Button closeButton;


    @FXML
    void bruteForceOnAction() {

    }

    @FXML
    void closeOnAction() {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void compileOnAction() {

    }

    @FXML
    void decryptOnAction() {

    }

    @FXML
    void encryptOnAction() {

    }

    @FXML
    void loadFileOnAction() {

    }

    @FXML
    void saveFileOnAction() {

    }

}
