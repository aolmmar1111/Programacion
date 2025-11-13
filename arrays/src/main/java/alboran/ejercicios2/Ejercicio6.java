package alboran.ejercicios2;

import java.util.Scanner;

public class Ejercicio6 {

    /// 6.- Funcion que recibe un String. Lo transforma a array de char y devuelve si es un palindromo
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce un texto:");
        String palabra = tec.nextLine();

        encontrarPalindromo(palabra);
    }
    public static boolean encontrarPalindromo(String palabra) {
        int longitud = palabra.length();
        char [] arrayChar = new char [longitud];
        
        for (int i = 0; i < arrayChar.length; i++) {

        }
        return false;
    }
}
