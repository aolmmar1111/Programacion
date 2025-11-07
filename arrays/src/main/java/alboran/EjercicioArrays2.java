package alboran;

import java.util.Scanner;

public class EjercicioArrays2 {

    private static final Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {
        int [] arrayInt;
        int longitud;
        boolean repetir = false;
        do {
            System.out.println("""
                ¿Que quieres hacer?

                1- Sumar los elementos de un array y mostrar resultado

                2- Media aritmetica de los numeros de un array

                3- Contar numero de veces que aparece un numero en un array
                """);
            int opcion = tec.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("¿Cuantos numeros quieres introducir?");
                    longitud = tec.nextInt();
                    arrayInt = new int[longitud];

                    for (int i = 0; i < arrayInt.length; i++) {
                        System.out.print("Introduce un numero:");
                        arrayInt[i] = tec.nextInt();
                    }

                    int arraySumado = sumarArrays(arrayInt);
                    System.out.println("La suma de los numeros es de: " + arraySumado);
                    repetir = false;
                }
                case 2 -> {
                    System.out.println("¿Cuantos numeros quieres introducir?");
                    longitud = tec.nextInt();
                    arrayInt = new int[longitud];

                    for (int i = 0; i < arrayInt.length; i++) {
                        System.out.print("Introduce un numero:");
                        arrayInt[i] = tec.nextInt();
                    }

                    double mediaAritmetica = mediaAritmetica(arrayInt);
                    System.out.println("La media aritmetica es de: " + mediaAritmetica);
                    repetir = false;
                }
                case 3 -> {
                    System.out.println("¿Cuantos numeros quieres introducir?");
                    longitud = tec.nextInt();
                    arrayInt = new int[longitud];

                    for (int i = 0; i < arrayInt.length; i++) {
                        System.out.print("Introduce un numero:");
                        arrayInt[i] = tec.nextInt();
                    }

                    int numeroRepetido = numeroRepetido(arrayInt);
                    System.out.println("Se ha repetido un total de: " + numeroRepetido + " veces");
                    repetir = false;
                }
                default -> {
                    System.out.println("Tienes que introducir un numero del 1 al 3");
                    repetir = true;
                }
            }
        } while (repetir);
    }

    public static int sumarArrays(int[] arrayInt) {
        int arraySumado = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            arraySumado += arrayInt[i];
        }
        return arraySumado;
    }

    public static double mediaAritmetica(int[] arrayInt) {
        double arrayMedia = 0.0;

        for (int i = 0; i < arrayInt.length; i++) {
            arrayMedia += arrayInt[i];
        }
        arrayMedia = arrayMedia / arrayInt.length;

        return arrayMedia;
    }
    public static int numeroRepetido(int[] arrayInt) {
        int resultado = 0, numero;

        System.out.println("¿Que numero quieres comprobar?");
        numero = tec.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (numero == arrayInt[i]) {
                resultado++;
            }
        }
        return resultado;
    }
}
