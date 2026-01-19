package alboran.dia21del11;

public class PruebaVenta {
    public static void main(String[] args) {
        
        /// Instanciación de un objeto de tipo Venta
        /// para instanciar necesito el constructor y 
        /// usar el operador new --> reservar memoria

        Venta v1 = new Venta("Agricultura Estepona", "Fina", "Picual", 100);

        Venta v2 = new Venta("Casares", "Gruesa", "Hojiblanca", 10);
        
        v1.mostrarVenta();
        v2.mostrarVenta();
    }
}
