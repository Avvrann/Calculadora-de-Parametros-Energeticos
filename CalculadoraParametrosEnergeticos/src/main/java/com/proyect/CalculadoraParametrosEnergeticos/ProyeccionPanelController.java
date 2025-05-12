package com.proyect.CalculadoraParametrosEnergeticos;

import Domain.CalcularEnergiaGenerada;
import Domain.CalcularProyeccionNormalPanel;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

public class ProyeccionPanelController {
    public TextArea textResultado;
    public TextArea txtAngulo;
    public TextArea txtLongitud;


    public void calcularButton(ActionEvent event) {

        double angulo = 0;
        double longitud = 0;

        boolean excepcion = false;

        try {
            angulo = Double.parseDouble(txtAngulo.getText());
            longitud = Double.parseDouble(txtLongitud.getText());

        }catch (Exception e){
            textResultado.setText("Caracteres Invalidos ingrese Numeros Reales");
            excepcion = true;
        }

        double resultado = CalcularProyeccionNormalPanel.calcular(angulo,longitud);
        if (!excepcion){
            textResultado.setText(String.valueOf(resultado));;
        }else {
            textResultado.setText("Caracteres Invalidos ingrese Numeros Reales");
        }
    }
}
