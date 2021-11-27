package com.prototipo.expoware;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class Controller {

    @FXML
    private Button achievpgbtt;

    @FXML
    private Button demobbt3;

    @FXML
    private Button demobtt1;

    @FXML
    private Button demobtt2;

    @FXML
    private Button demobtt4;

    @FXML
    private Button demopgbtt1;

    @FXML
    private Button demopgbtt2;

    @FXML
    private Button demopgbtt3;

    @FXML
    private Button demopgbtt4;

    @FXML
    private Button dlbtt1;

    @FXML
    private Button dlbtt2;

    @FXML
    private Button dlbtt3;

    @FXML
    private Button dlbtt4;

    @FXML
    private Button homebtt;

    @FXML
    private Button userbtt;

    @FXML
    private Button yearbtt2018;

    @FXML
    private Button yearbtt2019;


    @FXML
    private Button yearbtt2020;

    @FXML
    private Button yearbtt2021;

    @FXML
    private Button yearbtt2022;

    @FXML
    private Button premiumpgbtt;

    @FXML
    private Button friendsbtt;

    @FXML
    private Button infopgbtt;



    @FXML
    void userprofile(ActionEvent event) throws IOException {
        Stage stage = (Stage) userbtt.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("user-profile.fxml"));
        stage.setTitle("Expoware");
        stage.setScene(new Scene(root));

        stage.show();

    }

    @FXML
    void homepg(ActionEvent event) throws IOException {
        Stage stage = (Stage) homebtt.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage.setTitle("Expoware");
        stage.setScene(new Scene(root));

        stage.show();
    }

    @FXML
    void achievpg(ActionEvent event) throws IOException {
        Stage stage = (Stage) achievpgbtt.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("achievements.fxml"));
        stage.setTitle("Expoware");
        stage.setScene(new Scene(root));

        stage.show();

    }

    @FXML
    void demopg1(ActionEvent event) throws IOException {
        Stage stage = (Stage) demopgbtt1.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("demopg1.fxml"));
        stage.setTitle("Expoware");
        stage.setScene(new Scene(root));

        stage.show();
    }

    @FXML
    void gotoyear2020(ActionEvent event) throws IOException {
        Stage stage = (Stage) yearbtt2020.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("2020expos.fxml"));
        stage.setTitle("Expoware");
        stage.setScene(new Scene(root));

        stage.show();

    }

    public void displayerror(ActionEvent event) throws IOException {
        Alert error = new Alert(Alert.AlertType.ERROR);
        error.setTitle("Expoware: Error");
        error.setContentText("Feature not accessible");
        Optional<ButtonType> result = error.showAndWait();
    }

    public void notavailable(ActionEvent event) throws IOException{
        Alert error = new Alert(Alert.AlertType.WARNING);
        error.setTitle("Expoware: Not available");
        error.setContentText("There is no information or games for this year");
        Optional<ButtonType> result = error.showAndWait();
    }

    public void gotopremiumpg(ActionEvent event) throws IOException {
        Stage stage = (Stage) premiumpgbtt.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("premiumpg.fxml"));
        stage.setTitle("Expoware");
        stage.setScene(new Scene(root));

        stage.show();
    }


    @FXML
    void toinfopg(ActionEvent event) throws IOException {
        Stage stage = (Stage) infopgbtt.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("infopg.fxml"));
        stage.setTitle("Expoware");
        stage.setScene(new Scene(root));

        stage.show();
    }
}



