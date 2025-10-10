package daw;

import java.util.Scanner;

public class EjercicioC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuantos numeros vas a introducir?");
        int numeroSerie = teclado.nextInt();
        int valorEntero = 0, cuentaPares = 0, cuentaImpares = 0;
        double promedio = 0;

        for (int i = 0; i < numeroSerie; i++) {
            System.out.println("Introduce un numero entero");
            valorEntero = teclado.nextInt();
            if (valorEntero%2 == 1) {
                cuentaImpares++;
            } else {
                cuentaPares++;
            }
            promedio+=valorEntero;
        }
        System.out.println("""
                    Has introducido %s numeros enteros, de esos:

                    %s son pares,
                    %s son impares,

                    el promedio de todos los numeros es %s
                """.formatted(numeroSerie,cuentaPares,cuentaImpares,promedio/numeroSerie));
    }
}
