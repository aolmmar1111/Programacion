package alboran.dia18del11;

import java.util.Arrays;

public class Ejercicio1 {
    /// Vamos a decirle a un usuario que un array de 10 posiciones introduzca numeros del 1 al 5
    public static void main(String[] args) {

        int [] arrayInt = Metodos.rellenarArray();
        System.out.println(Arrays.toString(arrayInt));

        arrayInt = Metodos.enumerarArray(arrayInt);
        System.out.println("\n  Posiciones  \n[1, 2, 3, 4, 5] \nSe repiten un total de:");
        System.out.println(Arrays.toString(arrayInt));

        System.out.println("Asteriscos");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print((i+1) + ":");
            for (int j = 0; j < arrayInt[i]; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
