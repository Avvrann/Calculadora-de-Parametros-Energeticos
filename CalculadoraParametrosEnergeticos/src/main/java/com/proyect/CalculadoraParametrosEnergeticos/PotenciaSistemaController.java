package com.proyect.CalculadoraParametrosEnergeticos;

import Domain.CalcularPotenciaSistema;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class PotenciaSistemaController {
    public TextArea textResultado;
    public TextArea txtEficienciaSistema;
    public TextArea txtHSP;
    public TextArea txtConsumo;

    @FXML
    protected void calcularButton(ActionEvent event) {
        double hsp = 0;
        double eficienciaSistema = 0;
        double consumoDiario = 0;
        boolean excepcion = false;

        try {
            hsp = Double.parseDouble(txtHSP.getText());
            consumoDiario = Double.parseDouble(txtConsumo.getText());
            eficienciaSistema = Double.parseDouble(txtEficienciaSistema.getText());
        }catch (Exception e){
            textResultado.setText("Caracteres Invalidos ingrese Numeros Reales");
            excepcion = true;
        }

        double resultado = CalcularPotenciaSistema.calcular(hsp,eficienciaSistema,consumoDiario);
        if (!excepcion){
            textResultado.setText(String.valueOf(resultado));;
        }else {
            textResultado.setText("Caracteres Invalidos ingrese Numeros Reales");
        }
    }
}
