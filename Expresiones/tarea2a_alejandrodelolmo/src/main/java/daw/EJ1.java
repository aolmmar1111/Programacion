package daw;

import javax.swing.JOptionPane;

public class EJ1 {
    public static void main(String[] args) {
        // Definimos el salario por hora del trabajador, haciendo una constante
        final double SALARIO_POR_HORA = 34.5;

        // Le pedimos al usuario el numero de horas que trabaja semanalmente y
        // convertimos el String a Int para poder hacer el calculo más tarde 
        String numeroHoras = JOptionPane.showInputDialog("Introduce el numero de horas trabajadas este mes");
        int numeroHorasInt = Integer.parseInt(numeroHoras);

        // Metemos el salario un double debido a que puede dar con decimales,
        // En este caso no tendremos que definir expresamente ninguna como
        // double debido a que la constante ya es un double en si.
        double salarioSemanal = numeroHorasInt * SALARIO_POR_HORA;

        // Imprimimos en pantalla el salario semanal del trabajador
        JOptionPane.showMessageDialog(null, """
                Tu salario semanal ha sido de %s euros
                """.formatted(salarioSemanal));
    }
}