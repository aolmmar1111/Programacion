package daw;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.lang3.RandomStringUtils;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> listapin = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            listapin.add(RandomStringUtils.randomNumeric(4));
        }
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

        int posicion = EncontrarPin(listapin, pin);
        if (posicion == -1) {
            System.out.println("El pin no se encuentra en la lista");
        } else {
            System.out.println("El pin se encuentra en la posicion " + posicion);
        }
    }
    public static int EncontrarPin (ArrayList<String> listapin, String pin){
        for (int i = 0; i < listapin.size(); i++) {
            if (listapin.get(i).equalsIgnoreCase(pin)) {
                return i;
            }
        }
        return -1;
    }
}