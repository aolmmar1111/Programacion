package set;

import java.time.LocalDate;
import java.util.Objects;

public class Vaca implements Comparable<Vaca>{
    private int id;
    private LocalDate fechaNacimiento;
    String descripcion;
    public Vaca (int id, LocalDate fechaNacimiento,String descripcion){
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getId() {
        return id;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Vaca{" +
                "id='" + this.id + '\'' +
                ", Fecha de nacimiento='" + this.fechaNacimiento + '\'' +
                ", Descripcion='" + this.descripcion + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        // 1. Verificamos si es la misma instancia en memoria
        if (this == o) return true;

        // 2. Verificamos si el objeto es nulo o de una clase diferente
        if (o == null || getClass() != o.getClass()) return false;

        // 3. Comparamos el atributo identificador (dni)
        Vaca Vaca = (Vaca) o;
        return Objects.equals(id, Vaca.id);
    }    
    
    @Override
    public int hashCode() {
        // Genera un código hash único basado en el contenido del ID
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Vaca vaquita) {
        return Integer.compare(this.id, vaquita.getId());    
    }
    
}