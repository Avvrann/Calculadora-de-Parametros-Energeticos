package com.proyect.CalculadoraParametrosEnergeticos;

import Domain.CalcularEnergiaGenerada;
import Domain.CalcularNumeroInversores;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

public class EnergiaGeneradaController {
    public TextArea textResultado;
    public TextArea txtPotenciaSistema;
    public TextArea txtRendimiento;
    public TextArea txtHSP;
    public TextArea txtFred;


    public void calcularButton(ActionEvent event) {

        double potenciaSistema = 0;
        double potenciaRendimiento = 0;
        double hsp = 0;
        double fred = 0;

        boolean excepcion = false;

        try {
            potenciaSistema = Double.parseDouble(txtPotenciaSistema.getText());
            fred = Double.parseDouble(txtFred.getText());
            hsp = Double.parseDouble(txtHSP.getText());
            potenciaRendimiento = Double.parseDouble(txtRendimiento.getText());

        }catch (Exception e){
            textResultado.setText("Caracteres Invalidos ingrese Numeros Reales");
            excepcion = true;
        }

        double resultado = CalcularEnergiaGenerada.calcular(potenciaSistema,potenciaRendimiento,hsp,fred);
        if (!excepcion){
            textResultado.setText(String.valueOf(resultado));;
        }else {
            textResultado.setText("Caracteres Invalidos ingrese Numeros Reales");
        }
    }
}
