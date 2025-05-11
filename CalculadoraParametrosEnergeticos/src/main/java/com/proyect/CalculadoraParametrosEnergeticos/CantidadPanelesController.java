package com.proyect.CalculadoraParametrosEnergeticos;

import Domain.CalcularCantidadPaneles;
import Domain.CalcularPotenciaSistema;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

public class CantidadPanelesController {
    public TextArea textResultado;
    public TextArea txtPotenciaPanel;
    public TextArea txtPotenciaSistema;

    public void calcularButton(ActionEvent event) {

        double potenciaPanel = 0;
        double potenciaSistema = 0;
        boolean excepcion = false;

        try {
            potenciaPanel = Double.parseDouble(txtPotenciaPanel.getText());
            potenciaSistema = Double.parseDouble(txtPotenciaSistema.getText());
        }catch (Exception e){
            textResultado.setText("Caracteres Invalidos ingrese Numeros Reales");
            excepcion = true;
        }

        double resultado = CalcularCantidadPaneles.calcular(potenciaSistema,potenciaPanel);
        if (!excepcion){
            textResultado.setText(String.valueOf(resultado));;
        }else {
            textResultado.setText("Caracteres Invalidos ingrese Numeros Reales");
        }
    }
}
