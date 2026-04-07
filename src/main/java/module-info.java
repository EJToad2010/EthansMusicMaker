module com.jung.ethansmusicmaker {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.jung.ethansmusicmaker to javafx.fxml;
    exports com.jung.ethansmusicmaker;
}