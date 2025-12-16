module com.progetto.ingsw.progettotruckscout24 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires jdk.jdi;
    requires spring.security.crypto;

    opens com.progetto.ingsw.progettotruckscout24 to javafx.fxml;
    exports com.progetto.ingsw.progettotruckscout24;
    exports com.progetto.ingsw.progettotruckscout24.Controller;
    opens com.progetto.ingsw.progettotruckscout24.Controller to javafx.fxml;
}