package alboran;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Tarea32 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int numeroJuego = 0;
        String seleccion, resultado;
        do {
            System.out.println("¿Que juego quieres jugar?");
            do {
                System.out.println("""
                        1-> Pares Nones
                        2-> Piedra, papel, tijeras
                        3-> Salir
                        """);

                try {
                    numeroJuego = tec.nextInt();
                } catch (InputMismatchException ime) {
                    System.out.println("Tienes que introducir un numero del 1 al 3");
                    tec.nextLine();
                }
            } while (!((numeroJuego == 1) || (numeroJuego == 2) || (numeroJuego == 3)));

            switch (numeroJuego) {
                case 1:
                    System.out.println("Pares o nones");
                    tec.nextLine();
                    seleccion = tec.nextLine();
                    resultado = Juegos.ParesNones(seleccion);
                    System.out.println(resultado);
                    break;

                case 2:
                    System.out.println("Piedra , papel o tijeras");
                    tec.nextLine();
                    seleccion = tec.nextLine();
                    resultado = Juegos.PiedraPapelTijeras(seleccion);
                    System.out.println(resultado);
                    break;
                default:
                    break;
            }
        } while (numeroJuego != 3);
    }

    public class Juegos {
        public static String ParesNones(String seleccion) {
            Random random = new Random();
            int aleatorio = random.nextInt(1, 21);
            String resultado;
            if (seleccion.equalsIgnoreCase("pares") && aleatorio % 2 == 0) {
                resultado = "Has ganado, el numero era de " + aleatorio + " y has escogido " + seleccion;
            } else if (seleccion.equalsIgnoreCase("nones") && aleatorio % 2 == 1) {
                resultado = "Has ganado, el numero era de " + aleatorio + " y has escogido " + seleccion;
            } else {
                resultado = "Has perdido, el numero era de " + aleatorio + " y has escogido " + seleccion;
            }
            return resultado;
        }

        public static String PiedraPapelTijeras(String seleccion) {
            Random random = new Random();
            int aleatorio = random.nextInt(1, 4);
            String resultado = "", texto1, texto2;

            /// numero 1 - piedra
            /// numero 2 - papel
            /// numero 3 tijeras

            switch (aleatorio) {
                case 1:
                    texto1 = "La maquina ha escogido piedra y tu " + seleccion;
                    if (seleccion.equalsIgnoreCase("piedra")) {
                        texto2 = "Habeis empatado";
                    } else if (seleccion.equalsIgnoreCase("papel")) {
                        texto2 = "Has ganado";
                    } else {
                        texto2 = "Has perdido";
                    }
                    resultado = texto1 + "\n" + texto2;
                    break;
                case 2:
                    texto1 = "La maquina ha escogido papel y tu " + seleccion;
                    if (seleccion.equalsIgnoreCase("piedra")) {
                        texto2 = "Has perdido";
                    } else if (seleccion.equalsIgnoreCase("papel")) {
                        texto2 = "Habeis empatado";
                    } else {
                        texto2 = "Has ganado";
                    }
                    resultado = texto1 + "\n" + texto2;
                    break;
                case 3:

                    texto1 = "La maquina ha escogido tijeras y tu " + seleccion;
                    if (seleccion.equalsIgnoreCase("piedra")) {
                        texto2 = "Has perdido";
                    } else if (seleccion.equalsIgnoreCase("papel")) {
                        texto2 = "Has ganado";
                    } else {
                        texto2 = "Habeis empatado";
                    }
                    resultado = texto1 + "\n" + texto2;
                    break;
            }
            return resultado;
        }
    }
}
