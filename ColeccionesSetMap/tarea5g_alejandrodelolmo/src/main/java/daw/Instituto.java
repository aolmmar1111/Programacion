package daw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Instituto {
    private String nombreCentro;
    private Alumno auxAlumno = null;
    private Curso auxCurso = null;
    private Set<Alumno> listaAlumnos;
    private Set<Curso> listaCursos;
    private Map<Alumno, Set<Curso>> matriculas;
    public char[] getListaCursoDeAlumno;

    public Instituto(String nombreCentro, Set<Alumno> listaAlumnos,Set<Curso>listaCursos){
        this.nombreCentro = nombreCentro;
        this.listaAlumnos = new HashSet(listaAlumnos);
        this.listaCursos = new HashSet<>(listaCursos);
        this.matriculas = new HashMap<>();
    }

    public boolean matricular(String id,Curso curso){
        Set<Curso> auxCursos = new HashSet<>();
        if(!comprobarAlumno(id, curso)){
            return false;
        }
        auxCursos.add(curso);
        if (matriculas.containsKey(auxAlumno)) {
            matriculas.replace(auxAlumno, auxCursos);
        } else {
            matriculas.put(auxAlumno, auxCursos);
        }
        return true;
    }


    public boolean desmatricular(String id,Curso curso){
        if (!comprobarAlumno(id, curso)){
            return false;
        }
        if (matriculas.containsValue(curso)) {
            this.matriculas.get(auxAlumno).remove(curso);
        }
        else {
            matriculas.remove(auxAlumno);
            auxAlumno = null;
        }
        return true;
    }

    public Set<Curso> getListaCursoDeAlumno (String id){
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getId().equalsIgnoreCase(id)){
                auxAlumno = alumno;
            }
        }
        return matriculas.get(auxAlumno);
    }

    public Set getListaAlumnoDeCurso (String idCurso){
        Set<Curso> listaAlumnosCurso = new HashSet<>();
        for (Curso curso : listaAlumnosCurso) {
            if (curso.getId().equalsIgnoreCase(idCurso)) {
                auxCurso = curso;
            }
        }

        return null;
        // for (Alumno alumno : matriculas.keySet()) {
        //     if (matriculas.containsValue(auxCurso)) {
                
        //     }
        // }
    }

    public boolean comprobarAlumno(String id,Curso curso){
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getId().equalsIgnoreCase(id)) {
               auxAlumno = alumno;
               break; 
            }   
        }
        if (!listaCursos.contains(curso)) {
            return false;
        }
        return true;
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public Set<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(Set<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public Set<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(Set<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public Map<Alumno, Set<Curso>> getMatriculas() {
        return matriculas;
    }

    

}
