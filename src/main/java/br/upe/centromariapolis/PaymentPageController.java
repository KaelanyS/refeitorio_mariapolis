package br.upe.centromariapolis;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class PaymentPageController {

    @FXML
    private RadioButton cashButton;

    @FXML
    private RadioButton creditCardButton;

    @FXML
    private RadioButton debitCardButton;

    @FXML
    private RadioButton pixButton;

    private ToggleGroup paymentTypeGroup;

    @FXML
    public void initialize(){
        paymentTypeGroup = new ToggleGroup();

        cashButton.setToggleGroup(paymentTypeGroup);
        creditCardButton.setToggleGroup(paymentTypeGroup);
        debitCardButton.setToggleGroup(paymentTypeGroup);
        pixButton.setToggleGroup(paymentTypeGroup);
    }

    @FXML
    void handlePayAction(ActionEvent event) {
        RadioButton selectedRadioButton = (RadioButton) paymentTypeGroup.getSelectedToggle();

        if (selectedRadioButton != null) {
            String selectedPaymentMethod = selectedRadioButton.getText();
            System.out.println("Método de pagamento selecionado: " + selectedPaymentMethod);
        } else {
            System.out.println("Nenhum método de pagamento selecionado.");
        }

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
}
