package daw;

import javax.swing.JOptionPane;

public class EJ5 {
    public static void main(String[] args) {
        
        // Le pedimos al usuario 2 puntos en un plano, cada punto tiene que tener 
        // una posicion X e Y, después de cada dato pedido, cambiaremos a double
        // este proceso se repite 4 veces para asi tener los 2 planos
        String punto1X = JOptionPane.showInputDialog("Introduce el punto x de la primera coordenada");
        double punto1XDouble = Double.parseDouble(punto1X);

        String punto1Y = JOptionPane.showInputDialog("Introduce el punto y de la primera coordenada");
        double punto1YDouble = Double.parseDouble(punto1Y);

        String punto2X = JOptionPane.showInputDialog("Introduce el punto x de la segunda coordenada");
        double punto2XDouble = Double.parseDouble(punto2X);

        String punto2Y = JOptionPane.showInputDialog("Introduce el punto y de la segunda coordenada");
        double punto2YDouble = Double.parseDouble(punto2Y);

        // Sacamos la distancia de los ejes X e Y de ambos puntos para
        // asi poder sacar los catetos y luego poder sacar la hipotenusa
        double distanciaPuntosX = punto2XDouble - punto1XDouble; 
        double distanciaPuntosY = punto2YDouble - punto1YDouble;

        // Sacamos la hipotenusa haciendo la raiz cuadrada de los catetos al cuadrado
        double hipotenusa = Math.sqrt(Math.pow(distanciaPuntosX, 2) + Math.pow(distanciaPuntosY, 2));

        // Booleanos para evaluar el valor de los puntos
        boolean evalDistanciaPunto1X = (punto1XDouble <= 10 && punto1XDouble >= -10);
        boolean evalDistanciaPunto1Y = (punto1YDouble <= 10 && punto1YDouble >= -10);
        boolean evalDistanciaPunto2X = (punto2XDouble <= 10 && punto2XDouble >= -10);
        boolean evalDistanciaPunto2Y = (punto2YDouble <= 10 && punto2YDouble >= -10); 
        
        // Mostramos tanto los puntos como la distancia final
        JOptionPane.showMessageDialog(null, """
                La distancia entre los puntos %s , %s y %s , %s es de %s

                Evaluación de los puntos:
                - ¿La coordenada X del Punto 1 está entre -10 y 10? = %s
                - ¿La coordenada Y del Punto 1 está entre -10 y 10? = %s
                - ¿La coordenada X del Punto 2 está entre -10 y 10? = %s
                - ¿La coordenada Y del Punto 2 está entre -10 y 10? = %s

                """.formatted(punto1XDouble,punto1YDouble,punto2XDouble,punto2YDouble,
                hipotenusa,evalDistanciaPunto1X,evalDistanciaPunto1Y,evalDistanciaPunto2X,evalDistanciaPunto2Y));
    }
}
