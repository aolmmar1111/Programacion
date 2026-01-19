package alboran.modelo;
/*x
Una clase es un molde para crear objetos
Tiene atributos y métodos
Encapsula información relacionada
 */
// Declaración -> public class Nombre
public class Venta {

    // Atributos de instancia
    // Los atributos se inicializan con null (objetos), 0 números, 
    // false booleanos como valores por defecto
    String nombreProductor;
    String tamanioAceituna;
    String tipoAceituna;
    double kg;
    double precioVenta;

    // Métodos de instancia
    // Constructor
    // Permite inicilizar los atributos de un objeto
    // El constructor siempre se llama igual que la clase
    // Nunca especifican dato de retorno
    // Pasamos como parámetro los valores que queremos poner al objeto
    public Venta(String nombre, String tamanio, String tipo, double kg){
        // Usando el puntero this indico que el atributo de este objeto
        // tiene el valor del parámetro
        this.nombreProductor = nombre;
        this.tamanioAceituna = tamanio;
        this.tipoAceituna = tipo;
        this.kg = kg;
    }

    public void mostrarValores(){
        System.out.println("""
                Nombre: %s
                Tamaño: %s
                Tipo: %s
                Kg: %s
                """.formatted(nombreProductor,tamanioAceituna,tipoAceituna,kg));
    }


    ///
}