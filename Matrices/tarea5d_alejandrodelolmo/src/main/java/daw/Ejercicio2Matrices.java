package daw;

import java.util.Random;

public class Ejercicio2Matrices {
    private static Random r = new Random();
    public static void main(String[] args) {

        int n = 5, m = 3;
        int [][] matriz1 = new int[n][m];
        int [][] matriz2 = new int[n][m];

        rellenarMatriz(matriz1);
        rellenarMatriz(matriz2);

        System.out.println("Matriz 1:");
        imprimirMatriz(matriz1);
        System.out.println("Matriz 2:");
        imprimirMatriz(matriz2);
        
        System.out.println("Nueva Matriz:");
        imprimirMatriz(sumarMatrices(matriz1, matriz2));
    }

    public static void rellenarMatriz(int [][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = r.nextInt(1,10);
            }
        }
    }
    public static void imprimirMatriz (int [][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] sumarMatrices (int[][] matriz1,int[][] matriz2){
        int [][] matrizNueva = new int [matriz1.length][matriz1[0].length];
        for (int i = 0; i < matrizNueva.length; i++) {
            for (int j = 0; j < matrizNueva[i].length; j++) {
                matrizNueva[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return matrizNueva;
    }
}