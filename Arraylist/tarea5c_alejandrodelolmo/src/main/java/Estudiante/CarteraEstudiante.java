package Estudiante;

import java.util.ArrayList;

public class CarteraEstudiante {
    private ArrayList<Estudiante> carteraEstudiante;

    public CarteraEstudiante(){
        carteraEstudiante = new ArrayList<>();
    }

    public void añadir(Estudiante estudiante){
        carteraEstudiante.add(estudiante);
    }

    public void borrar(int pos){
        carteraEstudiante.remove(pos);
    }

    public void borrar (String dni){
        for (Estudiante estudiante : carteraEstudiante) {
            if (estudiante.getDni().matches(dni)){
                carteraEstudiante.remove(estudiante);
            }
        }
    }

    public void borrar(Estudiante estudiante){
        carteraEstudiante.remove(estudiante);
    }

    public int buscar(Estudiante estudiante){
        return carteraEstudiante.indexOf(estudiante);
    }

    public void imprimir(){
        for (Estudiante estudiante : carteraEstudiante) {
            System.out.println(estudiante);
        }
    }


}
