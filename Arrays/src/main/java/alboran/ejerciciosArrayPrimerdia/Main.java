package alboran.ejerciciosArrayPrimerdia;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int [] arrayInt;

        arrayInt = new int [10];
        
        // Random para rellenar el array aleatoriamente
        Random random = new Random();
        //random.nextInt(100,201);
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = random.nextInt(100,201);
        }

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("Posicion " + (i) + " es: "+ arrayInt[i]);
        }

        for (int i = 0; i < (arrayInt.length - 1); i++) {
            System.out.print(arrayInt[i] + "-");
        }
        
    }
}