package daw;

import javax.swing.JOptionPane;

public class EJ2 {
    public static void main(String[] args) {
        // Definimos el IVA, al ser siempre 21% simplemente multiplicaremos el
        // precio del producto por 1.21 y hará la misma función.
        final double IVA = 1.21;

        // Le pedimos al usuario que nos introduzca el precio del producto
        // sin IVA, lo metemos en un Double por que es posible que el producto
        // contenga decimales.
        String precioSinIva = JOptionPane.showInputDialog("Introduce el precio del producto sin IVA");
        double precioDouble = Double.parseDouble(precioSinIva);

        // Calculamos el precio con IVA y lo mostramos en pantalla
        double precioConIva = precioDouble * IVA;
        JOptionPane.showMessageDialog(null, """
                    El precio del producto con IVA es de %s
                """.formatted(precioConIva));
    }
}
