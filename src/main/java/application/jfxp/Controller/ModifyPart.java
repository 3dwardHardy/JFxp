package application.jfxp.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.controlsfx.control.action.Action;

import java.io.IOException;

public class ModifyPart {
public Label ModMachine;
    Stage stage;
    Parent scene;
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
    void onActionMChange(ActionEvent event) {
        ModMachine.setText("Company Name");
    }

    @FXML
    void onActionMInhouseChange(ActionEvent event) {
        ModMachine.setText("Machine ID");
    }
}
