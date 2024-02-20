package br.upe.centromariapolis;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public final class Facade {

    private Facade(){}
    public static void renderScene(String path, Stage stage){
        try{
            FXMLLoader loader = new FXMLLoader(Facade.class.getResource(path));

            Parent root = loader.load();

            Scene scene = new Scene(root);
            stage.getUserData();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
