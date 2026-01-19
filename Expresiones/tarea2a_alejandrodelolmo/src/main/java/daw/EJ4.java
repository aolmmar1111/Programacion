package daw;

import javax.swing.JOptionPane;

public class EJ4 {
    public static void main(String[] args) {
        // Definimos la constante del cambio de Euros a Dolares.
        final double CAMBIO_EURO_DOLAR = 1.17;

        // Pedimos la cantidad de dolares y la cambiamos a double
        String cantidadDolares = JOptionPane.showInputDialog("¿Cuantos dolares desea cambiar?");
        double cantidadDolaresDouble = Double.parseDouble(cantidadDolares);

        // Convertimos a Euros multiplicando la cantidad de dolares por el cambio
        double cantidadEuros = cantidadDolaresDouble / CAMBIO_EURO_DOLAR;
        JOptionPane.showMessageDialog(null, """
                Esta %.2f es la cantidad de euros que recibes por %s dolares
                """.formatted(cantidadEuros,cantidadDolaresDouble));
    }
}
