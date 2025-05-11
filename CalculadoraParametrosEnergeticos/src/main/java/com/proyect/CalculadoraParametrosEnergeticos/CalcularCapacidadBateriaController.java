package com.proyect.CalculadoraParametrosEnergeticos;

import Domain.CalcularCantidadPaneles;
import Domain.CalcularCapacidadBateria;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

public class CalcularCapacidadBateriaController {
    public TextArea textResultado;
    public TextArea txtRend;
    public TextArea txtEt;
    public TextArea txtAutono;
    public TextArea txtDesc;

    public void calcularButton(ActionEvent event) {

        double autonomia = 0;
        double desc = 0;
        double rend = 0;
        double et = 0;
        boolean excepcion = false;
        try {


            autonomia = Double.parseDouble(txtAutono.getText());
            desc = Double.parseDouble(txtDesc.getText());
            et = Double.parseDouble(txtEt.getText());
            rend = Double.parseDouble(txtRend.getText());


        } catch (Exception e) {
            textResultado.setText("Caracteres Invalidos ingrese Numeros Reales");
            excepcion = true;
        }

        double resultado = CalcularCapacidadBateria.calcular(autonomia,et,rend,desc);
        if (!excepcion) {
            textResultado.setText(String.valueOf(resultado));
            ;
        } else {
            textResultado.setText("Caracteres Invalidos ingrese Numeros Reales");
        }
    }
}
