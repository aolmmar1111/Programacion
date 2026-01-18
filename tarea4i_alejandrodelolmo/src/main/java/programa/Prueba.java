package programa;

import java.time.LocalDate;

import modelo.Animal;
import modelo.Persona;

public class Prueba {
    public static void main(String[] args) {
        // Creamos los animales correctamente 
        Animal a1 = new Animal(LocalDate.of(2015, 11, 11), "Angel", "gato", 1000);
        Animal a2 = new Animal(LocalDate.of(2017, 8, 12), "Max", "Perro", 2000);

        // Creamos a las 2 personas 
        Persona p1 = new Persona("Alejandro", 20);
        Persona p2 = new Persona("Fernando", 24);

        // Imprimimos las caracteristicas de los animales
        System.out.println(a1.toString());
        System.out.println(a2.toString());

        // Hacemos una copia de a2 a a3
        Animal a3 = new Animal(a2);
        System.out.println(a3.toString());
        
        // Despertamos a los 3 animales
        p1.llamar(a1);
        p1.llamar(a2);
        p1.llamar(a3);

        // Jugamos con a2 durante 120 minutos
        p2.jugar(a2, 120);

        // Alimentamos a a1, veremos que sube de 1000 gramos a 2000 gramos de peso
        p1.alimentar(a1, 1000);
        System.out.println("El peso de "+  a1.getNombre() + " es de " + a1.getPeso());

        
        // Ahora jugamos con a1 durante 200 minutos (se capará a 180) minutos
        p1.jugar(a1, 200);
        System.out.println(a1.toString());

        // Estos son casos donde las excepciones se lanzan correctamente
        Animal a4 = new Animal(LocalDate.of(1999, 10, 11), "Pepe", "lagartija", 10000);
        Animal a7 = new Animal(LocalDate.now(), "pepe", "cobaya", 10000);
        Animal a5 = new Animal(LocalDate.of(2001, 10, 10), "jose luis", "pajaro", 2000);
        Animal a6 = new Animal(LocalDate.of(2010, 10, 10), "Bonas", "perro" , 10);

    }
}
