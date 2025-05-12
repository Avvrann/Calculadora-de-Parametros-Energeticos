package Domain;

public class CalcularEnergiaGenerada {

    public static double calcular(
                                  double potenciaTotal,
                                  double rendimientoInversor,
                                  double horasSolarPico,
                                  double factorReduccion)
    {
        return potenciaTotal * horasSolarPico * rendimientoInversor * factorReduccion;
    }
}
