package daw;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1Matrices {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Random r = new Random();

        int [][] matriz = new int[5][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = r.nextInt(1,10);
            }
        }

        // Imprimir la matriz
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}