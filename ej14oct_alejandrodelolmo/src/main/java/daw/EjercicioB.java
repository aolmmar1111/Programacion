package daw;

import java.util.Scanner;

public class EjercicioB {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int longitud;
        do {
            System.out.println("¿Cuanta longitud quiere que tenga la piramide? (maximo 10)");
            longitud = teclado.nextInt();
        } while (longitud > 10 || longitud < 0);
        
        for (int i = 1; i <= longitud; i++) {
            for (int j = 0; j < i;j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
