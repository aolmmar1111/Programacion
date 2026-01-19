package ejemplosclase;

import javax.swing.JOptionPane;

public class Ejemplo30Sep {
    public static void main(String[] args) {

        String aux = JOptionPane.showInputDialog("Introduce el numero de reparaciones");
        
        aux = JOptionPane.showInputDialog("Precio Lunes:");
        double precioReparacionesLunes = Double.parseDouble(aux);

        if (precioReparacionesLunes<0 && precioReparacionesLunes < 70){
            System.out.println("Entro en el if del precio");
            if (precioReparacionesLunes > 0){
                System.out.println("Precio y numero reparaciones");
            }
        }
    }

}
