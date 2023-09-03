package lk.ijse.hostel_management_hibernate.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HomeFormController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane ancrpHome;

    @FXML
    private Button btnReservation;

    @FXML
    private Button btnRoom;

    @FXML
    private Button btnStudent;

    @FXML
    void btnReservationOnAction(ActionEvent event) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/view/reservationPage_form.fxml"));
        ancrpHome.getChildren().clear();
        ancrpHome.getChildren().add(load);
    }

    @FXML
    void btnRoomOnAction(ActionEvent event) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/view/roomPage_form.fxml"));
        ancrpHome.getChildren().clear();
        ancrpHome.getChildren().add(load);
    }

    @FXML
    void btnStudentOnAction(ActionEvent event) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/view/studentPage_form.fxml"));
        ancrpHome.getChildren().clear();
        ancrpHome.getChildren().add(load);
    }

    @FXML
    void imgLogoutOnMouseClicked(MouseEvent event) throws IOException {

        Stage stage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/view/loginPage_form.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(HomeFormController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Login Form");
        ancrpHome.getScene().getWindow().hide();
        stage.show();

    }

    @FXML
    void imgSettingOnMouseClicked(MouseEvent event) {
        Stage stage = new Stage();
        stage.resizableProperty().setValue(false);
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/changeUserDetail_form.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    void initialize() {

    }

}
