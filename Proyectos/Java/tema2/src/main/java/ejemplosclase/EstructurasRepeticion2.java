package ejemplosclase;

import java.util.Scanner;

public class EstructurasRepeticion2 {
    public static void main(String[] args) {
        // Cuenta atras desde 100 a 0
        // y solo imprimimos los impares

        Scanner teclado = new Scanner(System.in);
        // for (int i = 0; i < 100; i++) {
        //     while (i % 2 != 0) {
        //         System.out.println(i);
        //         break;
        //     }
        // }

        // int year;
        // do {
        //     System.out.println("Introduce un año");
        //     year = teclado.nextInt();
        // } while (!((year % 400 == 0) || (year % 4 == 0) && (year % 100 !=0)));

        // Sumar los numeros que introduce el usuario hasta que 
        // introduzca el numero -1

        // double numero;
        // double suma = 0;
        // do { 
        //     System.out.println("Introduce un numero");
        //     numero = teclado.nextDouble();
        //     suma += numero;
        // } while (numero != -1);
        // suma ++;
        // System.out.println(suma);

        /*
         * Calcular el salario semanal de los empleados
         * Cobran 15 euros la hora si no superas las 35 semanales.
         * Cada hora que supere las 25 se paga como extra a 22 euros.
         * El prorgrama debe pedir las horas al usuario y mostrar
         * El sueldo final. Una vez termina la ejecucion preguntamos
         * si queremos calcular otro salario. Si el usuario escribe
         * Si, SI, sI o si el programa se ejecuta de nuevo, en otro
         * caso termina. Además, si el usuario se equivoca e introduce
         * horas negativas el programa debe pedirlas de nuevo
         */

        final double SALARIO_HORA_REGULAR = 15;
        final double SALARIO_HORA_EXTRA = 22;
        final int HORAS_REGULARES = 35;
        
        int horasSemanales;
        String repetirSalario;
        double resultadoSalario; 
        do { 
            do {
                System.out.println("Introduce el numero de horas semanales que ha trabajado");
                horasSemanales = teclado.nextInt();

                if (horasSemanales >= HORAS_REGULARES) {
                    horasSemanales -= HORAS_REGULARES;
                    double resultadoExtra = horasSemanales * SALARIO_HORA_EXTRA;
                    double resultadoNormal = HORAS_REGULARES * SALARIO_HORA_REGULAR;
                    resultadoSalario = resultadoExtra + resultadoNormal;
                } else {
                    resultadoSalario = horasSemanales * SALARIO_HORA_REGULAR;
                }
                if (horasSemanales < 0) {
                    System.out.println("Introduce un numero de horas positivas\n");
                } else {
                    System.out.println("Su salario ha sido de " + resultadoSalario);
                }
            } while (horasSemanales < 0);
            System.out.println("Quiere calcular otro salario?");
            teclado.nextLine();
            repetirSalario = teclado.nextLine();
        } while ("si".equalsIgnoreCase(repetirSalario));
    }
}
