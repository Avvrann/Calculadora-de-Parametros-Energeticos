module com.proyect.proyectharold {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.proyect.proyectharold to javafx.fxml;
    exports com.proyect.proyectharold;
}