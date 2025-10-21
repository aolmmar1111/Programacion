package ejemplosclase;

import java.util.Scanner;

public class EstructurasRepeticion3 {
    public static void main(String[] args) {
        /*
         * Calcular el cuadro de amortizacion de la ocmpra de una vivienda
         * el programa solicita el precio de la viviendo y el numero de meses a pagar.
         * Los pagos mensaules se realizan aportando la mitad de lo que quede por pagar
         * del mes anterior, hasta que se llegue al ultimo mes que se paga lo que quede
         * de deuda
         */

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el precio de la vivienda");
        int precioVivienda = teclado.nextInt();
        System.out.println("Introduce el numero de meses");
        int numeroMeses = teclado.nextInt();
        double primeraCuota = precioVivienda / 2;
        double suma = 0;

        System.out.println("  -------------------------------------");
        System.out.println("  |       Cuadro de amortización      |");
        System.out.println("  -------------------------------------");
        System.out.println();
        suma += primeraCuota;
        for (int i = 1; i < numeroMeses; i++) {

            double coutaMes = primeraCuota / 2;
            System.out.println("  -------------------------------------");
            System.out.println("  |  El mes " + i + " tendrás que pagar " + coutaMes + " |");
            primeraCuota = coutaMes;
            suma += coutaMes;
        }
        System.out.println("  -------------------------------------");
        System.out.println("  |  El mes " + numeroMeses + " tendrás que pagar " + (precioVivienda - suma) + " |");
        System.out.println("  -------------------------------------");
        System.out.println("\nSe ha amortizado un total de " + (suma + (precioVivienda - suma)) + "euros");
    }
}
