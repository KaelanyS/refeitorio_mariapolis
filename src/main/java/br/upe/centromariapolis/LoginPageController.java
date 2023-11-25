package br.upe.centromariapolis;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginPageController {

    @FXML
    private Button bttContinue;
    @FXML
    private MaskedTextField cpf;
//    @FXML
//    private TextField cpf;
    @FXML
    private Label msgError;
    @FXML
    private PasswordField pass;

    @FXML
    public void handleLoginAction(ActionEvent event) {
        String cpfText = cpf.getText();
        String passText = pass.getText();

        String cpfLimpo = cpfText.replaceAll("[^0-9]", "");

        System.out.println(ValidaCpf.isCPF(cpfLimpo));
        System.out.println(passText.length());

        if ( ValidaCpf.isCPF(cpfLimpo) && (passText.length() >= 6)){
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
        } else{
            msgError.setText("Por favor, preencha corretamente\n todos os campos");
        }
    }

}
