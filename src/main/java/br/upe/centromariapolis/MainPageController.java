package br.upe.centromariapolis;

import java.io.IOException;
import java.util.List;

import br.upe.centromariapolis.model.Customer;
import br.upe.centromariapolis.repository.IRepoCustomer;
import br.upe.centromariapolis.repository.RepoCustomer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MainPageController {

    @FXML
    private Label labelImportStatus;

    @FXML
    private Button employeeButton;

    private LoginPageController loginPageController;

    @FXML
    private ImageView barcode;

    @FXML
    private TableView<Customer> tableViewCustomers;

    @FXML
    private TableColumn<Customer, String> tableColumnCustomerCpf;

    @FXML
    private TableColumn<Customer, String> tableColumnCustomerName;

    @FXML
    private TableColumn<Customer, Integer> tableColumnCustomerQntRefeicoes;

    @FXML
    private TableColumn<Customer, String> tableColumnCustomerTimestamp;

    RepoCustomer repoCustomer = new RepoCustomer();
    private ObservableList<Customer> observableListCustomers;

    @FXML
    public void initialize(){
        loadTableViewCustomers();
    }

    public void setLoginPageController(LoginPageController loginPageController) {
        this.loginPageController = loginPageController;
    }

    public void loadTableViewCustomers(){
        tableColumnCustomerCpf.setCellValueFactory(new PropertyValueFactory<>("cpf"));
        tableColumnCustomerName.setCellValueFactory(new PropertyValueFactory<>("name"));
        tableColumnCustomerQntRefeicoes.setCellValueFactory(new PropertyValueFactory<>("qntRefeicoes"));
        tableColumnCustomerTimestamp.setCellValueFactory(new PropertyValueFactory<>("checkInTimestamp"));

        observableListCustomers = FXCollections.observableArrayList(repoCustomer.listCustomers());
        tableViewCustomers.setItems(observableListCustomers);
    }

    @FXML
    void handleCheckinAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CheckinPage.fxml"));

            Parent root = loader.load();

            Scene scene = new Scene(root);

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleRelatorioAction(ActionEvent event) {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("ReportPage.fxml"));

            Parent root = loader.load();

            Scene scene = new Scene(root);

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleImportAction(ActionEvent event) {
        labelImportStatus.setText("Relatório importado com sucesso!");
    }

    @FXML
    void navigateToEmployeePage(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EmployeePage.fxml"));
            Parent root = loader.load();
            EmployeePageController employeeController = loader.getController();
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Stage newStage = new Stage();

            employeeController.setCpfText(loginPageController.getCpfText());

            // Set the current stage as the current stage
            employeeController.setStage(newStage);

            // Set the previous stage
            employeeController.setPreviousStage(currentStage);

            Scene scene = new Scene(root);
            newStage.setScene(scene);
            newStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
