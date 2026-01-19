package tarea2;

import javax.swing.JOptionPane;

public class EJ1 {
    public static void main(String[] args) {
        final double SALARIO_HORA = 34.5;

        String horasSemanales = JOptionPane.showInputDialog("¿Cuantas horas has trabajado esta semana?");
        int horasSemanalesInt = Integer.parseInt(horasSemanales);
        double resultado = SALARIO_HORA * horasSemanalesInt;
        JOptionPane.showMessageDialog(null, "Tu salario por semana es de " + resultado);
    }
}
