package application.jfxp.Controller;

import Model.Inventory;
import Model.Part;
import Model.Product;
import com.sun.javafx.charts.Legend;
import javafx.beans.property.ObjectProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AddProduct implements Initializable {
    Stage stage;
    Parent scene;

    @FXML
    TableView<Part> tableView;

    @FXML
    private TableColumn<Part, Double> partsCost;

    @FXML
    private TableColumn<Part, Integer> partsId;

    @FXML
    private TableColumn<Part, Integer> partsLevel;

    @FXML
    private TableColumn<Part, String> partsName;


    @FXML
    void onActionCancel(ActionEvent event) throws IOException {
        stage = (Stage) ((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/application/jfxp/Main-form.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tableView.setItems(Inventory.getAllParts());
        partsId.setCellValueFactory(new PropertyValueFactory<>("id"));
        partsName.setCellValueFactory(new PropertyValueFactory<>("name"));
        partsCost.setCellValueFactory(new PropertyValueFactory<>("price"));
        partsLevel.setCellValueFactory(new PropertyValueFactory<>("stock"));


    }
}
