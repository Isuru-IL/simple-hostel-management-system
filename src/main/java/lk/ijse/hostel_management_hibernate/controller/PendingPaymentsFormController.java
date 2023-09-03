package lk.ijse.hostel_management_hibernate.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import lk.ijse.hostel_management_hibernate.projection.CustomProjection;
import lk.ijse.hostel_management_hibernate.service.ServiceFactory;
import lk.ijse.hostel_management_hibernate.service.custom.PendingPaymentsService;
import lk.ijse.hostel_management_hibernate.view.tm.StudentKeyMoneyTM;

public class PendingPaymentsFormController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane ancPanePendingPayments;

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colContacts;

    @FXML
    private TableColumn<?, ?> colKeyMoney;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colResDate;

    @FXML
    private TableColumn<?, ?> colResId;

    @FXML
    private TableColumn<?, ?> colStId;

    @FXML
    private TableView<StudentKeyMoneyTM> tableStudentKeyMoney;

    private PendingPaymentsService pendingPaymentsService = ServiceFactory.getServiceFactory().getService(ServiceFactory.ServiceTypes.KEY_MONEY_STUDENT);

    @FXML
    void tablePendingPayOnMouseClicked(MouseEvent event) {

    }

    @FXML
    void initialize() {
        //setDataToTableView();
        //setCellValueFactory();
    }

    private void setCellValueFactory() {
        colStId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colContacts.setCellValueFactory(new PropertyValueFactory<>("studentContact"));
        colResId.setCellValueFactory(new PropertyValueFactory<>("res_id"));
        colResDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        colKeyMoney.setCellValueFactory(new PropertyValueFactory<>("key_money"));

    }

    private void setDataToTableView() {
        ObservableList<CustomProjection> customProjections =pendingPaymentsService.getDetailsToTableView();
        ObservableList<StudentKeyMoneyTM> obList = FXCollections.observableArrayList();

        for (CustomProjection cp : customProjections) {
            obList.add(new StudentKeyMoneyTM(
                    cp.getResId(),
                    cp.getStudentId(),
                    cp.getStudentName(),
                    cp.getAddress(),
                    cp.getStudentContact(),
                    cp.getResDate(),
                    cp.getKeyMoney()
            ));
        }
        tableStudentKeyMoney.setItems(obList);
    }

}
