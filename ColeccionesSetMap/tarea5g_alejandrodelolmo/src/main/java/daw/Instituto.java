package daw;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Instituto {
    private String nombreCentro;
    private Set<Alumno> listaAlumnos = new HashSet<>();
    private Set<Curso> listaCursos = new HashSet<>();
    private Map<Alumno, Set<Curso>> matriculas = new HashMap<>();

    public Instituto(String nombreCentro, Set<Alumno> listaaAlumnos,Set<Curso>listaCursos){
        this.nombreCentro = nombreCentro;
        this.listaAlumnos = listaaAlumnos;
        this.listaCursos = listaCursos;
    }

    public boolean matricular(String id,Curso curso){
        Alumno auxAlumno = null;
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getId() == id) {
               auxAlumno = alumno;
               break; 
            } 
        }
        if (!listaCursos.contains(curso)) {
            return false;
        }
        this.listaCursos.add(curso);
        matriculas.replace(auxAlumno, listaCursos);
        return true;
    }


}
