package alboran;

import java.util.Scanner;

public class Tarea3a {
    public static void main(String[] args) {
        System.out.println("""
                Introduce un numero del 1 al 5:

                Opcion 1 - ¿El siguiente numero es par o impar?
                Opcion 2 - Introduce 2 numeros enteros y descubre cual es el mayor
                Opcion 3 - Aprobado o suspenso
                Opcion 4 - ¿El siguiente numero es positivo, negativo o cero?
                Opcion 5 - Determinar si el año es bisiesto o no
                """);
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        if (numero > 5 || numero < 0) {
            // Opcion 1 - ¿El siguiente numero es par o impar?
            // Simplemente comprobamos que el resto de el numero entre 2
            // sea 0 o por el contrario sea 1
            if (numero == 1) {
                System.out.println("El siguiente numero es impar o par");
                double opcion1 = teclado.nextInt();
                if (opcion1 % 2 != 0) {
                    System.out.println("El numero es impar");
                } else {
                    System.out.println("El numero es par");
                }
            } 
            // Opcion 2 - Introduce 2 numeros enteros y descubre cual es el mayor
            // Hacemos un If donde comprobamos si el numero1 es mayor que el numero2
            else if (numero == 2) {
                System.out.println("Introduce 2 numeros enteros y descubre cual es el mayor");
                System.out.println("Primer numero entero");
                int opcion2PrimerInt = teclado.nextInt();
                System.out.println("Segundo numero entero");
                int opcion2SegundoInt = teclado.nextInt();

                if (opcion2PrimerInt > opcion2SegundoInt) {
                    System.out.println("El numero " + opcion2PrimerInt + " es mayor que " + opcion2SegundoInt);
                } else {
                    System.out.println("El numero " + opcion2SegundoInt + " es mayor que " + opcion2PrimerInt);
                }
            }
            // Opcion 3 - Aprobado o suspenso
            // Cuando el usuario introduzca un numero mayor o igual que 
            // 60, el programa imprima Aprobado, si no que imprima
            // Suspenso
            else if (numero == 3) {
                System.out.println("Introduce un numero del 0 al 100");
                int opcion3 = teclado.nextInt();

                if (opcion3 >= 60) {
                    System.out.println("Aprobado");
                } else {
                    System.out.println("Suspenso");
                }
            } 
            // Opcion 4 - ¿El siguiente numero es positivo, negativo o cero?
            // Pediremos un numero al usuario, si es positivo , impriremos positivos
            // si es cero imprimimos cero y si es negativo, imprimimos negativo,
            // Comprobamos que es en cada caso con un operador ternario.
            else if (numero == 4) {
                System.out.println("Introduce un numero entero");
                int opcion4 = teclado.nextInt();
                String resultadoOpcion4 = (opcion4==0) ? "Cero" : (opcion4>0) ? "Positivo" : "Negativo";
                System.out.println("EL numero" + opcion4 + " es " + resultadoOpcion4);
            } 
            // Opcion 5 - Determinar si el año es bisiesto o no
            // Un numero es bisiesto si: es divisible entre 400 o 
            // divisible entre 4 y no es divisible entre 100.
            else if (numero == 5) {
                System.out.println("Introduce un año");
                int opcion5 = teclado.nextInt();

                if (opcion5 % 400 == 0 || opcion5 % 4 == 0 && opcion5 % 100 != 0) {
                    System.out.println("El año es bisiesto");
                } else {
                    System.out.println("El año no es bisiesto");
                }
            }
        }
    }
}