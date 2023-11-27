package br.upe.centromariapolis;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class CheckinOnPage{

    @FXML
    private Text titleCheckin;

    public void initialize(){
        int countdownDurationInSeconds = 3;
        Timeline timeline = new Timeline();
        timeline.setCycleCount(1);

        KeyFrame keyFrame = new KeyFrame(
                Duration.seconds(countdownDurationInSeconds),
                event -> {
                    try{
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("CheckinPage.fxml"));

                        Parent root = loader.load();

                        Stage stage = (Stage) titleCheckin.getScene().getWindow();

                        stage.getScene().setRoot(root);

                    } catch (Exception e){
                        e.printStackTrace();
                    }
                }
        );

        timeline.getKeyFrames().add(keyFrame);
        timeline.play();
    }
}
