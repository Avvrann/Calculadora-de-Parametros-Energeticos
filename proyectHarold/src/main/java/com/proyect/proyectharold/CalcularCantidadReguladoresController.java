package com.proyect.proyectharold;

import Domain.CalcularCantidadPaneles;
import Domain.CalcularCantidadReguladores;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

public class CalcularCantidadReguladoresController {
    public TextArea textResultado;
    public TextArea txtNPp;
    public TextArea txtIP;
    public TextArea txtFms;
    public TextArea txtIreg;

    public void calcularButton(ActionEvent event) {

        double npp = 0;
        double fms = 0;
        double ireg = 0;
        double ip = 0;
        boolean excepcion = false;

        try {
            npp = Double.parseDouble(txtNPp.getText());
            fms = Double.parseDouble(txtFms.getText());
            ireg = Double.parseDouble(txtIreg.getText());
            ip = Double.parseDouble(txtIP.getText());


        }catch (Exception e){
            textResultado.setText("Caracteres Invalidos ingrese Numeros Reales");
            excepcion = true;
        }

        double resultado = CalcularCantidadReguladores.calcular(npp,ip,fms,ireg);
        if (!excepcion){
            textResultado.setText(String.valueOf(resultado));;
        }else {
            textResultado.setText("Caracteres Invalidos ingrese Numeros Reales");
        }
    }
    }

