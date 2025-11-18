package alboran.dia18del11;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    /// Vamos a decirle a un usuario que un array de 10 posiciones introduzca numeros del 1 al 5
    private static final Scanner tec = new Scanner(System.in);
    public static void main(String[] args) {
        int [] arrayInt = new int [10];

        arrayInt = rellenarArray(arrayInt);
        System.out.println(Arrays.toString(arrayInt));

        arrayInt = enumerarArray(arrayInt);
        System.out.println("\n  Posiciones  \n[1, 2, 3, 4, 5] \nSe repiten un total de:");
        System.out.println(Arrays.toString(arrayInt));
    }

    public static int [] rellenarArray (int [] arrayInt){
        int numero = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            do {
                System.out.println("Posicion " + (i+1));
                System.out.println("Introduce un numero del 1 al 5"); 
                numero = tec.nextInt();
            } while (numero > 5 || numero < 0);
            arrayInt [i] = numero;
        }
        return arrayInt;
    }
    public static int [] enumerarArray (int [] arrayInt){
        int [] arrayFinal = new int [5];
    
        for (int i = 0; i < arrayInt.length; i++) {
            switch (arrayInt[i]) {
                case 1 ->{
                    arrayFinal [0] += 1;
                }
                case 2 -> {
                    arrayFinal [1] += 1;
                }
                case 3 ->{
                    arrayFinal [2] += 1;
                }
                case 4 -> {
                    arrayFinal [3] += 1;
                }
                case 5 -> {
                    arrayFinal [4] += 1;
                }
            }
        }
        return arrayFinal;
    }
}
