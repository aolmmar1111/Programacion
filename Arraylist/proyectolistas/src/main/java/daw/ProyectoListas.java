package daw;

import java.util.ArrayList;
import java.util.Arrays;

public class ProyectoListas {
    public static void main(String[] args) {

        // Creamos la lista vacia
        ArrayList <Integer> listaInteger = new ArrayList<>();

        // Añadimos los 4 elementos
        listaInteger.add(35);
        listaInteger.add(47);
        listaInteger.add(10);
        listaInteger.add(20);

        // Imprimimos con sout
        System.out.println("Imprimir con sout");
        System.out.println(listaInteger);

        // Imprimimos con bucle clasicos

        System.out.println("Bucles clasicos");
        System.out.println("----------------");
        for (int i = 0; i < listaInteger.size(); i++) {
            System.out.print(" - " + listaInteger.get(i));
        }

        // Imprimimos con foreach

        System.out.println("Imprimir con foreach");
        System.out.println("----------------");
        for (Integer num : listaInteger) {
            System.out.print(" - " + num);
        }

        // Usando el metodo foreach
        System.out.println("metodo foreach");
        System.out.println("--------------");
        listaInteger.forEach(e -> System.out.print(" - " + e));
    
        // Imprimimos la suma de los numeros pares de una lista de enteros

        System.out.println("Imprimimos la suma");
        int sumaPares = 0;
        for (Integer num : listaInteger) {
            if (num%2 == 0) {
                sumaPares+=num;
            }
        }
        System.out.println(sumaPares);

        // Imprimimos el numero de impares
        int numeroImpares = 0;
        for (Integer num : listaInteger) {
            if (num%2 == 1) {
                numeroImpares++;
            }
        }

        // Devolver el elemento mayor

        int numeroMayor = 0;
        for (Integer integer : listaInteger) {
            if (integer > numeroMayor) {
                numeroMayor = integer;
            }
        }
        System.out.println(numeroMayor);

            // Devolver el elemento menor

        int numeroMenor = Integer.MAX_VALUE;
        for (Integer integer : listaInteger) {
            if (integer < numeroMenor) {
                numeroMenor = integer;
            }
        }
        System.out.println(numeroMenor);

        // Devovler el tamaño de la lista

        System.out.println(listaInteger.size());

        // Borrar un elemento de la lista , en la posicion 2

        listaInteger.remove(2);
        
        // Borrar un elemento de la lista, segun su valor. Si hay varios, borrarlos todos

        listaInteger.removeIf(e -> e.equals(10));

        // Modificar el elemento de la lista de la posicion 1 con el nuevo valor 8.

        listaInteger.set(1, 8);

        // Obtener un array de int a partir de la lista

        int [] arrayInt = new int[listaInteger.size()];
        for (int i = 0; i < listaInteger.size(); i++) {
            arrayInt[i] = listaInteger.get(i);
        }
        System.out.println(Arrays.toString(arrayInt));


    }

    // Borrado de elementos
    // Opcion A por posicion

    

    // Opcion B por valor de un elemento
}