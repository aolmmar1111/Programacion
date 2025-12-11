package modelo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Animal perro = new Animal(LocalDate.of(2009, 10, 10), "Jesulin", "perro", 1000);
        Animal gato = new Animal(LocalDate.of(2014, 10, 19), "Gatete", "gato", 2000);
        Animal gato2 = new Animal(gato);


        System.out.println(perro.toString());
        System.out.println(gato.toString());
        System.out.println(gato2.toString());
    }
}
