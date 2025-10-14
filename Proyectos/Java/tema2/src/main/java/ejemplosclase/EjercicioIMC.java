package ejemplosclase;

import java.util.Scanner;

public class EjercicioIMC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int PESO_MAXIMO = 200;
        final double PESO_MINIMO = 50;
        final int ALTURA_MAXIMA = 250;
        final int ALTURA_MINIMA = 50;

        double peso , alturaCm , alturaM , imc;
        String comprobacion = "";
        do {

            // Le pedimos el peso al usuario en Kg
            do { 
                System.out.println("Introduce tu peso en kilogramos");
                peso = teclado.nextDouble();
            } while (peso > PESO_MAXIMO || peso < PESO_MINIMO);
            
            // Le pedimos al altura al usuario en cm
            do { 
                System.out.println("Introduce tu altura en cm");
                alturaCm = teclado.nextDouble();
            } while (alturaCm < ALTURA_MINIMA || alturaCm > ALTURA_MAXIMA);
            teclado.nextLine();

            // Calculamos el IMC, pasando los centimetros a metros
            // y haciendo la formula del IMC
            alturaM = alturaCm / 100;
            imc = peso / Math.pow(alturaM , 2) ;

            // Mostramos el resultado al usuario
            if (imc < 18.5) {
                System.out.printf("Tu imc es de %.2f, significa que tienes Bajo peso\n", imc);            
            } else if (imc >= 18.5 && imc <= 24.9) {
                System.out.printf("Tu imc es de %.2f, significa que tienes Peso normal\n", imc);
            } else if (imc >= 25 && imc <= 26.9) {
                System.out.printf("Tu imc es de %.2f, significa que tienes Sobrepeso I\n", imc);
            } else if (imc >= 27 && imc <= 29.9){
                System.out.printf("Tu imc es de %.2f, significa que tienes Sobrepeso II\n", imc);
            } else if (imc > 30){
                System.out.printf("Tu imc es de %.2f, significa que tienes Obesidad\n", imc);
            }

            // Preguntamos al usuario si quiere repetirlo otra vez, si pone "si" se repetirá
            // si pone "no" se terminará , si ponga algo diferente preguntará de nuevo
            do { 
                System.out.println("Quieres ejecutar otra vez?");
                comprobacion = teclado.nextLine();

                if ("no".equalsIgnoreCase(comprobacion)) {
                    break;
                }
            } while (!("si".equalsIgnoreCase(comprobacion)));
        } while (("si".equalsIgnoreCase(comprobacion)));
    }
}
