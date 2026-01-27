package daw;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio3Matrices {
    public static final char LIBRE = 'L'; 
    public static char RESERVADO = 'R';
    private static Scanner teclado = new Scanner()
    public static void main(String[] args) {
        char [][] asientos = new String[30][6];

        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j] = LIBRE;
            }
        }
        String eleccionMenu;
        do { 
            eleccionMenu = JOptionPane.showInputDialog("""
                Menu asiento
                """);
        } while (eleccionMenu != "0");
    }
    public static void imprimirAsiento (String [][] asientos, int fila){
        for (int i = fila++; i < asientos.length;) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(asientos[0][j]);
            }
            System.out.println();
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(asientos[i][j]);

            }
            System.out.println();

            break;
        }
    }
    public static void imprimirAsiento (String [][] asientos){
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(asientos[i][j]);
            }
            System.out.println();
        }
    }
    public static void cambiarEstadoAsiento (String [][] asientos, int fila, int asiento, String estado){
        if (estado.equalsIgnoreCase("reservado")) { 
            asientos[fila][asiento] = Character.toString(RESERVADO);
        } else {
            asientos[fila][asiento] = Character.toString(LIBRE);
        }
    }
    
}
