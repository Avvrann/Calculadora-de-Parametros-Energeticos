package Domain;

public class CalcularDistanciaMinimaModulos {

    public static double calcular(
                                  double latitud,
                                  double alturaModulo)

    {
        double k = 0;
        k = 1 / Math.tan(61 - latitud);
        return k * alturaModulo;

    }
}
