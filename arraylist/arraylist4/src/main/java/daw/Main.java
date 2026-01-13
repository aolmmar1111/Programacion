package daw;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.lang3.RandomStringUtils;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> listapin = new ArrayList<>();
        String aux;
        int bucle = 50;
        for (int i = 0; i < bucle; i++) {
            aux = RandomStringUtils.randomNumeric(4);
            if (listapin.indexOf(aux) < 0) {
                listapin.add(aux);
            } else {
                bucle++;
            }
        }
        int repetidos = 0;
        for (int i = 0; i < listapin.size(); i++) {
            aux = listapin.get(i);
            if (listapin.indexOf(aux) != listapin.lastIndexOf(aux)) {
                repetidos++;
            }
        }
        
        System.out.println(repetidos + " numeros repetidos");
        // Comprobacion que funciona
        // listapin.set(42, "1020");
        String pin;
        do {
            System.out.println("Introduzca un pin de 4 digitos");
            pin = teclado.nextLine();
            if (pin.length() != 4) {
                System.out.println("Tiene que ser de 4 digitos, intentelo de nuevo");
            }
        } while (pin.length() != 4);
        long inicio = System.nanoTime();
        int posicion = EncontrarPin(listapin, pin);
        long fin = System.nanoTime();
        System.out.println("Tiempo: " + (fin - inicio) + " ms");

        if (posicion == -1) {
            System.out.println("El pin no se encuentra en la lista");
        } else {
            System.out.println("El pin se encuentra en la posicion " + posicion);
        }
    }

    public static int EncontrarPin(ArrayList<String> listapin, String pin) {
        return listapin.indexOf(pin);
    }
}