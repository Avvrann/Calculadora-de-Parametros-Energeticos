package Domain;

public class CalcularProyeccionNormalPanel {

    public static double calcular(double proyeccionNormalPanel,
                                double anguloInclinacion,
                                double longitudModulo)
    {
        proyeccionNormalPanel = Math.cos(anguloInclinacion) * longitudModulo;
        return proyeccionNormalPanel;
    }
}
