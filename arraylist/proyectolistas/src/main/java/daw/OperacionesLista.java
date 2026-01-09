package daw;

import java.util.ArrayList;

public class OperacionesLista {

    public static int sumarPares(ArrayList<Integer> lista){
        int sumaPares = 0;

        for (Integer num : lista) {
            if (num % 2 == 0) {
                sumaPares += num;
            }
        }
        return sumaPares;
    }

    public static int numeroImpares(ArrayList<Integer> lista){
        int contadorImpares = 0;
        for (Integer integer : lista) {
            if (integer % 2 == 1) {
                contadorImpares++;
            }
        }
        return contadorImpares;
    }

    public static int elementoMenor(ArrayList<Integer> lista){
        int numeroMenor = Integer.MAX_VALUE;
        for (Integer integer : lista) {
            if (integer < numeroMenor) {
                numeroMenor = integer;
            }
        }
        return numeroMenor;
    }

    public static int elementoMayor(ArrayList<Integer> lista){
        int numeroMayor = Integer.MIN_VALUE;
        for (Integer integer : lista) {
            if (integer > numeroMayor) {
                numeroMayor = integer;
            }
        }
        return numeroMayor;
    }

    public static int [] listaAArray(ArrayList<Integer> lista){
        int [] arrayInt = new int [lista.size()-1];

        for (int i = 0; i < lista.size(); i++) {
            arrayInt[i] = lista.get(i);
        }
        return arrayInt;
    }
}
// Imprimimos la suma de los numeros pares de una lista de enteros
// Imprimimos el numero de impares
// Devolver el elemento mayor
// Devolver el elemento menor
// Obtener un array de int a partir de la lista
