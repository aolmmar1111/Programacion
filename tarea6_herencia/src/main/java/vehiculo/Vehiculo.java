package vehiculo;

public class Vehiculo {
    private double pma;
    private String matricula;
    private String bastidor;
    private Color color;


    public Vehiculo (String matricula, String bastidor, Color color){
        this.matricula = matricula;
        this.bastidor = bastidor;
        this.color = color;
    }
}
