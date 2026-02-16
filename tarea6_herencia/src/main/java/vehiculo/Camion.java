package vehiculo;

public class Camion extends Vehiculo {
    private double pma;
    public Camion (String matricula, String bastidor, Color color, double pma){

        super(matricula,bastidor,Color.AZUL);
        this.pma= pma;
    }
}
