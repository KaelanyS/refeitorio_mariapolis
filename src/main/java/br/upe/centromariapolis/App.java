package br.upe.centromariapolis;

import br.upe.centromariapolis.repository.IRepoCustomer;
import br.upe.centromariapolis.repository.RepoCustomer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    IRepoCustomer repoCustomer = new RepoCustomer();

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("LoginPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1024, 768);
        stage.setTitle("Centro Mariapolis Santa Maria");
        stage.setUserData(repoCustomer);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}