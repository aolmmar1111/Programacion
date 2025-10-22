package ejemplosclase;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Juegos {
    public static void main(String[] args) {
        // Iniciamos el Scanner
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int numeroJuego = 0;
        do {
            System.out.println("Que juego quieres jugar?");
            do {
                numeroJuego = 0;
                System.out.println("""
                        1 -> Pares/Nones
                        2 -> Piedra, Papel, Tijera
                        3 -> Salir""");
                // numeroJuego = teclado.nextInt();
                try {
                    numeroJuego = teclado.nextInt();
                } catch (InputMismatchException ime) {
                    System.out.println("Tienes que introducir un numero del 1 al 3");
                    teclado.nextLine();
                }
            } while (!(numeroJuego == 1 || numeroJuego == 2 || numeroJuego == 3));

            //Juego Pares/Nones
            if (numeroJuego == 1) {
                teclado.nextLine();
                String seleccionParesONones;
                do {
                    System.out.println("¿Pares o Nones?");
                    seleccionParesONones = teclado.nextLine();
                } while (!((seleccionParesONones.equalsIgnoreCase("nones")) || (seleccionParesONones.equalsIgnoreCase("pares"))));


                int numeroParesNones = random.nextInt(1,21);
                System.out.println(numeroParesNones);

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
                System.out.println("Piedra, papel o tijeras");
                teclado.nextLine();
                String seleccionPiedraPapel = teclado.nextLine();

                int numeroPiedraPapel = random.nextInt(1,4);
                System.out.println(numeroPiedraPapel);

                // numero 1 = piedra
                // numero 2 = papel
                // numero 3 = tijeras

                switch (numeroPiedraPapel) {
                    case 1:
                        if (seleccionPiedraPapel.equalsIgnoreCase("piedra")) {
                            System.out.println("La maquina ha escogido Piedra, eso significa que has empatado");
                        } else if (seleccionPiedraPapel.equalsIgnoreCase("papel")) {
                            System.out.println("La maquina ha escogido Piedra, eso significa que has ganado");
                        } else {
                            System.out.println("La maquina ha escogido Piedra, eso significa que has perdido");
                        }
                    break;

                    case 2:

                        if (seleccionPiedraPapel.equalsIgnoreCase("piedra")) {
                            System.out.println("La maquina ha escogido Papel, eso significa que has ganado");
                        } else if (seleccionPiedraPapel.equalsIgnoreCase("papel")) {
                            System.out.println("La maquina ha escogido Papel, eso significa que has empatado");
                        } else {
                            System.out.println("La maquina ha escogido Papel, eso significa que has perdido");
                        }
                    break;

                    case 3:
                        if (seleccionPiedraPapel.equalsIgnoreCase("piedra")) {
                            System.out.println("La maquina ha escogido Piedra, eso significa que has perdido");
                        } else if (seleccionPiedraPapel.equalsIgnoreCase("papel")) {
                            System.out.println("La maquina ha escogido Piedra, eso significa que has ganado");
                        } else {
                            System.out.println("La maquina ha escogido Piedra, eso significa que has empatado");
                        }
                    break;
                }
            }
        } while (numeroJuego != 3);
    }
}
