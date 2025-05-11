package Domain;

public class CalcularCantidadReguladores {

    public static double calcular(
                                  double cantidadPaneles,
                                  double corrienteMaxima,
                                  double factorMargen,
                                  double corrienteMaximaRegulador)
    {
        return  cantidadPaneles * corrienteMaxima + (cantidadPaneles * corrienteMaxima * factorMargen) / corrienteMaximaRegulador;
    }
}
