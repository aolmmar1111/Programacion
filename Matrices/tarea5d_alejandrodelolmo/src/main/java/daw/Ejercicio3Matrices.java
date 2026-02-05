package daw;

import javax.swing.JOptionPane;

public class Ejercicio3Matrices {
    public static final char LIBRE = 'L';
    public static char RESERVADO = 'R';
    public static char LETRA = 'A';

    public static void main(String[] args) {
        char[][] asientos = new char[30][6];

        for (char[] asiento : asientos) {
            for (int j = 0; j < asiento.length; j++) {
                asiento[j] = LIBRE;
            }
        }
        String eleccionMenu;
        do {
            eleccionMenu = JOptionPane.showInputDialog("""
                    Menu asiento
                    1- Imprimir asientos en consola
                    2- Cambiar estado de un asiento
                    3- Ver estado de una fila en concreto
                    """);
            String eleccionAux;
            switch (eleccionMenu) {
                case "1" -> imprimirAsiento(asientos);

                case "2" -> {
                    eleccionAux = JOptionPane.showInputDialog("Introduce el asiento que quieres cambiar");
                    char[] arrayChar = eleccionAux.toCharArray();
                    int columna = 0;
                    int fila = 0;
                    for (int i = 0; i < arrayChar.length; i++) {
                        if (Character.isDigit(arrayChar[i])) {
                            if (Character.isDigit(arrayChar[i + 1])) {
                                columna += Integer.parseInt(String.valueOf(arrayChar[i])) * 10;
                            } else if (Character.isAlphabetic(arrayChar[(i + 1)])) {
                                columna += Integer.parseInt(String.valueOf(arrayChar[i]));
                                break;
                            }
                        }
                    }
                    fila = (arrayChar[arrayChar.length - 1]) - 65;
                    eleccionAux = JOptionPane
                            .showInputDialog("A que estado lo quieres cambiar (L - Libre , R - Reservado)");
                    switch (eleccionAux) {
                        case "L" -> cambiarEstadoAsiento(asientos, columna, fila, "libre");
                        case "R" -> cambiarEstadoAsiento(asientos, columna, fila, "reservado");
                        default -> throw new AssertionError();
                    }
                }

                case "3" -> {
                    eleccionAux = JOptionPane.showInputDialog("Que fila quieres ver?");
                    imprimirAsiento(asientos, Integer.parseInt(eleccionAux));
                }
                default -> {
                }
            }
        } while (Integer.parseInt(eleccionMenu) != 0);
    }

    public static void imprimirAsiento(char[][] asientos, int fila) {
        fila--;
        for (int i = 0; i < asientos[1].length; i++) {
            System.out.print(asientos[fila][i]);

        }
        System.out.println();
    }

    public static void imprimirAsiento(char[][] asientos) {
        System.out.print(' ');
        for (int i = 0; i < asientos[0].length; i++) {
            System.out.print(LETRA);
            LETRA++;
        }
        System.out.println();
        for (int i = 0; i < asientos.length; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(asientos[i][j]);
            }
            System.out.println();
        }
    }

    public static void cambiarEstadoAsiento(char[][] asientos, int fila, int asiento, String estado) {
        fila--;
        if (estado.equalsIgnoreCase("reservado")) {
            asientos[fila][asiento] = RESERVADO;
        } else {
            asientos[fila][asiento] = LIBRE;
        }
    }

}
