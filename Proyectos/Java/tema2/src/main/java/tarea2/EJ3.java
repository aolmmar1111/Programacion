package tarea2;

import javax.swing.JOptionPane;

public class EJ3 {
    public static void main(String[] args) {
        final double PI = 3.141592653;
        String radioEsfera = JOptionPane.showInputDialog("¿Cual es el radio de la esfera? (en cm³)");
        double radioEsferaDouble = Double.parseDouble(radioEsfera);

        double volumen = (1.33 * PI) * (Math.pow(radioEsferaDouble, 3));
        JOptionPane.showMessageDialog(null,"El volumen de la esfera es de: " + volumen + "cm³");
    }
}
