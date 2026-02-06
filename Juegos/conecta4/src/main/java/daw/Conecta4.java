package daw;

import java.util.Scanner;

public class Conecta4 {
    private static Scanner tec = new Scanner(System.in);
    static String jugador1 = null,jugador2 = null,jugador = null;
    public static int turno,posicionX;
    static char [][] plantilla = new char[6][7];
    static final char  X = 'X';
    static final char O = 'O';
    public static void main(String[] args) {

        turno = 0;
        boolean victoria = false;
        int posicionX = -1, posicionY = 0, turno = 0;

        System.out.println("Introduce el nombre del jugador 1");
        jugador1 = tec.nextLine();
        System.out.println("Introduce el nombre del jugador 2");
        jugador2 = tec.nextLine();

        do { 
            if (turno == 0) {
                posicionX = pedirNumero(turno);
                turno++;
            } else {
                System.out.println("a");
                posicionX = pedirNumero(turno);
                turno--;
            }
        } while (!victoria);
    }

    public boolean comprobarVictoria (char [][] plantilla, int posicionX, int posicionY){
        return false;
    }

    public static int pedirNumero (int turno){ 
        do {
            if (turno == 0) {
                jugador = jugador1;
            } else if (turno == 1) {
                jugador = jugador2;
            } 
            try {
                System.out.println(jugador + " elige una posicion del 1 al 6");
                posicionX = tec.nextInt();
                if ((plantilla[posicionX][7] == X) || (plantilla[posicionX][7] == O)) {
                    
                }
                return tec.nextInt();
            } catch (Exception e) {
                tec.nextLine();
                System.out.println("Debes introducir un numero");
            }
        } while (true);
    }

    public static void añadirFicha (int posicion){

    }
}