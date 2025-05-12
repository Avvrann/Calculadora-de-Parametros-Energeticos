package com.proyect.CalculadoraParametrosEnergeticos;

import Domain.CalcularAlturaModulo;
import Domain.CalcularEnergiaGenerada;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

public class CalcularAlturaModuloController {
    public TextArea textResultado;
    public TextArea txtAngulo;
    public TextArea txtLongitud;


    public void calcularButton(ActionEvent event) {

        double angulo= 0;
        double longitud = 0;

        boolean excepcion = false;

        try {
            angulo = Double.parseDouble(txtAngulo.getText());
            longitud = Double.parseDouble(txtLongitud.getText());

        }catch (Exception e){
            textResultado.setText("Caracteres Invalidos ingrese Numeros Reales");
            excepcion = true;
        }

        double resultado = CalcularAlturaModulo.calcular(angulo,longitud);
        if (!excepcion){
            textResultado.setText(String.valueOf(resultado));;
        }else {
            textResultado.setText("Caracteres Invalidos ingrese Numeros Reales");
        }
    }
}
