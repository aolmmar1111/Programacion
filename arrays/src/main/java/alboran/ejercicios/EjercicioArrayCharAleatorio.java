package alboran.ejercicios;

import java.util.Random;

public class EjercicioArrayCharAleatorio {
    public static void main(String[] args) {
        Random random = new Random();
        int longitud = FuncionesBasicas.longitudArray();
        char [] arrayChar = new char [longitud];
        char letraChar;

        for (int i = 0; i < arrayChar.length; i++) {
            int letraInt = random.nextInt(97,123);
            letraChar = (char) letraInt;

            arrayChar[i] = letraChar;
            System.out.println(arrayChar[i]);
        }

    }
}
