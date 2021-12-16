package application.jfxp.Controller;
import Model.Inventory;
import Model.Part;
import Model.Product;
import application.jfxp.MainJava;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import static java.util.Objects.*;

public class MainMController implements Initializable {

    Stage stage;
    Parent scene;


    @FXML
    private TreeTableView<Part> partTableView;

    @FXML
    private TreeTableView<Product> productTableView;

    @FXML
    private TreeTableColumn<Part, Integer> tInvLevel;

    @FXML
    private TreeTableColumn<Product, Integer> tPInvLevel;

    @FXML
    private TreeTableColumn<Part, Double> tPartCost;

    @FXML
    private TreeTableColumn<Part, Integer> tPartId;

    @FXML
    private TreeTableColumn<Part, String> tPartName;

    @FXML
    private TreeTableColumn<Product, Double> tPpriceCost;

    @FXML
    private TreeTableColumn<Product, Integer> tProductID;

    @FXML
    private TreeTableColumn<Product, String> tProductName;

    @FXML
    void onActionAddPart(ActionEvent event) throws IOException {

    stage = (Stage) ((Button)event.getSource()).getScene().getWindow();
    scene = FXMLLoader.load(getClass().getResource("/application/jfxp/Add-Part.fxml"));
        //FXMLLoader fxmlLoader = new FXMLLoader(MainJava.class.getResource("View.Add-Part.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 1002, 779);
    stage.setScene(new Scene(scene));
    stage.show();

    }
    @FXML
    void onActionExit(ActionEvent event) {
    System.exit(0);
    }



    @FXML
    void onActionModify(ActionEvent event) throws IOException{
        stage = (Stage) ((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/application/jfxp/Modify-Part.fxml"));
        //FXMLLoader fxmlLoader = new FXMLLoader(MainJava.class.getResource("View.Add-Part.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 1002, 779);
        stage.setScene(new Scene(scene));
        stage.show();
    }

    @FXML
    void onActionPAdd(ActionEvent event) throws IOException {
        stage = (Stage) ((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/application/jfxp/Add-Product.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();

    }

    @FXML
    void onActionPModify(ActionEvent event) throws IOException {
        stage = (Stage) ((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/application/jfxp/Modify-Product.fxml"));
        stage.setScene(new Scene(scene));
        stage.show();

    }

    @FXML
    void onActionPRemove(ActionEvent event) {

    }

    @FXML
    void onActionRemove(ActionEvent event) {

    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}


