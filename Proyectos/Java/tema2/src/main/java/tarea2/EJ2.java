package tarea2;

import javax.swing.JOptionPane;

public class EJ2 {
    public static void main(String[] args) {
        final double IVA = 1.21;
        String precio = JOptionPane.showInputDialog("¿Cual es el precio del producto sin IVA?");
        double precioInt = Double.parseDouble(precio);
        double precioIva = precioInt * IVA;
        JOptionPane.showMessageDialog(null, "El precio del producto con IVA es de: " + precioIva);

    }
    
}
