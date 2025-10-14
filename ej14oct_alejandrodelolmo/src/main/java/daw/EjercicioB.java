package daw;

import java.util.Scanner;

public class EjercicioB {
    public static void main(String[] args) {
        // Inicializamos el Scanner y declaramos la variable 
        // longitud que pronto usaremos
        Scanner teclado = new Scanner(System.in);
        int longitud;

        // Preguntamos la longitud y lo guardamos en la variable
        // si la longitud se pasa de 10 o es negativa repetimos la 
        // pregunta
        do {
            System.out.println("¿Cuanta longitud quiere que tenga la piramide? (maximo 10)");
            longitud = teclado.nextInt();
        } while (longitud > 10 || longitud < 0);
        
        // Imprimos un caracter por la longitud del numero, si es 6
        // repetiremos 6 veces el print(i) para asi obtener una piramide
        for (int i = 1; i <= longitud; i++) {
            for (int j = 0; j < i;j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
