package alboran.ejercicios;

import java.util.Scanner;

public class FuncionesBasicas {
    private  static final Scanner tec = new Scanner (System.in);
    
    public static int longitudArray (){
        
        System.out.println("¿Cuantos numeros quieres introducir?");
        int longitud = tec.nextInt();
        return longitud;
    }
    public static int[] rellenarArray (int[] arrayInt){

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Introduce un numero:");
            arrayInt[i] = tec.nextInt();
        }
        return arrayInt;
    }
    public static double[] rellenarArrayDouble (double [] arrayInt){

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Introduce un numero:");
            arrayInt[i] = tec.nextDouble();
        }
        return arrayInt;
    }
}
