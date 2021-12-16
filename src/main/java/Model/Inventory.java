package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Inventory {
    private static final ObservableList<Part> allParts = FXCollections.observableArrayList();

    private static final ObservableList<Product> allProducts = FXCollections.observableArrayList();

    public static void addPart(Part part) {
        allParts.add(part);
    }
    public static ObservableList<Part> getAllParts() {
        return allParts;
    }

    public static void addProduct(Product product) {
        allProducts.add(product);
    }

    public static ObservableList<Product> getAllProducts() {
        return allProducts;
    }
}
