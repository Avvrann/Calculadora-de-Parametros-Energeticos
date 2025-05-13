module com.proyect.CalculadoraParametros {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.proyect.CalculadoraParametrosEnergeticos to javafx.fxml;
    exports com.proyect.CalculadoraParametrosEnergeticos;
}