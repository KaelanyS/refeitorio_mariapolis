package br.upe.centromariapolis;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainPageController {

    @FXML
    private Label labelImportStatus;

    @FXML
    void handleCheckinAction(ActionEvent event) {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CheckinPage.fxml"));

            Parent root = loader.load();

            Scene scene = new Scene(root);

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    void handleRelatorioAction(ActionEvent event) {
        try{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ReportPage.fxml"));

        Parent root = loader.load();

        Scene scene = new Scene(root);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    void handleImportAction(ActionEvent event) {
        labelImportStatus.setText("Relatório importado com sucesso!");
    }
}
