package alboran;

import java.util.Scanner;

public class EJ2 {
    /*
     * EJ2 - Calculadora
     * Pedir opcion al usuario entre
     * 1- Sumar
     * 2- Restar
     * 3- Multiplicar
     * 4- Dividir
     * 
     * Si la opcion no es valida el programa inforam y termina
     * Si la opcion es validad se debe realizar la operaicon correspondiente, mostrar resultado y terminar.
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce que quieres hacer \n 1- Sumar \n 2- Restar \n 3- Multiplicar \n 4- Dividir.");
        int operacion = teclado.nextInt();
        
        // teclado.nextDouble();
        System.out.println("Introduce el primer numero");
        double numero1 =  teclado.nextDouble();
        System.out.println("Introduce el segundo numero");
        double numero2 = teclado.nextDouble();

        double resultado;
        if (operacion >= 1 && operacion <= 4) {
            switch (operacion) {
                case 1:
                    resultado = numero1 + numero2;
                    System.out.println("El resultado de la operacion es " +resultado);
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    System.out.println("El resultado de la operacion es " +resultado);
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    System.out.println("El resultado de la operacion es " +resultado);
                    break;
                case 4:
                    resultado = numero1 / numero2;
                    System.out.println("El resultado de la operacion es " +resultado);
                    break;
                default:
                    System.out.println("Has introducido una operacion no valida");
                    break;
            }
        }
        else {
            System.out.println("Has introduce una operacion no valida");    
        }
    }
}
