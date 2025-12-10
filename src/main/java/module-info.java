module com.progetto.ingsw.progettotruckscout24 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.progetto.ingsw.progettotruckscout24 to javafx.fxml;
    exports com.progetto.ingsw.progettotruckscout24;
}