package tarea2;

import javax.swing.JOptionPane;

public class EJ5 {
    public static void main(String[] args) {
        String punto1X = JOptionPane.showInputDialog("Dime el punto X en el plano del primer punto");
        String punto1Y = JOptionPane.showInputDialog("Ahora dime el punto Y del primer punto");
        String punto2X = JOptionPane.showInputDialog("Dime el punto X en el plano del segundo punto");
        String punto2Y = JOptionPane.showInputDialog("Ahora dime el punto Y del segundo punto");

        int punto1XInt = Integer.parseInt(punto1X);
        int punto1YInt = Integer.parseInt(punto1Y);
        int punto2XInt = Integer.parseInt(punto2X);
        int punto2YInt = Integer.parseInt(punto2Y);

        double distanciaX = punto2XInt - punto1XInt;
        double distanciaY = punto2YInt - punto1YInt;
        
        double distanciaEntrePuntos = Math.sqrt(Math.pow(distanciaX, 2) + Math.pow(distanciaY, 2));
        System.out.println(distanciaEntrePuntos); 
    }
}
