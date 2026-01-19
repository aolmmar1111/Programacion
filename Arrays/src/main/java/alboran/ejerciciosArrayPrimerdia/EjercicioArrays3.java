package alboran.ejerciciosArrayPrimerdia;

import java.util.Random;
import java.util.Scanner;

public class EjercicioArrays3 {
    /// funciona que recibe un array de char y devuelve la posicion en la que se encuentra
    /// el char que se pasa como parametro o -1 si no está en el array1
    
    public final static Scanner tec = new Scanner(System.in);
    public final static Random random = new Random();
    public static void main(String[] args) {
        char letraABuscar = 'o';
        int [] arrayChar;
        arrayChar = new int[60];

        for (int i = 0; i < arrayChar.length; i++) {
            arrayChar[i] = (char) (i + 63);
        }
        int posicion = buscarEnArray(arrayChar, letraABuscar);
        System.out.println("La letra " + letraABuscar + " está en la posicion " + posicion);
    }
    public static int buscarEnArray(int [] arrayChar , char letraABuscar) {
        int resultado = 0;

        for (int i = 0; i < arrayChar.length; i++) {
            char letra = (char) arrayChar[i];
            System.out.println(letra);
            if (letra == letraABuscar) {
                resultado = i;
            } else if (resultado == 0){
                resultado = -1;
            }

            
        }
        return resultado;
    }
}
