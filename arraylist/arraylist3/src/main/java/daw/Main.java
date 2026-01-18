package daw;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Introduce un tamaño de lista");
        int tamaño = teclado.nextInt();
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        ArrayList<Integer> listafinal;

        for (int i = 0; i < tamaño; i++) {
            lista1.add(random.nextInt(1,101));
            lista2.add(random.nextInt(1,101));
        }

        System.out.println(lista1.size());

        listafinal = Multiplicar(lista1, lista2);
        System.out.println(lista1.toString());
        System.out.println(lista2.toString());
        System.out.println(listafinal.toString());
    }

    public static ArrayList<Integer> Multiplicar (ArrayList<Integer> int1, ArrayList<Integer> int2){
        int tamaño;
        ArrayList<Integer> listafinal = new ArrayList<>();
        if (int1.size() == int2.size()) {
            tamaño = int1.size();
        } else {
            throw new IllegalArgumentException("Los tamaños de las listas no coinciden");
        }
        for (int i = 0; i < tamaño; i++) {
            listafinal.add(int1.get(i) * int2.get(i));
        }
        return listafinal;
    }
}
