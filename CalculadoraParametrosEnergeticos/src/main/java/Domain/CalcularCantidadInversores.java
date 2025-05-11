package Domain;

public class CalcularCantidadInversores {

    public static double calcular(double potenciaInversor,
                                  double potenciaCargas,
                                  double factorSimultaneidad)
    {
        potenciaInversor = potenciaCargas * factorSimultaneidad;
        return potenciaInversor;
    }
}
