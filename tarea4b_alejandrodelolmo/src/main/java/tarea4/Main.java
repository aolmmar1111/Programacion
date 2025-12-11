package tarea4;

public class Main {
    public static void main(String[] args) {
        
        // Declaramos el estudiante y le ponemos unos parametros validos
        Estudiante estudiante1 = new Estudiante("Alejandro del olmo", "1DAW", 101);
        Estudiante estudiante2 = new Estudiante("Ana Perez", "1DAW", 102);

        // Hacemos un par de pruebas donde establecemos que la nota
        // media de estudiante1 es de 8,5
        estudiante1.setNotaMedia(8.5);

        // Ahora vemos que la funcion de aprobado funciona correctamente
        System.out.println(estudiante1.aprobado());

        // Aqui hacemos lo mismo pero poniendo un valor por debajo de 5 
        // para ver que la funcion devuelva false
        estudiante1.setNotaMedia(4.0);
        System.out.println(estudiante1.aprobado());

        // Y por ultimo lo haremos con 5 y 10 los cuales son valores limites

        estudiante1.setNotaMedia(5.0);
        System.out.println(estudiante1.aprobado());

        estudiante1.setNotaMedia(10);
        System.out.println(estudiante1.aprobado());

        // Ahora vemos que despues de establecer la nota media de 0 veremos si 
        // al poner la nota media en 11 la cambia o la deja, deberia NO cambiarla

        estudiante2.setNotaMedia(11);
        System.out.println(estudiante2.getNotaMedia());

        // Probaremos ahora el .toString()
        System.out.println(estudiante1.toString());
        System.out.println(estudiante2.toString());
    }

}
