package tarea2;

import javax.swing.JOptionPane;

public class EJ4 {
    public static void main(String[] args) {
        final double CAMBIO_DOLAR_A_EURO = 0.85;
        String cantidadDolares = JOptionPane.showInputDialog("¿Cuantos dolares quieres cambiar?");
        double cantidadDolaresDouble = Double.parseDouble(cantidadDolares);
        double cantidadEuros = cantidadDolaresDouble * CAMBIO_DOLAR_A_EURO;
        JOptionPane.showMessageDialog(null, "Tienes un total de " + cantidadEuros + " despues del cambio");
    }
}
