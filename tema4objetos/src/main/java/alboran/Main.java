package alboran;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String menu = """
                ---------------------
                1.- Sumar
                2.- Restar
                3.- Multiplicar
                4.- Dividir
                5.- Salir
                ---------------------
                """;
        boolean salir = false;
        Scanner teclado = new Scanner (System.in);
        int opcionElegida = 0;

        do { 
            System.out.println(menu);
            System.out.println("Introduce una opcion (1-5):");

            opcionElegida = teclado.nextInt();

            switch (opcionElegida) {
                case 1 -> {
                    System.out.println("Opcion sumar");

                }
                case 2 -> {
                    System.out.println("Opcion restar");
                }
                case 3 -> {
                    System.out.println("Opcion multiplicar");
                }
                case 4 -> {
                    System.out.println("Opcion dividir");
                }
                case 5 -> {
                    System.out.println("Has decidido salir");
                    System.out.println("Hasta luego");
                    salir = true;
                }

                default -> {
                    System.out.println("Te has equivocado de opción");
                }
            }

        } while (!salir);
    }
    
}