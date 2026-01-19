package alboran.aceitunas;

import javax.swing.JOptionPane;

public class Funciones {

    // Constante para el precio incial del kg de aceituna
    public static final double PRECIO_INICIAL = 1.23;
    // Constantes de clase para el tipo
    public static final String ALORENA = "aloreña";
    public static final String PICUAL = "picual";
    public static final String HOJIBLANCA = "hojiblanca";
    // Constantes de clase para el tamaño
    public static final String FINA = "fina";
    public static final String GRUESA = "Gruesa";

    // Necesitamos: Precio inicial kg, total kg, tipo y tamaño aceituna
    // Devuelve: precio venta double
    public static double calcularPrecioVenta(double precioInicial, double kg, String tamanio, String tipo){
        double precioFinal = 0;

        // cálculos
        switch (tipo) {
            case PICUAL:
                precioFinal = tamanio.equals(GRUESA)?(precioInicial+0.20)*kg:(precioInicial+0.30)*kg;
                break;
            case ALORENA:
                precioFinal = tamanio.equals(GRUESA)?(precioInicial-0.15)*kg:(precioInicial-0.30)*kg;
                break;
            case HOJIBLANCA:
                precioFinal = tamanio.equals(GRUESA)?(precioInicial+0.15)*kg:(precioInicial+0.05)*kg;
                break;
        }

        return precioFinal;
    }

    public static int pedirOpcion() {
        int opcion = 0;
        String opcionString;
        opcionString = JOptionPane.showInputDialog(Mensajes.menuInicial);
        opcion = Integer.parseInt(opcionString);
        return opcion;
    }

    // Función para pedir el tipo de aceituna
    // Devuelve un tipo de los tres posibles
    public static String pedirTipoAceituna() {
        String tipo = "";
        do {
            tipo = JOptionPane.showInputDialog("Introduce un tipo de los posibles (picual, aloreña, hojiblanca)");
        } while (!tipo.equalsIgnoreCase(HOJIBLANCA) && !tipo.equalsIgnoreCase(ALORENA)
                && !tipo.equalsIgnoreCase(PICUAL));

        return tipo;
    }

    // Función para pedir el tamaño
    // Devuelve un int indicando 1 gruesa y 2 fina
    public static int pedirTamanioAceituna() {
        int tamanioInt = 0;
        String tamanio;
        do {
            tamanio = JOptionPane.showInputDialog("Introduce un tamaño de los posibles (fina o gruesa)");
        } while (!tamanio.equalsIgnoreCase(FINA) && !tamanio.equalsIgnoreCase(GRUESA));

        // Seguro que tamanio tiene fina o gruesa
        tamanioInt = tamanio.equalsIgnoreCase(GRUESA) ? 1 : 2;

        return tamanioInt;
    }

    // Función pedir kg. No pueden ser negativos
    public static double pedirKg() {
        double kg = 0;
        String kgTexto = "";
        
        
        do {
            try{
                kgTexto = JOptionPane.showInputDialog("¿Cuántos kg traes?");
                kg = Double.parseDouble(kgTexto);
                if (kg>0){
                    break;
                }
                System.out.println("El número de kg no puede ser negativo");
            } catch (NumberFormatException nfe){
                // Gestion del error
                System.out.println("Introduce correctamente los kg");
            }
            
        } while (true);

        return Math.abs(kg);
    }
}