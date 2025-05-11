package Domain;

public class CalcularNumeroBaterias {

    public static double calcular(double cantidadBaterias,
                                  double capacidadBateria,
                                  double amperios,
                                  double voltaje){


        cantidadBaterias = capacidadBateria / (amperios * voltaje);
        return cantidadBaterias;
    }
}
