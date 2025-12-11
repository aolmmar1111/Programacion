package modelo;

import java.time.LocalDate;
import java.util.Scanner;

public class Animal {

    private static final Scanner tec = new Scanner(System.in);

    private LocalDate fechaNacimiento;
    private LocalDate fechaFiltro = LocalDate.parse("01/01/2000");
    private String nombre;
    private int peso;
    private String tipo;
    private String estado;
    private final String [] estados = {"comiendo" , "durmiendo" , "reposando" , "jugando"};
    private final String [] tipos = {"gato" , "perro" , "cobaya" , "periquito" , "lagarto"};

    public Animal(LocalDate fechaNacimiento, String nombre, int peso, String tipo, String estado) {
        this.fechaNacimiento = fechaNacimiento;
        if (fechaNacimiento) {
            
        }
        this.nombre = nombre;
        if (peso > 10 && peso < 100000) {
            this.peso = peso;
        } else {
            throw new IllegalArgumentException("Has introducido un peso no valido");
        }
        for (String tipoArray : tipos) {
            if (tipo.equalsIgnoreCase(tipoArray)) {
                this.tipo = tipo;
                break;
            } else {
                throw new IllegalArgumentException("Has introducido un tipo no valido");
            }
        }

        for (String estadoArray : estados) {
            if (estado.equalsIgnoreCase(estadoArray)) {
                this.estado = estado;
            } else {
                throw new IllegalArgumentException("Has introducido un estado no valido");
            }
        }
    }

    public void  comprobarObjeto (LocalDate fechaNacimiento, String nombre, int peso, String tipo, String estado){
        if (!(fechaNacimiento.isBefore(fechaFiltro) || fechaNacimiento.isAfter(LocalDate.now()))) {
            this.fechaNacimiento = fechaNacimiento;
        } else {
            throw new IllegalArgumentException("Has introducido una fecha invalida");
        }
        
        if (peso > 10 && peso < 100000) {
            this.peso = peso;
        } else {
            throw new IllegalArgumentException("Has introducido un peso invalido");
        }

        for (String tipoArray : tipos) {
            if (tipo.equalsIgnoreCase(tipoArray)) {
                this.tipo = tipo;
            }
        }
        
    }
    public Animal() {
        this.fechaNacimiento = LocalDate.now();
        this.nombre = "Manolito";
        this.tipo = "perro";
        this.peso = 25000;
        this.estado = "reposando";
    }

    @Override
    public String toString() {
        return "El nombre de la mascota" + this.nombre +  " la fecha de nacimiento es " 
        + this.fechaNacimiento + " es un " + this.tipo 
        + " pesa un total de " + this.peso + " gramos y ahora mismo esta " + this.estado ;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        if (!((fechaNacimiento.isBefore(fechaFiltro)) || (fechaNacimiento.isAfter(fechaFiltro)))) {
            this.fechaNacimiento = fechaNacimiento;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        if (peso < 100000 && peso > 10) {
            this.peso = peso;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado (String estado){
        for (int i = 0; i < estados.length; i++) {
            if (estado.equalsIgnoreCase(estados[i])) {
                this.estado = estado;
            }
        }
        
    }

    public void comer(double cantidadGramos) {
        if (cantidadGramos < 0) {
            cantidadGramos = cantidadGramos * -1;
        }
        this.peso += cantidadGramos;
        this.estado = "comiendo";
    }

    public void dormir() {
        this.estado = "durmiendo";
    }

    public void despertar() {
        this.estado = "reposando";
    }

    public void descansar() {
        this.estado = "reposando";
    }

    public void jugar(int cantidadMinutos) {
        if (cantidadMinutos < 0) {
            cantidadMinutos = cantidadMinutos * -1;
        }
        if (cantidadMinutos > 180) {
            throw new IllegalArgumentException("Has superado el maximo de minutos (180)");
        } else {
            this.estado = "jugando";
            do {
                if (cantidadMinutos < 30) {
                    break;
                } else {
                    cantidadMinutos -= 30;
                    this.peso = (this.peso * 80) / 100;
                }
            } while (cantidadMinutos > 30);
            if (cantidadMinutos > 0 && cantidadMinutos < 30) {
                this.peso = (this.peso * 90) / 100;
            }
        }
    }

    public Animal clonar(Animal pet) {
        if (pet == null) {
            throw new NullPointerException("El valor es null");
        }
        Animal clon = new Animal(pet.getFechaNacimiento(), pet.getNombre(), pet.getPeso(), pet.getTipo(),
                pet.getEstado());
        return clon;
    }
}