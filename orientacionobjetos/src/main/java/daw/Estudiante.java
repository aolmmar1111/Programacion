package daw;

public class Estudiante {
    private int id;
    private String nombre,curso;
    private double notaMedia;
    
    public Estudiante(int id, String nombre, String curso) {
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
        this.notaMedia = 0.0;
    }


    

    // Metodos getters para consultar los valores
    // de los atributos - siempre publicos
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCurso() {
        return curso;
    }
    public double getNotaMedia() {
        return notaMedia;
    }

    /// Metodos setters para modificar
    /// los atributos
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
}
