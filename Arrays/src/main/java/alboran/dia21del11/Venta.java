package alboran.dia21del11;

public class Venta {

    // Atributos de instancia
    // Los atributos se inicializan con null (objetos)
    // 0 (numeros) , false booleanos como valores por defecto
    String nombreProductor,tamanioAceituna,tipoAceituna;
    double kg,precioVenta;

    // Métodos de instancia
    // Constructor
    // Permite inicializar los atributos de un objeto
    // El constructor siempre se llama igual que la clase
    // Nunca especifican datos de retorno
    // Pasamos como parametro los valores 
    // que queremos poner al objeto

    public Venta(String nombre, String tamanio, String tipo, double kg){
        /// Usando el puntero this inidico que el atributo
        /// de este objeto tiene el valor del parametro
        
        this.nombreProductor = nombre;
        this.tamanioAceituna = tamanio;
        this.tipoAceituna = tipo;
        this.kg = kg;
    }
    public void mostrarVenta (){
        System.out.println("Nombre: " + this.nombreProductor  + " tamaño: " + this.tamanioAceituna + " Tipo de aceituna: "  + this.tipoAceituna + " kg:" + this.kg);
    }
}
