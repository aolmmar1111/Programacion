package alboran.dia13del11;

import java.util.Random;

public class EjercicioArraysFuncion {

    private static final Random r = new Random();

    /// 7.- Crear una funcion que devuelva un array de tamaño especificado en el parametro con numero aleatorios entre 1 y 30
    /// 8.- Funcion que recibe un array de numero (Array del paso 7) y devuelve un nuevo array sin duplicados
    /// 
    /// main -> 7 y 8.

    public static void main(String[] args) {

        int longitud = 100;

        int [] arrayInt = rellenarArray(longitud);
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
        }
        arrayInt = quitarDuplicados(arrayInt);
        System.out.println("\n\n");
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] != 0) {
                System.out.print(arrayInt[i] + " ");
            }
        }
    }

    public static int[] rellenarArray (int longitud){
        int [] arrayInt = new int[longitud]; 
        
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = r.nextInt(1,31);
        }
        return arrayInt;
    }

    public static int[] quitarDuplicados(int [] arrayInt) {
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arrayInt[j] == arrayInt[i]) {
                    arrayInt[j] = 0;
                }
            }   
        }
        return arrayInt;
    }

}
