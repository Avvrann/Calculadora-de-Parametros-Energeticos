package Domain;

public class CalcularGananciaCalor {

    public static double calcular(
                                  double potenciaElectrica,
                                  double potenciaRadiacionSolar)
    {
        return potenciaElectrica / potenciaRadiacionSolar;
    }
}
