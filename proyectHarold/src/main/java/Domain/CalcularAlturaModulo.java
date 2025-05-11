package Domain;

public class CalcularAlturaModulo {

    public static double calcular(double alturaModulo,
                                  double anguloInclinacion,
                                  double longitudModulo)
    {
        alturaModulo = Math.sin(anguloInclinacion) * longitudModulo;
        return  alturaModulo;
    }

}
