package daw;

public class Curso {
    private String id;
    private String nombre;
    private int numeroHoras;

    public Curso (String id, String nombre, int numeroHoras){
        this.id = id;
        this.nombre = id;
        this.numeroHoras = numeroHoras;
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

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }
}
