package daw;

import javax.swing.JOptionPane;

public class EJ3 {
    public static void main(String[] args) {

        // Pedimos el radio al usuario y lo convertimos a double.
        String radio = JOptionPane.showInputDialog("Introduce el radio de la esfera");
        double radioDouble = Double.parseDouble(radio);
        
        // Realizamos la formula del volumen de la esfera la cual es:
        // 4/3 * PI * r³.
        double volumen = (4/3.0) * Math.PI * Math.pow(radioDouble, 3);

        // A continuación mostramos el volumen
        JOptionPane.showMessageDialog(null, """
                La esfera con radio %s tiene %.2f cm3 de volumen
                """.formatted(radioDouble,volumen));
    }
}
