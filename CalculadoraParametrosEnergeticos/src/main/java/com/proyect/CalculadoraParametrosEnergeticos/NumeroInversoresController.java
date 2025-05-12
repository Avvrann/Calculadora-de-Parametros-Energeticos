package com.proyect.CalculadoraParametrosEnergeticos;

import Domain.CalcularCantidadPaneles;
import Domain.CalcularNumeroInversores;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

public class NumeroInversoresController {
    public TextArea textResultado;
    public TextArea txtPotencia;
    public TextArea txtNominal;


    public void calcularButton(ActionEvent event) {

        double potencia = 0;
        double potenciaNominal = 0;
        boolean excepcion = false;

        try {
            potencia = Double.parseDouble(txtPotencia.getText());
            potenciaNominal = Double.parseDouble(txtNominal.getText());
        }catch (Exception e){
            textResultado.setText("Caracteres Invalidos ingrese Numeros Reales");
            excepcion = true;
        }

        double resultado = CalcularNumeroInversores.calcular(potencia,potenciaNominal);
        if (!excepcion){
            textResultado.setText(String.valueOf(resultado));;
        }else {
            textResultado.setText("Caracteres Invalidos ingrese Numeros Reales");
        }
    }
}
