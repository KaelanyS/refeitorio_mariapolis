package br.upe.centromariapolis;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ReportPageController {

    @FXML
    void handleRetornarAction(ActionEvent event) {
        try{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainPage.fxml"));

        Parent root = loader.load();

        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
