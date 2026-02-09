package daw;

public class Alumno {
    private String id;
    private String nombre;
    private String nif;

    public Alumno (String id, String nombre, String nif){
        this.id = id;
        this.nombre = nombre;
        this.nif = nif;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}