package alboran.ejercicios;

import java.util.Scanner;

public class EjercicioValorMinimo {

    public final static Scanner tec = new Scanner (System.in);

    public static void main(String[] args) {
        int [] arrayInt;
        int longitud = FuncionesBasicas.longitudArray();
        arrayInt = new int [longitud];

        FuncionesBasicas.rellenarArray(arrayInt);
        System.out.println(buscarMenor(arrayInt));
        
    }
    public static int buscarMenor (int[] arrayInt){
        int numeroMenor = arrayInt[0];
        for (int i = 0; i < arrayInt.length; i++) {
            if (!(arrayInt[i] == arrayInt[0]) && !(arrayInt[i] > numeroMenor)) {
                numeroMenor = arrayInt[i];
            }
        }
        return numeroMenor;
    }

}
