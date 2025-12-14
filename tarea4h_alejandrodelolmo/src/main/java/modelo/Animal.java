package modelo;

import java.time.LocalDate;

public class Animal {
    
    // Declaramos las variables
    private LocalDate fechaNacimiento;
    private String nombre,tipo,estado;
    private int peso;

    // Hacemos unos arrays con los posibles estados y tipos
    // esto nos hará la tarea mas facil por si tenemos que añadir un nuevo
    // tipo o estado, ya que simplemente lo tendremos que añadir al array
    private String [] estados = {"comiendo" , "durmiendo" , "reposando" , "jugando"};
    private String [] tipos = {"gato" , "perro", "cobaya" , "periquito"};

    
    // Creamos el constructor sin parametros que pondremos estos valores de ejemplo
    public Animal (){
        this.estado = "reposando";
        this.nombre = "Mike";
        this.tipo = "perro";
        this.peso = 5000;
        this.fechaNacimiento = LocalDate.of(2014,10,10);
    }

    // Creamos el constructor copia poniendo todos los parametros
    // del objeto introducido en el nuevo objeto
    public Animal (Animal copia){
        this.nombre = copia.nombre;
        this.fechaNacimiento = copia.fechaNacimiento;
        this.estado = copia.estado;
        this.tipo = copia.tipo;
        this.peso = copia.peso;
    }

    // Ahora creamos el constructor parametrizado donde pediremos los 
    // siguiente parametros y con eso construiremos el objeto
    // obviamente comprobaremos si los datos son correctos en los siguientes datos:
    // - Fecha de nacimiento
    // - Tipo
    // - Peso

    public Animal(LocalDate fechaNacimiento, String nombre, String tipo, int peso){
        // Comprobamos que la fecha de nacimiento sea correcta
        if (!(fechaNacimiento.isBefore(LocalDate.of(2000, 1, 1)) || 
        fechaNacimiento.isAfter(LocalDate.now()))) {
            this.fechaNacimiento = fechaNacimiento;
        } else {
            throw new IllegalArgumentException("Has introducido una fecha de nacimiento erronea");
        }

        // Comprobamos que el peso sea correcto 
        if (peso > 10 && peso < 100000) {
            this.peso = peso;
        } else {
            throw new IllegalArgumentException("Has introducido un peso erroneo");
        }

        // AHora comprobaremos el estado
        for (String tipoActual : tipos ) {
            if (tipo.equalsIgnoreCase(tipoActual)) {
                this.tipo = tipo;
            }
        }
        if (this.tipo == null) {
            throw new IllegalArgumentException("Has introducido un tipo erroneo");
        }
        this.estado = "reposando";
        this.nombre = nombre;
    }

    // Getters 

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstado() {
        return estado;
    }

    public int getPeso() {
        return peso;
    }

    // Setters

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


    // Metodos
    @Override
    public String toString(){
        return "El nombre del animal es " + this.nombre 
        + " es un " + this.tipo
        + " la fecha de nacimiento es " + this.fechaNacimiento 
        + " pesa un total de " + this.peso 
        + " gramos y ahora mismo está " + this.estado;
    }

    public void comer(double cantidadGramos){
        // Si los gramos son negativos los multiplicaremos por -1 y ya
        if (cantidadGramos < 0) {
            cantidadGramos *= -1;
        }
        this.peso += cantidadGramos;
        
    }

    public void dormir(){
        this.estado = "durmiendo";
    }

    public void despertar(){
        this.estado = "reposando";
    }

    public void descansar(){
        this.estado = "reposando";
    }

    public void jugar(int cantidadMinutos){
        if (cantidadMinutos > 180) {
            throw new IllegalArgumentException("Has introducido mas de 3 horas (no está permitido)");
        }
        this.estado = "jugando";
        // Lo pasamos a positivo si es negativo
        if (cantidadMinutos < 0) {
            cantidadMinutos *= -1;
        }
        // Por cada 30 minutos que pasen reducimos el peso en 80%
        while (cantidadMinutos >= 30) {
            this.peso *= 0.8;
            cantidadMinutos -= 30;
        }
        // Si son menos de 30 minutos lo que quedan, reducimos el peso en 90%
        if (cantidadMinutos < 30 && cantidadMinutos > 0) {
            this.peso *= 0.9;
        }
    }

    public Animal clonar (Animal pet){
        Animal copia = new Animal(pet);
        return copia;
    }
}