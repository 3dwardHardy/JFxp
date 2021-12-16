package application.jfxp;

import Model.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;


public class MainJava extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainJava.class.getResource("Main-form.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1002, 779);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }




    public static void main(String[] args) {



        InHouse part1 = new InHouse(23,"banana",23.00,5,1,5,23);

        Inventory.addPart(part1);

        launch(args);

    }

}