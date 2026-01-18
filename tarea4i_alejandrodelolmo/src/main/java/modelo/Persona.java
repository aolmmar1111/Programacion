package modelo;

public class Persona {
    private String nombre;
    private int edad;
    // Declaramos una constante de los minutos maximos que puede
    // jugar un animal
    private final int MINUTOS_MAXIMOS = 180;

    // Constructor sin parametros
    public Persona (){
        this.nombre = "Pepe";
        this.edad = 25;
    }

    // Constructor con parametros
    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    // Sobreescribimos el toString
    @Override
    public String toString (){
        return "La persona " + this.nombre + " tiene " + this.edad + " años";
    }

    // Función para despertar al animal
    public void llamar(Animal pet){
        pet.despertar();
    }

    // FUnción para alimentar a un animal
    public void alimentar(Animal pet, double cantidadGramos){
        pet.comer(cantidadGramos);
    }


    public void jugar (Animal pet, int cantidadMinutos){
        // Si la cantidad de minutos es mayor a 180 devolvemos un error
        try {
            if (cantidadMinutos > 180){
                throw new IllegalArgumentException();
            } else {
            pet.jugar(cantidadMinutos);
            }
        } 
        // Si el error de percibe entonces simplemente jugaremos por el maximo 
        // permitido que es una constante declarada arriba 
        catch (IllegalArgumentException iae) {
            pet.jugar(MINUTOS_MAXIMOS);
        }
    }
}
