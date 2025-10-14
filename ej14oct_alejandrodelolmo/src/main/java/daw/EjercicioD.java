package daw;

import java.util.Scanner;

public class EjercicioD {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declaramos algunas variables que nos van a servir en un futuro
        boolean incorrecto = false;
        int dia,mes,year;

        // Empezamos el bucle do while que se repetira, si la variable 
        // incorrecto es true, esta variable solo cambiará a true si
        // el mes no coincide con el numero de dias
        do {
            // Preguntamos el numero de dias, mes y años
            System.out.println("Introduce el numero del dia");
            dia = teclado.nextInt();
            System.out.println("Introduce el numero del mes");
            mes = teclado.nextInt();
            System.out.println("Introduce el año");
            year = teclado.nextInt();

            // Comprobamos si el año es bisiesto o no, esto lo usaremos luego 
            // para el mes de febrero
            boolean bisiesto = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;

            // Hacemos un switch donde leamos el mes y dependiendo de que mes
            // Haremos un If para comprobar que el numero de dias es correcto
            // Si no es correcto, le diremos al usuario que el mes no es correcto
            // y cambiaremos el valor de incorrecto a true para asi repetir el bucle
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
                // Este caso es el de febrero, haremos un if buscando que sea bisiesto o no
                // si es bisiesto buscaremos que los dias coincidan con el numero de dias correcto
                case 2:
                    if (bisiesto) {
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
                            System.out.println("La fecha " + dia + "/" + mes + "/" + year + " es correcta");
                        }
                    }
            }
            // Si el usuario pone un mes mayor a 12 haremos que se repita y le diremos que esta poniendo
            // un mes incorrecto
            if (mes > 12) {
                incorrecto = true;
                System.out.println("Introduce un mes entre el 1 (Enero) y 12 (Diciembre)");
            }
        } while (incorrecto == true);
    }
}
