module app.mupit.appmvc {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
//    requires javafx.swing;
    requires javafx.web;

    requires org.kordamp.bootstrapfx.core;
//    requires eu.hansolo.tilesfx;

    opens app.mupit.appmvc to javafx.fxml;
    exports app.mupit.appmvc;
    exports app.mupit.appmvc.controllers;
    opens app.mupit.appmvc.controllers to javafx.fxml;
}