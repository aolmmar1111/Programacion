package daw;

public class Persona {
    private String nombre;
    private String nif;
    private int edad;

    public Persona (){
        this.nombre = "Alejandro del olmo";
        this.nif = "76548343K";
        this.edad = 20;
    }

    public Persona (String nombre, String nif, int edad){
        this.nombre = nombre;
        this.nif = nif;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " , NIF: " + this.nif  + ", Edad: " + this.edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}