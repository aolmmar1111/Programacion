package passwords;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.commons.lang3.RandomStringUtils;

public class Main {
    private static final Scanner tec = new Scanner(System.in);
    private static final RandomStringUtils generador = RandomStringUtils.secure();

    public static void main(String[] args) {
        char[] arrayChar = { 'a', 'b', 'e', 'x', 'z', 'u', 'i', 'o', 't', 'h' }; // Declaramos el array de los char disponibles
        int menu = 0; // Inicializamos el menu

        // Ahora haremos un do while que se repita hasta que el usuario ponga el numero 4
        do {
            // Haremos un try catch para capturar la excepcion por si el usuario pone una letra
            try {
                System.out.println("""

                        Introduce una opcion:

                        1- Genera números pin aleatorios
                        2- Genera contraseñas para usuarios
                        3- Genera una secuencia de caracteres
                        4- Salir
                        """);
                menu = tec.nextInt();
            } catch (InputMismatchException ime) {
                tec.nextLine();

                // Aqui simplemente limpiaremos el buffer ya que si el input no es 1 , 2 o 3 va a decir que tienes
                // que poner un numero asi que para no repetirnos solo limpiamos el buffer
            }

            // Hacemos un switch para hacer algo dependiendo de lo que haya escrito el usuario
            switch (menu) {

                // En el caso 1 generaremos el PIN
                case 1 -> {
                    System.out.println("Tu pin es: " + generarPin());
                }

                // En el caso 2 la contraseña
                case 2 -> {
                    System.out.println("Tu contraseña es: " + generarContraseña());
                }

                // En el caso 3 la secuencia
                case 3 -> {
                    System.out.println("Introduce el numero de repeticiones");
                    int repeticiones = tec.nextInt();
                    System.out.println("La secuencia es: " + generarSecuencia(arrayChar, repeticiones));
                }

                // En el 4 nos salimos
                case 4 -> {
                    break;
                }

                // Si pone algo diferente le indicaremos que debe introducir un numero del 1 al 4
                default -> {
                    System.out.println("Tienes que introduce un numero del 1 al 4");
                }
            }
        } while (menu != 4);

    }

    // usaremos RandomStringUtils para generar el pin, esto nos evitará importar Random solo para el pin
    // tambien usaremos esta herramienta para las demas funciones
    public static int generarPin() {
        return Integer.parseInt(generador.nextNumeric(4));
    }

    public static String generarSecuencia(char[] arrayChar, int repeticiones) {
        return generador.next(repeticiones, arrayChar);
    }

    public static String generarContraseña() {
        return (generador.nextAlphanumeric(8));
    }
}