package Estudiante;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

import libro.Libro;

public class ListaPrestamo {
    private ArrayList<Prestamo> listaPrestamo;
    
    public ListaPrestamo (){
        listaPrestamo = new ArrayList<>();
    }

    public void Guardar(Prestamo prestamo){
        this.listaPrestamo.add(prestamo);
    }

    public void BorrarPrestamo(Prestamo prestamo){
        this.listaPrestamo.remove(prestamo);
    }
    
    public void BorrarPrestamo(int index){
        this.listaPrestamo.remove(index);
    }

    public void ModificarPrestamo(int index, Prestamo prestamo){
        this.listaPrestamo.set(index, prestamo);
    }

    public void ModificarPrestamo(int id, Estudiante estudiante){
        for (Prestamo prestamo : listaPrestamo) {
            if (prestamo.getId() == id) {
                prestamo.setEst1(estudiante);
                break;
            }            
        }
    }

    public Prestamo BuscarPrestamoPorID (int id){
        for (Prestamo prestamo : listaPrestamo) {
            if (prestamo.getId() == id) {
                return prestamo;
            }
        }
        return null;
    }

    public ArrayList<Prestamo> BuscarPrestamosDeUnLibro (Libro libro){
        ArrayList<Prestamo> aux = new ArrayList<>();
        for (Prestamo prestamo : listaPrestamo) {
            if (prestamo.getL1() == libro) {
                aux.add(prestamo);
            }
        }
        return aux;
    }

    public ArrayList<Prestamo> BuscarPrestamosDeUnEstudiate (Estudiante estudiante){
        ArrayList<Prestamo> aux = new ArrayList<>();
        for (Prestamo prestamo : aux) {
            if (prestamo.getEst1() == estudiante) {
                aux.add(prestamo);
            }
        }
        return aux;
    }

    public ArrayList<Prestamo> BuscarPrestamosVencidos (){
        ArrayList<Prestamo> aux = new ArrayList<>();
        for (Prestamo prestamo : aux) {
            if (prestamo.getFechaDevolucion().isBefore(LocalDate.now())) {
                aux.add(prestamo);
            }
        }
        return aux;
    }

    public ArrayList<Prestamo> BuscarPrestamoFechaConcreta (LocalDate fecha){
        ArrayList<Prestamo> aux = new ArrayList<>();
        for (Prestamo prestamo : aux) {
            if (prestamo.getFechaDevolucion().isBefore(fecha)) {
                aux.add(prestamo);
            }
        }
        return aux;
    }

    public void OrdenarListaPorId (){
        Collections.sort(listaPrestamo, (p1,p2) -> Integer.compare(p1.getId(), p2.getId()));
    }

    public void OrdenarListaPorFechaInicio (){
        Collections.sort(listaPrestamo, (f1,f2) -> f1.getFechaPrestamo().compareTo(f2.getFechaPrestamo()));
    }

    public void OrdenarListaPorFechaDevolucion (){
        Collections.sort(listaPrestamo, (f1,f2) -> f1.getFechaDevolucion().compareTo(f2.getFechaDevolucion()));
    }

    public void OrdenarListaPorTitulo (){
        Collections.sort(listaPrestamo, (t1,t2) -> t1.getL1().getTitulo().compareTo(t2.getL1().getTitulo()));
    }

    public void OrdenarListaPorNombreAlumno (){
        Collections.sort(listaPrestamo, (t1,t2) -> t1.getEst1().getNombre().compareTo(t2.getEst1().getNombre()));
    }
}
