package ejemplosclase;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Juegos {
    public static void main(String[] args) {
        // Iniciamos el Scanner y el Random
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int numeroJuego = 0;
        do {
            System.out.println("Que juego quieres jugar?");
            do {
                System.out.println("""
                        1 -> Pares/Nones
                        2 -> Piedra, Papel, Tijera
                        3 -> Salir""");
                // Pedimos numero juego y si da error, simplemente diremos que introduzcan un numero del 1 al 3
                // y volveremos a pedir el numero
                try {
                    numeroJuego = teclado.nextInt();
                } catch (InputMismatchException ime) {
                    System.out.println("Tienes que introducir un numero del 1 al 3");
                    teclado.nextLine();
                }
            // Si el numero no está entre 1,2 o 3 que se repita y lo pida de nuevo
            } while (!(numeroJuego == 1 || numeroJuego == 2 || numeroJuego == 3));

            //Juego Pares/Nones
            if (numeroJuego == 1) {
                // Limpiamos el buffer del Scanner e inicializamos el String
                teclado.nextLine();
                String seleccionParesONones;
                // Pedimos que se escriba pares o nones, no nos importarán las mayusculas
                // Si no es ni pares ni nones que se repita hasta que lo pida
                do {
                    System.out.println("¿Pares o Nones?");
                    seleccionParesONones = teclado.nextLine();
                } while (!((seleccionParesONones.equalsIgnoreCase("nones")) || (seleccionParesONones.equalsIgnoreCase("pares"))));

                /// Generaremos un numero aleatorio entre el 1 al 10 para
                /// simular las manos en el juego de pares o nones
                int numeroParesNones = random.nextInt(1,11);
                System.out.println(numeroParesNones);

                /// Comprobamos si el numero aleatorio es Par o Impar, si es impar y el usuario ha dicho nones
                /// entonces le diremos que ha ganado, si es par y el usuario ha puesto pares tamnbien, ahora
                /// si no es ninguna de esas 2 opciones entonces significa que ha perdido
                if (numeroParesNones % 2 == 1 && seleccionParesONones.equalsIgnoreCase("nones")) {
                    System.out.println("Felicidades, has ganado");
                } else if (numeroParesNones % 2 == 0 && seleccionParesONones.equalsIgnoreCase("pares")) {
                    System.out.println("Felicidades, has ganado");
                } else {
                    System.out.println("Has perdido");
                }
            }

            // Juego Piedra, papel o tijeras
            if (numeroJuego == 2) {
                /// Pediremos al usuario que introduzca que quiere jugar, piedra
                /// papel o tijeras, después limpiaremos el buffer del input de INT
                /// que hemos tenido antes para seleccionar el juego
                System.out.println("Piedra, papel o tijeras");
                teclado.nextLine();
                String seleccionPiedraPapel = teclado.nextLine();

                // Generamos un numero del 1 al 3 para ver que ha seleccionado la maquina
                int numeroPiedraPapel = random.nextInt(1,4);
                System.out.println(numeroPiedraPapel);

                // numero 1 = piedra
                // numero 2 = papel
                // numero 3 = tijeras

                /// Si el numero es 1 significa que la maquina ha cogido piedra, entonces maquetaremos 
                /// todas las posibles opciones, si es 2 entonces ha escogido papel y haremos exactamente
                /// lo mismo que con piedra, y asi tambien lo haremos con tijeras
                switch (numeroPiedraPapel) {
                    case 1 -> {
                        if (seleccionPiedraPapel.equalsIgnoreCase("piedra")) {
                            System.out.println("La maquina ha escogido Piedra, eso significa que has empatado");
                        } else if (seleccionPiedraPapel.equalsIgnoreCase("papel")) {
                            System.out.println("La maquina ha escogido Piedra, eso significa que has ganado");
                        } else {
                            System.out.println("La maquina ha escogido Piedra, eso significa que has perdido");
                        }
                    }

                    case 2 -> {
                        if (seleccionPiedraPapel.equalsIgnoreCase("piedra")) {
                            System.out.println("La maquina ha escogido Papel, eso significa que has ganado");
                        } else if (seleccionPiedraPapel.equalsIgnoreCase("papel")) {
                            System.out.println("La maquina ha escogido Papel, eso significa que has empatado");
                        } else {
                            System.out.println("La maquina ha escogido Papel, eso significa que has perdido");
                        }
                    }

                    
                    case 3 -> {
                        if (seleccionPiedraPapel.equalsIgnoreCase("piedra")) {
                            System.out.println("La maquina ha escogido Piedra, eso significa que has perdido");
                        } else if (seleccionPiedraPapel.equalsIgnoreCase("papel")) {
                            System.out.println("La maquina ha escogido Piedra, eso significa que has ganado");
                        } else {
                            System.out.println("La maquina ha escogido Piedra, eso significa que has empatado");
                        }
                    }
                }
            } 
        // Si el numero es 3 entonces saldremos del do while
        } while (numeroJuego != 3);
    }
}
