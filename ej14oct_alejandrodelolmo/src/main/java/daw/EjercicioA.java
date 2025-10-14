package daw;

public class EjercicioA {
    public static void main(String[] args) {
        // Este codigo lo que hace es un bucle del numero 1 que seria el primer numero
        // de la tabla de multiplicar y dentro hace un multiplo de 10 veces de esa tabla
        // al finalizar las 10 veces suma 1 y sigue con el siguiente numero en la tabla de
        // multiplicar
        for (int numero1 = 1; numero1 <= 10; numero1++) {
            System.out.println("Tabla del " + numero1 + "\n");
            for (int numero2 = 1; numero2 <= 10; numero2++) {
                System.out.println(numero1 + " x " + numero2  + " = " + (numero1*numero2));
            }
            System.out.println("\n----------------------\n");
        }
    }
}