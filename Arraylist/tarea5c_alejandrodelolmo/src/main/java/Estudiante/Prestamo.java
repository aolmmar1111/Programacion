package Estudiante;

import java.time.LocalDate;

import libro.Libro;

public class Prestamo {
    private LocalDate fechaPrestamo;
    private final int id;
    private int diasDevolver;
    private LocalDate fechaDevolucion;
    private Libro l1 = new Libro();
    private Estudiante est1;
    public Prestamo(LocalDate fechaPrestamo, Libro l1, Estudiante est1, int id){
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
        this.id = id;
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

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public int getId() {
        return id;
    }

    public int getDiasDevolver() {
        return diasDevolver;
    }

    public void setDiasDevolver(int diasDevolver) {
        this.diasDevolver = diasDevolver;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Libro getL1() {
        return l1;
    }

    public void setL1(Libro l1) {
        this.l1 = l1;
    }

    public Estudiante getEst1() {
        return est1;
    }

    public void setEst1(Estudiante est1) {
        this.est1 = est1;
    }
}
