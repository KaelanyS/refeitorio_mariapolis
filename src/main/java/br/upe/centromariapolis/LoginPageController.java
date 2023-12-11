package br.upe.centromariapolis;

import br.upe.centromariapolis.facade.Facade;
import br.upe.centromariapolis.util.MaskedTextField;
import br.upe.centromariapolis.util.ValidaCpf;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

public class LoginPageController {

    @FXML
    private MaskedTextField cpf;
    @FXML
    private Label msgError;
    @FXML
    private PasswordField pass;

    Facade facade = new Facade();

    public String getCpfText() {
        return facade.getEmployee().getCpf();
    };

    @FXML
    public void handleLoginAction(ActionEvent event) {
        String cpfText = cpf.getText();
        String passText = pass.getText();
        String cpfLimpo = cpfText.replaceAll("[^0-9]", "");

        if (ValidaCpf.isCPF(cpfLimpo) && (passText.length() >= 6)) {
            try {
                facade.getEmployee().setCpf(cpfText);
                FXMLLoader loader = new FXMLLoader(getClass().getResource("MainPage.fxml"));

                Parent root = loader.load();

                MainPageController controller = loader.getController();
                controller.setLoginPageController(this);
                Scene scene = new Scene(root);

                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                stage.setScene(scene);
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            msgError.setText("Por favor, preencha corretamente\n todos os campos");
        }
    }
}
