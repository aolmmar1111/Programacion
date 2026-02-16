package daw;

public class Prueba {


    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Alejandro paez", "98076543P", 18);

        Empleado empleado1 = new Empleado(persona1, 1200);
        Empleado empleado2 = new Empleado();

        Programador programador1 = new Programador(empleado1, Categoria.ANALISTA);
        Programador programador2 = new Programador();

        System.out.println(programador1.toString());
        programador1.aumentarSalario(100);
        System.out.println(programador1.toString());

        System.out.println(empleado2.toString());
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
    }
}
