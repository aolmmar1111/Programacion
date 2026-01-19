package tarea4;

public class Estudiante {
    // Declaramos las variables necesarias para el Objeto
    private String nombre,curso;
    private int idEstudiante;
    private double notaMedia;

    public Estudiante (String nombre, String curso, int idEstudiante){
        // Inicializamos las variables con los datos dados por
        // el usuario
        this.curso = curso;
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.notaMedia = 0.0;
    }

    // Sobreescribimos el toString()
    @Override
    public String toString() {
        return "Estudiante: " + this.nombre + " (ID: " + this.idEstudiante + "), Curso:" +
        this.curso + ",Nota Media:" + this.notaMedia;
    }

    // Setters de notaMedia y Curso

    // Este tiene un filtro donde si el usuario introduce un numero que no
    // está entre 0.0 y 10.0 simplemente no lo actualizaremos
    public void setNotaMedia (double notaMedia){
        if (notaMedia >= 0.0 && notaMedia <= 10.0) {
            this.notaMedia = notaMedia;
        }
    }
    // Aqui no haremos ningun filtro
    public void setCurso (String curso){
        this.curso = curso;
    }

    // Getter de todas las variables
    public int getIdEstudiante (){
        return this.getIdEstudiante();
    }
    public String getCurso(){
        return this.getCurso();
    }
    public String getNombre(){
        return this.getCurso();
    }
    public double getNotaMedia (){
        return this.notaMedia;
    }
    // Metodo que devuelve true o false
    // si la nota media es 5 o mayor
    public boolean aprobado(){
        return notaMedia >= 5.0;
    }
}
