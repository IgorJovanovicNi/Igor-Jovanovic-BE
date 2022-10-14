package com.eng.igorjovanovicbe;

import com.eng.igorjovanovicbe.datamodel.DataModel;
import com.eng.igorjovanovicbe.entity.Organization;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    @FXML
    private AnchorPane rootPane;
    @FXML
    private TableView<Organization> tableView;

    @FXML
    private BorderPane mainBorderPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        DataModel.loadOrganizations();

        tableView.setItems(DataModel.getInstance().getOrganization());
        tableView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        tableView.getSelectionModel().selectFirst();
    }

    @FXML
    private void loadFirst(ActionEvent event) throws IOException {
//        BorderPane tempBorderPane= FXMLLoader.load(getClass().getResource("main.fxml"));
        rootPane.getChildren().setAll(tableView);
    }

    @FXML
    private void loadSecond(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("practitioner.fxml"));
        rootPane.getChildren().setAll(pane);
    }
    @FXML
    private void loadThird(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("patient.fxml"));
        rootPane.getChildren().setAll(pane);
    }
    @FXML
    private void loadFourth(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("examination.fxml"));
        rootPane.getChildren().setAll(pane);
    }

}