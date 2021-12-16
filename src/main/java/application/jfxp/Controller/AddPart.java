package application.jfxp.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AddPart {

    public Label changeToCompany;
    Stage stage;
    Parent scene;


    @FXML
    private TextField MaxTxt;

    @FXML
    private RadioButton inHouseBtn;

    @FXML
    private TextField machineIdTxt;

    @FXML
    private TextField minTxt;

    @FXML
    private TextField nameTxt;

    @FXML
    private RadioButton outsourcedBtn;

    @FXML
    private TextField partIdTxt;

    @FXML
    private TextField priceTxt;

    @FXML
    void onActionCancel(ActionEvent event) throws IOException {
        stage = (Stage) ((Button)event.getSource()).getScene().getWindow();
        scene = FXMLLoader.load(getClass().getResource("/application/jfxp/Main-form.fxml"));
        //FXMLLoader fxmlLoader = new FXMLLoader(MainJava.class.getResource("View.Add-Part.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 1002, 779);
        stage.setScene(new Scene(scene));
        stage.show();
    }

    @FXML
    void OnActionChange(ActionEvent event) {
        changeToCompany.setText("Company Name");

    }

    @FXML
    void onActionChangeInhouse(ActionEvent event) {
        changeToCompany.setText("Machine ID");
    }


    @FXML
    void onActionSavePart(ActionEvent event) {

    }
}
