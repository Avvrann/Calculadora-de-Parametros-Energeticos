package Domain;

public class CalcularEnergiaGenerada {

    public static double calcular(double energiaGenerada,
                                  double potenciaTotal,
                                  double rendimientoInversor,
                                  double horasSolarPico,
                                  double factorReduccion)
    {
        energiaGenerada = potenciaTotal * horasSolarPico * rendimientoInversor * factorReduccion;
        return energiaGenerada;
    }
}
