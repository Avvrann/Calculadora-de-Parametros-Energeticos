package Domain;

public class CalcularDistanciaMinimaModulos {

    public static double calcular(double distanciaMinima,
                                  double latitud,
                                  double k,
                                  double alturaModulo)

    {
        k = 1 / Math.tan(61 - latitud);
        distanciaMinima = k * alturaModulo;
        return distanciaMinima;
    }
}
