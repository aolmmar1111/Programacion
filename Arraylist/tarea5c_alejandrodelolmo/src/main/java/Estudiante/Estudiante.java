package Estudiante;

import java.util.Objects;

public class Estudiante {
    private String nombre;
    private String apellidos;
    private String dni;
    boolean comprobacionDni;
    public Estudiante (String nombre, String apellidos, String dni){
        this.nombre = nombre;
        this.apellidos = apellidos;
        // Comprobamos el DNI si este no está bien ni lo metemos
        if (comprobacionDni(dni)){
            this.dni = dni;
        }
    }

    // toString
    @Override
    public String toString() {
        return "Estudiante{" +
                "dni='" + dni + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        // 1. Verificamos si es la misma instancia en memoria
        if (this == o) return true;

        // 2. Verificamos si el objeto es nulo o de una clase diferente
        if (o == null || getClass() != o.getClass()) return false;

        // 3. Comparamos el atributo identificador (dni)
        Estudiante estudiante = (Estudiante) o;
        return Objects.equals(dni, estudiante.dni);
    }

    @Override
    public int hashCode() {
        // Genera un código hash único basado en el contenido del ISBN
        return Objects.hash(dni);
    }


    // Metodo para comprobar Dni
    public boolean comprobacionDni (String dni){
        char [] letras = dni.toCharArray();
        for (int i = 0; i < letras.length - 1; i++) {
            if (Character.isDigit(letras[i])){
                comprobacionDni = true;
            } else {
                comprobacionDni = false;
                break;
            }
        }
        if (!Character.isLetter(letras[8])){
            comprobacionDni = false;
        }
        if (dni.length() != 9 || comprobacionDni){
            return true;
        } else {
            return false;
        }
    }
}
