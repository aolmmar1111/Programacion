package modelo;

public class Persona {
    private String nombre;
    private int edad;

    public Persona (){
        this.nombre = "Pepe";
        this.edad = 25;
    }
    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString (){
        return "La persona " + this.nombre + " tiene " + this.edad + " años";
    }

    public void llamar(Animal pet){
        pet.despertar();
    }

    public void alimentar(Animal pet, double cantidadGramos){
        pet.comer(cantidadGramos);
    }

    public void jugar (Animal pet, int cantidadMinutos){
        try {
            pet.jugar(cantidadMinutos);
        } catch (IllegalArgumentException iae) {
            pet.jugar(180);
        }
    }
}
