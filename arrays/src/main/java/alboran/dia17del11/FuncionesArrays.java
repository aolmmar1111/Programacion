package alboran.dia17del11;

import java.util.Random;

public class FuncionesArrays {
    /// Atributo de clase (static) privado, accesible desde todos los metodos de este clase
    /// no accessible desde otras clases
    
    private static Random random = new Random();

    public static int [] generarArraysAleatorio (int tam){

        if (tam <= 0){
            throw new IllegalArgumentException("El tamaño del array no puede ser <= 0");
        }

        int [] array = new int[tam];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1,31);
        }

        return array;
    }

    public static int [] quitarDuplicados (int [] array) {
        int [] arrayFinal = null;
        int [] arraySinDuplicados = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (!Está(array[i], arraySinDuplicados)) {
                arraySinDuplicados[i] = array[i];
            }
        }

        int contador = contarNumeros(arraySinDuplicados);
        arrayFinal = new int [contador];
        int posicion = 0;
        for (int i : arraySinDuplicados) {
            if (i!=0) {
                arrayFinal[posicion++] = i;
            }
        }
        return arrayFinal;
    }

    public static boolean Está (int numeroABuscar, int[] arrayDondeBuscar){
        for (int elemento : arrayDondeBuscar){
            if (numeroABuscar == elemento) {
                return true;
            }
        }
        return false;
    }
        public static int contarNumeros (int [] array){
        int contador = 0;
        for (int i : array) {
            if (i!=0) {
                contador++;
            }
        }
        return contador;
    }
}
