package ejemplosclase;

import java.util.Scanner;

public class Segundos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos segundos quieres pasar a Horas y minutos");
        int segundos = teclado.nextInt();

        int horas = segundos / 3600;
        int restoHoras = segundos % 3600;

        int minutos = restoHoras / 60;
        int segundosFinales = restoHoras % 60;

        System.out.println(horas + " horas " + minutos + " minutos " + segundosFinales + " segundos ");

    }
}
