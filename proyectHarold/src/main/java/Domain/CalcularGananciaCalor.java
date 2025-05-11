package Domain;

public class CalcularGananciaCalor {

    public static double calcular(double eficienciaPanel,
                                  double potenciaElectrica,
                                  double potenciaRadiacionSolar)
    {
        eficienciaPanel = potenciaElectrica / potenciaRadiacionSolar;
        return eficienciaPanel;
    }
}
