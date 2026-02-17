package daw;

public class Main {
    public static void main(String[] args) {
        Traductor ingles = new Traductor();
        ingles.guardarTraduccion("dog", "perro");
        ingles.guardarTraduccion("cat", "gato");

        ingles.imprimir();
        ingles.imprimir2();
        ingles.imprimir3();     
    }
}
