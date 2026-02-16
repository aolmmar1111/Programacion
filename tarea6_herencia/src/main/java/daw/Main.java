package daw;

public class Main {
    public static void main(String[] args) {
        Ventana v1 = new Ventana("plastico");
        Ventana v2 = new Ventana("Aluminio");
        System.out.println(v1);
        System.out.println(v2);
        

        Casa casa = new Casa(v2, new Puerta());
        System.out.println(casa);
    }
}
