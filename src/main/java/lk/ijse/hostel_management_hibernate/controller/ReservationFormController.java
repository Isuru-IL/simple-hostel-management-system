package lk.ijse.hostel_management_hibernate.controller;

import com.jfoenix.controls.JFXButton;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class ReservationFormController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane ancPaneReservation;

    @FXML
    private JFXButton btnBack;

    @FXML
    private JFXButton btnClear;

    @FXML
    private JFXButton btnDelete;

    @FXML
    private JFXButton btnSave;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private ComboBox<?> cmbPaymentStatus;

    @FXML
    private ComboBox<?> cmbRoomTypeId;

    @FXML
    private ComboBox<?> cmbStudentId;

    @FXML
    private TableColumn<?, ?> colDate;

    @FXML
    private TableColumn<?, ?> colPaymentStatus;

    @FXML
    private TableColumn<?, ?> colResId;

    @FXML
    private TableColumn<?, ?> colRoomTypeId;

    @FXML
    private TableColumn<?, ?> colStId;

    @FXML
    private DatePicker dpDate;

    @FXML
    private ImageView imgSearch;

    @FXML
    private TableView<?> tableReservation;

    @FXML
    private TextField txtResId;

    @FXML
    private TextField txtSearchByReservationId;

    @FXML
    void btnBackOnAction(ActionEvent event) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/view/home_form.fxml"));
        ancPaneReservation.getChildren().clear();
        ancPaneReservation.getChildren().add(load);
    }

    @FXML
    void btnClearOnAction(ActionEvent event) {

    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnSaveOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

    @FXML
    void imgSearchOnMouseClicked(MouseEvent event) {

    }

    @FXML
    void tableStudentOnMouseClicked(MouseEvent event) {

    }

    @FXML
    void txtResIdOKeytypedAction(KeyEvent event) {

    }

    @FXML
    void txtSearchByReservationIdOnAction(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }

}
