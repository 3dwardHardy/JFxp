module application.jfxp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens application.jfxp to javafx.fxml;
    exports application.jfxp;
    exports application.jfxp.Controller;
    opens application.jfxp.Controller to javafx.fxml;
}