package alboran.ejercicios;

import java.util.Scanner;

public class EjercicioMultiplicarArray {
    
    private  static final Scanner tec = new Scanner (System.in);

    public static void main(String[] args) {
    
        double [] arrayDouble;
        int longitud = FuncionesBasicas.longitudArray();
        System.out.println("¿Que numero quieres que multiplique todo el array?");
        double multiplicador = tec.nextDouble();
        arrayDouble = new double[longitud];

        FuncionesBasicas.rellenarArrayDouble(arrayDouble);
        for (int i = 0; i < arrayDouble.length; i++) {
            System.out.println("La posicion " + (i +1) + " tiene un valor de: " + arrayDouble[i]);
        }
        arrayDouble = multiplicarArray(arrayDouble,multiplicador);
        for (int i = 0; i < arrayDouble.length; i++) {
            System.out.println("La posicion despues de multiplicar " + (i +1) + " tiene un valor de: " + arrayDouble[i]);
        }

    
    }
    public static double [] multiplicarArray(double[] arrayDouble, double multiplicador) {        
        for (int i = 0; i < arrayDouble.length; i++) {
            arrayDouble[i] = arrayDouble[i] * multiplicador;
        }
        return arrayDouble;
    }
}
