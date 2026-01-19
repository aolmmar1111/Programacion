package alejandrodelolmo;

import java.util.Scanner;

public class ParteA {
    public static void main(String[] args) {
        // Definimos la constante del precio de las reparaciones
        // esta la definiremos en un Double debido a que lleva decimales
        final double COSTE_REPARACIONES = 32.6;

        // Inicializamos el Scanner teclado
        Scanner teclado = new Scanner(System.in);

        // Pedimos al usuario el numero de reparaciones cada dia
        // esto lo meteremos en un Int por que no tiene sentido
        // guardarlo en algo que tenga decimales debido a que
        // no se pueden reparar 1.2 ordenadores
        System.out.println("¿Cuantas reparaciones el lunes?");
        int numeroReparacionesLunes = teclado.nextInt();
        System.out.println("¿Cuantas reparaciones el martes?");
        int numeroReparacionesMartes = teclado.nextInt();
        System.out.println("¿Cuantas reparaciones el miercoles?");
        int numeroReparacionesMiercoles = teclado.nextInt();
        System.out.println("¿Cuantas reparaciones el jueves?");
        int numeroReparacionesJueves = teclado.nextInt();
        System.out.println("¿Cuantas reparaciones el viernes?");
        int numeroReparacionesViernes = teclado.nextInt();


        // Calculamos el numero total de reparaciones semanales, esto nos servirá
        // luego para calcular las ganancias semanales debido a que el coste de 
        // reparaciones no cambia
        float numeroReparacionesSemanales = numeroReparacionesLunes + numeroReparacionesMartes + numeroReparacionesMiercoles
        + numeroReparacionesJueves + numeroReparacionesViernes;

        // Operaciones para calcular las ganancias de cada dia, esto nos servirá luego para 
        // esto luego nos servirá para mostrarlo al usuario
        float gananciasLunes = numeroReparacionesLunes * (float) COSTE_REPARACIONES;
        float gananciasMartes = numeroReparacionesMartes * (float) COSTE_REPARACIONES;
        float gananciasMiercoles = numeroReparacionesMiercoles * (float) COSTE_REPARACIONES;
        float gananciasJueves = numeroReparacionesJueves * (float) COSTE_REPARACIONES;
        float gananciasViernes = numeroReparacionesViernes * (float) COSTE_REPARACIONES;

        // Calculamos el dinero que hemos ganado esa semana, sabiendo el numero de reparaciones
        // y usando la constante del precio de las reparaciones
        float gananciasSemanales = numeroReparacionesSemanales * (float) COSTE_REPARACIONES;

        // Imprimimos el dinero que se ha ganado cada dia, limitando la salida a 3 decimales
        // Para eso tendremos que usar printf
        System.out.printf("El lunes se han ganado un total de %.3f euros en reparaciones\n", gananciasLunes);
        System.out.printf("El martes se han ganado un total de %.3f euros en reparaciones\n", gananciasMartes);
        System.out.printf("El miercoles se han ganado un total de %.3f euros en reparaciones\n", gananciasMiercoles);
        System.out.printf("El jueves se han ganado un total de %.3f euros en reparaciones\n", gananciasJueves);
        System.out.printf("El viernes se han ganado un total de %.3f euros en reparaciones\n", gananciasViernes);

        // Aqui imprimimos en consola las ganancias semanales que ha tenido la tienda
        System.out.printf("Has ganado un total de: %.3f euros semanales\n", gananciasSemanales);

        // Evaluamos si se ha ganado entre 0 y 3000 euros e imprimimos en consola el resultado
        boolean evaluacionGanancias = gananciasSemanales > 0 && gananciasSemanales < 3000;
        System.out.println("¿Se han ganado más de 3000 euros esta semana? " + !(evaluacionGanancias));

    }
}