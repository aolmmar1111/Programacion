package daw;

import java.util.Scanner;

public class EjercicioD {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean incorrecto = false;
        int dia,mes,year;

        do {
            System.out.println("Introduce el numero del dia");
            dia = teclado.nextInt();
            System.out.println("Introduce el numero del mes");
            mes = teclado.nextInt();
            System.out.println("Introduce el año");
            year = teclado.nextInt();

            boolean bisiesto = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;

            switch (mes) {
                case 1,3,5,7,8,10,12:
                    if (dia > 31 || dia < 0)  {
                        System.out.println("El mes introducido solo tiene 31 dias");
                        incorrecto = true;
                    } else {
                        System.out.println("La fecha introducida es correcta");
                    }
                    break;
                case 4,6,9,11:
                    if (dia > 30 || dia < 0) {
                        System.out.println("El mes introducido solo tiene 30 dias");
                        incorrecto = true;
                    } else {
                        System.out.println("La fecha introducido es correcta");
                    }
                    break;
                case 2:
                    if (bisiesto == true) {
                        if (dia > 29 || dia < 0) {
                            System.out.println("El mes introducido tiene 29 dias");
                            incorrecto = true;
                        } else {
                            System.out.println("La fecha es correcta");
                        }
                    } else {
                        if (dia > 28 || dia < 0) {
                            System.out.println("El mes introducido tiene 28 dias");
                            incorrecto = true;
                        } else {
                            System.out.println("La fecha es correcta");
                            incorrecto = false;
                        }
                    }
            }
            if (mes > 12) {
                incorrecto = true;
                System.out.println("Introduce un mes entre el 1 (Enero) y 12 (Diciembre)");
            }
        } while (incorrecto == true);
    }
}
