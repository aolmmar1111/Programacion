package alboran.dia17del11;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int tam = 0;
        int [] arrayMain = null;
        boolean salir = false;
        Scanner teclado = new Scanner(System.in);

        do {              
            try {
                tam = teclado.nextInt();
            } catch ()
        } while (!salir);

        System.out.println(Arrays.toString(args));
        System.out.println("--------");
    }
}
