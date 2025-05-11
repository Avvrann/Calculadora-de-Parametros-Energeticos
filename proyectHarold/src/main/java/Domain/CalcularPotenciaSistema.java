package Domain;

public class CalcularPotenciaSistema {

    public static double calcular(
                        double horasSolPico,
                        double eficienciaSistema,
                        double consumoDiario){

        return consumoDiario / (horasSolPico * eficienciaSistema);
    }
}
