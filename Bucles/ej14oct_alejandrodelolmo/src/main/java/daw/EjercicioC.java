package daw;

import java.util.Scanner;

public class EjercicioC {
    public static void main(String[] args) {
        // Inicializamos el Scanner y preguntamos cuantos numeros vamos a
        // introducir, lo guardo en un int por que no vamos a introducir
        // numeros con coma
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuantos numeros vas a introducir?");
        int numeroSerie = teclado.nextInt();

        // Declaramos las variables fuera de las funciones, 2 tipos Enteros
        // para las variables de valor y double para mostrar el promedio de
        // manera exacta
        int valorEntero = 0, cuentaPares = 0, cuentaImpares = 0;
        double promedio = 0;

        // Hacemos un for que se repita el numero de veces que hemos introducido
        // anteriormente en numeroSerie pidiendo los numeros
        for (int i = 0; i < numeroSerie; i++) {
            System.out.println("Introduce un numero entero");
            valorEntero = teclado.nextInt();

            // Evaluamos si el numero es impar o par y lo guardamos en
            // cuentaImpares o cuentaPares
            if (valorEntero%2 == 1) {
                cuentaImpares++;
            } else {
                cuentaPares++;
            }

            // Guardamos cada valor en la variable promedio, esto nos ayudará 
            // más tarde para hacer el promedio de todos los numeros
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
