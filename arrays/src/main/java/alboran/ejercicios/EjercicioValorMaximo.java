package alboran.ejercicios;

import java.util.Scanner;

public class EjercicioValorMaximo {

    public final static Scanner tec = new Scanner (System.in);

    public static void main(String[] args) {
        int [] arrayInt;
        int longitud = FuncionesBasicas.longitudArray();
        arrayInt = new int [longitud];

        FuncionesBasicas.rellenarArray(arrayInt);
        System.out.println(buscarMayor(arrayInt));
        
    }
    public static int buscarMayor (int[] arrayInt){
        int numero1 = Integer.MIN_VALUE;
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] > numero1 ) {
                numero1 = arrayInt[i];
            }
        }
        return numero1;
    }

}
