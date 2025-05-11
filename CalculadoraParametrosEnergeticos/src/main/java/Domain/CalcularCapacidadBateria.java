package Domain;

public class CalcularCapacidadBateria {

    public static double calcular (
                            double autonomia,
                            double energiaRealRequerida,
                            double rend,
                            double desc){

        return (autonomia * energiaRealRequerida) / (rend * desc);
    }
}
