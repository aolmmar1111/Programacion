package alboran;

import java.util.Scanner;

public class EjercicioArrays {

    private static final Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {
        
        // Declaramos el array y le ponemos una longitud determinada por el usuario
        int [] arrayInt;
        System.out.println("Cuantos numero vas a introducir");
        int longitud = tec.nextInt();
        arrayInt = new int [longitud];

        // Llamamos a la función rellenarArrays y mostramos en pantalla el resultado
        // que nos da la función
        arrayInt = rellenarArrays(arrayInt.length);
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("La posicion " + (i+1) + " es de: "+ arrayInt[i]);
        }
        
    }
    
    public static int[] rellenarArrays(int arrayLength) {

        
        // Iniciamos el array que despues mandaremos como
        // resultado de la función
        int [] arrayInt;

        // Declaramos la longitud como el parametro, este parametro
        // es la longitud que previamente ha introducido el usuario
        arrayInt = new int [arrayLength];

        // Hacemos un bucle for que se repita por la longitud del array
        // en cada iteración declarará un valor
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Introduce un numero:");
            arrayInt[i] = tec.nextInt();
        }
        
        // Devolvemos el array 
        return arrayInt;
    }
}
