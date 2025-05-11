package Domain;

public class CalcularGananciaCalorHIbrida {

    public static double calcular(double eficienciaPanel,
                                  double potenciaElectrica,
                                  double potenciaCalorifica,
                                  double potenciaRadiacionSolar
                                  )
    {
        eficienciaPanel = (potenciaElectrica + potenciaCalorifica) / potenciaRadiacionSolar;
        return eficienciaPanel;
    }
}
