package com.proyect.CalculadoraParametrosEnergeticos;

import Domain.CalcularAlturaModulo;
import Domain.CalcularDistanciaMinimaModulos;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

public class DistanciaMinimaController {
    public TextArea textResultado;
    public TextArea txtAngulo;
    public TextArea txtLongitud;
    public TextArea txtLatitud;

    public void calcularButton(ActionEvent event) {

        double longitud = 0;
        double latitud = 0;

        boolean excepcion = false;

        try {
            longitud = Double.parseDouble(txtLongitud.getText());
            latitud = Double.parseDouble(txtLatitud.getText());

        }catch (Exception e){
            textResultado.setText("Caracteres Invalidos ingrese Numeros Reales");
            excepcion = true;
        }

        double resultado = CalcularDistanciaMinimaModulos.calcular(latitud,longitud);
        if (!excepcion){
            textResultado.setText(String.valueOf(resultado));;
        }else {
            textResultado.setText("Caracteres Invalidos ingrese Numeros Reales");
        }
    }
}
