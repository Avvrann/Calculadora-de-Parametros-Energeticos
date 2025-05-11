package com.proyect.CalculadoraParametrosEnergeticos;

import javafx.animation.FadeTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private ComboBox <String> comboBox;

    @FXML
    private AnchorPane anchorPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        ObservableList<String> opciones = FXCollections.observableArrayList(

                "P del Sistema",
                "Cantidad de Paneles",
                "Capacidad de Bateria",
                "Numero de Baterias",
                "Cantidad de Reguladores",
                "Cantidad de Inversores",
                "Numero de Inversores",
                "Energia Generada",
                "Proyeccion del Panel",
                "Altura del Modulo FV",
                "Distancia minima entre Modulos",
                "Ganancia de Calor"

        );
        comboBox.setItems(opciones);

        comboBox.setOnAction(event -> {
            String seleccion = comboBox.getValue();
            if (seleccion != null) {
                cargarPanel(seleccion);
            }
        });
    }

    private void cargarPanel(String nombrePanel) {
        try {
            String rutaFXML = "";
            switch (nombrePanel) {
                case "P del Sistema":
                    rutaFXML = "PotenciaSistemaPanel.fxml";
                    break;
                case "Cantidad de Paneles":
                    rutaFXML = "CantidaPaneles.fxml";
                    break;
                case "Capacidad de Bateria":
                    rutaFXML = "CalcularCapacidadBateria.fxml";
                    break;
                case "Numero de Baterias":
                case "Cantidad de Reguladores":
                    rutaFXML = "CantidadReguladores.fxml";
                    break;
                case "Cantidad de Inversores":
                case "Numero de Inversores":
                case "Energia Generada":
                case "Proyeccion del Panel":
                case "Altura del Modulo FV":
                case "Distancia minima entre Modulos":
                case "Ganancia de Calor":
                    rutaFXML = "panel2.fxml";
                    break;
                default:
                    throw new IllegalArgumentException("Panel no reconocido");
            }

            // Cargar el FXML del panel seleccionado
            FXMLLoader loader = new FXMLLoader(getClass().getResource(rutaFXML));
            AnchorPane nuevoPanel = loader.load();

            // Ajustar el panel al tamaño del contenedor
            AnchorPane.setTopAnchor(nuevoPanel, 0.0);
            AnchorPane.setBottomAnchor(nuevoPanel, 0.0);
            AnchorPane.setLeftAnchor(nuevoPanel, 0.0);
            AnchorPane.setRightAnchor(nuevoPanel, 0.0);

            // Establecer opacidad inicial para la animación
            nuevoPanel.setOpacity(0);

            // Limpiar el contenedor y añadir el nuevo panel
            anchorPane.getChildren().setAll(nuevoPanel);

            // Crear y reproducir la transición de desvanecimiento
            FadeTransition fadeIn = new FadeTransition(Duration.millis(500), nuevoPanel);
            fadeIn.setFromValue(0.0);
            fadeIn.setToValue(1.0);
            fadeIn.play();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}