package br.upe.centromariapolis;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EmployeePageController {

    private Stage previousStage;

    public void setPreviousStage(Stage previousStage) {
        this.previousStage = previousStage;
    }

    @FXML
    private Text cpfTextLabel;

    public void setCpfText(String text) {
        cpfTextLabel.setText(text);
    }

    @FXML
    private Button backButton;

    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private void goBack(ActionEvent event) {
        Stage currentStage = (Stage) backButton.getScene().getWindow();
        currentStage.hide();

        if (previousStage != null && previousStage != currentStage) {
            previousStage.show();
        }
    }
}
