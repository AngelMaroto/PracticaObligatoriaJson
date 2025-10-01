module org.example.practicaobligatoriajson {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.fasterxml.jackson.databind;
    requires org.example.practicaobligatoriajson;

    opens org.example.practicaobligatoriajson to javafx.fxml;
    exports org.example.practicaobligatoriajson;
}