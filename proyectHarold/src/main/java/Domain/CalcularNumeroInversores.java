package Domain;

public class CalcularNumeroInversores {

    public static double calcular(double numeroInversores,
                                  double potenciaInversor,
                                  double potenciaNominalInversor)
    {

        numeroInversores = potenciaInversor / potenciaNominalInversor;
        return numeroInversores;
    }
}
