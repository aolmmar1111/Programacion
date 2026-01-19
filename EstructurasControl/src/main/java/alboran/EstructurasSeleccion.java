package alboran;

import java.util.Scanner;

public class EstructurasSeleccion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero del mes");
        int mes = teclado.nextInt();
        
        // Option 1 : NO OPTIMA
        if (mes >= 1 && mes <= 12){
            System.out.println("El mes introduce es correcto");
            if (mes == 1) {
                System.out.println("Enero");
            }
            if (mes == 2) {
                System.out.println("Febrero");
            }
            if (mes == 3) {
                System.out.println("Marzo");
            }
            if (mes == 4) {
                System.out.println("Abril");
            }
            if (mes == 5) {
                System.out.println("Mayo");
            }
            if (mes == 6) {
                System.out.println("Junio");
            }
            if (mes == 7) {
                System.out.println("Julio");
            }
            if (mes == 8) {
                System.out.println("Agosto");
            }
            if (mes == 9) {
                System.out.println("Septiembre");
            }
            if (mes == 10) {
                System.out.println("Octubre");
            }
            if (mes == 11) {
                System.out.println("Noviembre");
            }
            if (mes == 12) {
                System.out.println("Diciembre");
            }
        }
        else {
            System.out.println("El mes no es correcto");
            System.out.println("El mes introducido debe estar entre 1 y 12");
        }

        switch (mes) {
            case 1:
                
                break;
            default:
                throw new AssertionError();
        }

        // Scanner teclado = new Scanner (System.in);
        // System.out.println("Introduce un numero");
        // int numero = teclado.nextInt();

        // // Saber si el numero es divisible entre 10
        // int resto = numero % 10;
        // if (resto == 0){
        //     System.out.println("Es divisible por 10");
        // }

        // if (numero%10==0){
        //     System.out.println("Es divisible por 10");
        // }
        
        // System.out.println("Introduce las horas");
        // int horas = teclado.nextInt();

        // System.out.println("Introduce los minutos");
        // int minutos = teclado.nextInt();

        // System.out.println("Introduce los segundos");
        // int segundos = teclado.nextInt();

        // if (horas >= 0 && horas <= 23) {
        //     System.out.println("Las horas son validas");
        //     if (minutos>=0&&minutos<=59) {
        //         System.out.println("Los minutos son validos");
        //         if (segundos>=0&&segundos<=59) {
                    
        //         }
        //     }
        // }
    }
}