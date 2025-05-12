package Domain;

public class CalcularProyeccionNormalPanel {

    public static double calcular(
                                double anguloInclinacion,
                                double longitudModulo)
    {
        return Math.cos(anguloInclinacion) * longitudModulo;
    }
}
