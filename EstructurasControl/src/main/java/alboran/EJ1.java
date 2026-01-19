package alboran;

import java.util.Scanner;

public class EJ1 {
    /*
     * EJ1 - Leer la edad de una persona e indicar
     * si es menor de edad. En caso de ser mayor de edad,
     * si tiene 18 indicar que no tiene que tributar a hacienda,
     * si tiene 25 indicar que tributa un 10% de irpf,
     * si tiene 35 indicar que tributa un 14% de irpf,
     * si tiene 55 indicar que tributa un 22% de irpf,
     * y si tiene mas de 65 no tributa.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = teclado.nextInt();

        if (edad > 18){
            // un char o un strin o enum
            switch (edad) {
            case 18:
                System.out.println("No tienes que tributar");
                break;
            case 25:
                System.out.println("Tributas un 10%");                
                break;
            case 35:
                System.out.println("Tributas un 14%");
                break;
            case 55:
                System.out.println("Tributas un 22%");
                break;
            case 65:
                System.out.println("No tienes que tributar");
                break;
            default:
                System.out.println("Introduce otra edad");
        }
    }else {
        System.out.println("Eres menor de edad");
        }
    }
}
