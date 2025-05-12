package com.proyect.CalculadoraParametrosEnergeticos;

import Domain.CalcularAlturaModulo;
import Domain.CalcularGananciaCalor;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

public class GananciaCalorController {
    public TextArea textResultado;
    public TextArea txtElec;
    public TextArea txtCal;
    public TextArea txtPotSolar;


    public void calcularButton(ActionEvent event) {

        double elec = 0;
        double potSolar = 0;

        boolean excepcion = false;

        try {
            elec = Double.parseDouble(txtElec.getText());
            potSolar = Double.parseDouble(txtPotSolar.getText());


        }catch (Exception e){
            textResultado.setText("Caracteres Invalidos ingrese Numeros Reales");
            excepcion = true;
        }

        double resultado = CalcularGananciaCalor.calcular(elec,potSolar);
        if (!excepcion){
            textResultado.setText(String.valueOf(resultado));;
        }else {
            textResultado.setText("Caracteres Invalidos ingrese Numeros Reales");
        }
    }
}
