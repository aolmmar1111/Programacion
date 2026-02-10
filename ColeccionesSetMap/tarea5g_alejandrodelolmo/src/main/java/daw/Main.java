package daw;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Alumno> listaAlumnos = new HashSet<>();
        Set<Curso> listacursos = new HashSet<>();

        Alumno alumno = new Alumno("1", "Fran", "123123123");
        Curso curso = new Curso("1", "Badat", 10);
        listaAlumnos.add(alumno);
        listacursos.add(curso);
        Instituto instituto1 = new Instituto("Mar de alboran", listaAlumnos, listacursos);
        System.out.println(instituto1.getListaAlumnoDeCurso("1"));
        System.out.println(instituto1.getNombreCentro());
        instituto1.matricular("1", curso);
        
        for (Curso curso2 : instituto1.getListaCursoDeAlumno("1")) {

            System.out.println(curso2.getNombre());
        }

        System.out.println(instituto1.getListaAlumnos());
    }    
}
