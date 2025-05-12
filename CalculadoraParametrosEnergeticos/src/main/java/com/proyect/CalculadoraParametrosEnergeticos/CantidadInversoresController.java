package com.proyect.CalculadoraParametrosEnergeticos;

import Domain.CalcularCantidadInversores;
import Domain.CalcularPotenciaSistema;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class CantidadInversoresController {
    public TextArea textResultado;
    public TextArea txtPca;
    public TextArea txtFs;

    @FXML
    protected void calcularButton(ActionEvent event) {
        double pca = 0;
        double fs = 0;
        boolean excepcion = false;

        try {
            fs = Double.parseDouble(txtFs.getText());
            pca = Double.parseDouble(txtPca.getText());
        }catch (Exception e){
            textResultado.setText("Caracteres Invalidos ingrese Numeros Reales");
            excepcion = true;
        }

        double resultado = CalcularCantidadInversores.calcular(pca,fs);
        if (!excepcion){
            textResultado.setText(String.valueOf(resultado));;
        }else {
            textResultado.setText("Caracteres Invalidos ingrese Numeros Reales");
        }
    }
}
