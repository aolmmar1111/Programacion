package alboran.dia18del11;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Metodos {
    private static final Scanner tec = new Scanner(System.in);
    public static int [] rellenarArray (){
        int [] arrayInt = new int[10];
        int numero = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            boolean error;
            do {
                error = false;
                System.out.println("Posicion " + (i+1));
                System.out.println("Introduce un numero del 1 al 5"); 
                try {
                    numero = tec.nextInt();   
                } catch (InputMismatchException ime) {
                    error = true;
                    tec.nextLine();
                    System.out.println("Acabas de introducir algo que no es un numero, por favor introduce un numero");
                }
            } while ((numero > 5 || numero < 0 || error));
            arrayInt [i] = numero;
        }
        return arrayInt;
    }
    public static int [] enumerarArray (int [] arrayInt){
        int [] arrayFinal = new int [5];
    
        /// Esta es la manera de hacerlo con switch 
        
        // for (int i = 0; i < arrayInt.length; i++) {
        //     switch (arrayInt[i]) {
        //         case 1 ->{
        //             arrayFinal [0] += 1;
        //         }
        //         case 2 -> {
        //             arrayFinal [1] += 1;
        //         }
        //         case 3 ->{
        //             arrayFinal [2] += 1;
        //         }
        //         case 4 -> {
        //             arrayFinal [3] += 1;
        //         }
        //         case 5 -> {
        //             arrayFinal [4] += 1;
        //         }
        //     }
        // }

        /// Estas son las maneras de hacerlo, en una lo haces con el foreach y en otra con el for normal,
        /// todas funcionan correctamente.

        // for (int i : arrayInt) {
        //     arrayFinal[i - 1] += 1;
        // }
        for (int i = 0; i < arrayInt.length; i++) {
            arrayFinal[arrayInt[i] - 1] +=1;
        }
        return arrayFinal;
    }
}
