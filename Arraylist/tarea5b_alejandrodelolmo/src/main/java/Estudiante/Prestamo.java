package Estudiante;

import libro.Libro;

import java.time.LocalDate;

public class Prestamo {
    private LocalDate fechaPrestamo;
    private int diasDevolver;
    private LocalDate fechaDevolucion;
    private Libro l1 = new Libro();
    private Estudiante est1;
    public Prestamo(LocalDate fechaPrestamo, Libro l1, Estudiante est1){
        if (l1.equals(null)){
            throw new IllegalArgumentException("Has introducido un libro que no existe");
        }
        if (est1.equals(null)){
            throw new IllegalArgumentException("Has introducido un estudiante que no existe");
        }
        this.l1 = l1;
        this.est1 = est1;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaPrestamo.plusDays(diasDevolver);

    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "fechaPrestamo=" + fechaPrestamo +
                ", fechaDevolucion=" + fechaDevolucion +
                ", l1=" + l1 +
                ", est1=" + est1 +
                '}';
    }
}
