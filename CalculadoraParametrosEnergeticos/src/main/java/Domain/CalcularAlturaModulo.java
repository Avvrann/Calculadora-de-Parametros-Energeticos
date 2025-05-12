package Domain;

public class CalcularAlturaModulo {

    public static double calcular(
                                  double anguloInclinacion,
                                  double longitudModulo)
    {
        return Math.sin(anguloInclinacion) * longitudModulo;
    }

}
