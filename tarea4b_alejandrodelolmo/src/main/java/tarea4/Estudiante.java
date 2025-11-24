package tarea4;

import java.util.Scanner;

public class Estudiante {
    private String nombre,curso;
    private int idEstudiante;
    private double notaMedia;
    private static final Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int numero,idEstudiante,contadorEstudiantes = 0;
        String nombre,curso;
        double notaMedia;
        Estudiante [] arrayEstudiantes = new Estudiante[50];
        do { 
            System.out.println("""
                    Introduce un numero:

                    1- Salir
                    2- Crear un nuevo estudiante
                    3- mostrar un estudiante
                    4- mostrar todos los estudiantes
                    5- introducir nota media
                    """);
            numero = teclado.nextInt();
            teclado.nextLine();
            switch (numero) {
                case 1:
                    
                    break;
                case 2:
                    System.out.println("¿Como se llama el estudiante?");
                    nombre = teclado.nextLine();
                    
                    System.out.println("\n¿A que curso va el estudiante?");
                    curso = teclado.nextLine();

                    System.out.println("¿Cual es el id del estudiante?");
                    idEstudiante = teclado.nextInt();

                    Estudiante estudiante = new Estudiante(nombre, curso, idEstudiante);
                    arrayEstudiantes [contadorEstudiantes] = estudiante;
                    contadorEstudiantes++;
                    break;
                case 3:
                    System.out.println("¿Cual es el id del estudiante?");
                    idEstudiante = teclado.nextInt();
                    int idActual =0,j=0;
                    for (int i = 0; i < arrayEstudiantes.length; i++) {
                        idActual = arrayEstudiantes[i].getEstudiante();
                        j=i;
                        if (idActual == idEstudiante) {
                            break;
                        }
                    }
                    System.out.println(arrayEstudiantes[j].toString());
                    break;

                case 4:
                    for (int i = 0; i < arrayEstudiantes.length; i++) {
                        System.out.println(arrayEstudiantes[i].toString());
                    }
                    break;
                case 5:
                    System.out.println("Introduce el id del estudiante");
                    idEstudiante = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Establece la nota media");
                    notaMedia = teclado.nextDouble();

                    for (int i = 0; i < arrayEstudiantes.length; i++) {
                        if (arrayEstudiantes[i].getEstudiante() == idEstudiante) {
                            arrayEstudiantes[i].setNotaMedia(notaMedia);
                        }
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            
        } while (numero != 1);
    }
    public Estudiante(String nombre, String curso, int idEstudiante) {
        this.nombre = nombre;
        this.curso = curso;
        this.idEstudiante = idEstudiante;
        this.notaMedia = 0.0;


    }
    @Override
    public String toString() {
        return "Estudiante: " + this.nombre + "(ID:" + this.idEstudiante + "), Curso: " + this.curso + ",Nota Media: " + this.notaMedia;
    }

    public int getEstudiante (){
        return this.idEstudiante;
    }
    public String getNombre (){
        return this.nombre;
    }
    public String getCurso (){
        return this.curso;
    }
    public double getNotaMedia (){
        return this.notaMedia;
    }
    public void setNotaMedia (double notaMedia){
        if ((notaMedia >= 0.0) && (notaMedia <= 10.00)) {
            this.notaMedia = notaMedia;
        }
    }
    public void setCurso (String curso){
        this.curso = curso;
    }
    public boolean aprobado(){
        return getNotaMedia() >= 5;
    }
}