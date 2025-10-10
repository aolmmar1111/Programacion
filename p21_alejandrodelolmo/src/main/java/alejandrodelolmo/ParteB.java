package alejandrodelolmo;

import javax.swing.JOptionPane;

public class ParteB {
    public static void main(String[] args) {

        // Lunes
        String textoPrecioReparacionesLunes = JOptionPane.showInputDialog("¿Cual ha sido el precio por reparacion el lunes?");
        double precioReparacionesLunes = Double.parseDouble(textoPrecioReparacionesLunes);
        String textoNumeroReparacionesLunes = JOptionPane.showInputDialog("¿Cuantas reparaciones hiciste el lunes?");
        int numeroReparacionesLunes = Integer.parseInt(textoNumeroReparacionesLunes);

        // Martes
        String textoPrecioReparacionesMartes = JOptionPane.showInputDialog("¿Cual ha sido el precio por reparacion el martes?");
        double precioReparacionesMartes = Double.parseDouble(textoPrecioReparacionesMartes);
        String textoNumeroReparacionesMartes = JOptionPane.showInputDialog("¿Cuantas reparaciones hiciste el martes?");
        int numeroReparacionesMartes = Integer.parseInt(textoNumeroReparacionesMartes);

        // Miercoles
        String textoPrecioReparacionesMiercoles = JOptionPane.showInputDialog("¿Cual ha sido el precio por reparacion el miercoles?");
        double precioReparacionesMiercoles = Double.parseDouble(textoPrecioReparacionesMiercoles);
        String textoNumeroReparacionesMiercoles = JOptionPane.showInputDialog("¿Cuantas reparaciones hiciste el miercoles?");
        int numeroReparacionesMiercoles = Integer.parseInt(textoNumeroReparacionesMiercoles); 

        // Jueves
        String textoPrecioReparacionesJueves = JOptionPane.showInputDialog("¿Cual ha sido el precio por reparacion el jueves?");
        double precioReparacionesJueves = Double.parseDouble(textoPrecioReparacionesJueves);
        String textoNumeroReparacionesJueves = JOptionPane.showInputDialog("¿Cuantas reparaciones hiciste el jueves?");
        int numeroReparacionesJueves = Integer.parseInt(textoNumeroReparacionesJueves);

        // Viernes
        String textoPrecioReparacionesViernes = JOptionPane.showInputDialog("¿Cual ha sido el precio por reparacion el viernes?");
        double precioReparacionesViernes = Double.parseDouble(textoPrecioReparacionesViernes);
        String textoNumeroReparacionesViernes = JOptionPane.showInputDialog("¿Cuantas reparaciones hiciste el viernes?");
        int numeroReparacionesViernes = Integer.parseInt(textoNumeroReparacionesViernes);

        // Hacemos los calculos de las ganancias diarias, esto nos servirá más
        // tarde para hacer el calculo de las ganancias semanales que ha tenido
        // la tienda esa semana, tendremos que castear precioReparacionesLunes
        // como float debido a que es un double y si no lo hacemos asi la operacion
        // no se podrá guardar en una variable float
        float gananciasLunes = numeroReparacionesLunes *  (float) precioReparacionesLunes;
        float gananciasMartes = numeroReparacionesMartes *  (float) precioReparacionesMartes;
        float gananciasMiercoles = numeroReparacionesMiercoles * (float) precioReparacionesMiercoles;
        float gananciasJueves = numeroReparacionesJueves * (float) precioReparacionesJueves;
        float gananciasViernes = numeroReparacionesViernes * (float) precioReparacionesViernes;

        // Hacemos el calculo de las ganancias semanales y evaluamos si se han ganado
        // entre 100 y 1000 euros esa semana, después impriremos las ganancias de cada dia
        // y más tarde impriremos en consola la evaluacion de las ganancias
        float gananciasSemanales = gananciasLunes + gananciasMartes + gananciasMiercoles + gananciasJueves + gananciasViernes;
        boolean evaluacionGanancias = gananciasSemanales < 100 && gananciasSemanales > 1000;
        JOptionPane.showMessageDialog(null, """
                El lunes se han ganado un total de %.1f euros en reparaciones

                El martes se han ganado un total de %.1f euros en reparaciones

                El miercoles se han ganado un total de %.1f euros en reparaciones

                El jueves se han ganado un total de %.1f euros en reparaciones

                El viernes se han ganado un total de %.1f euros en reparaciones

                Esta semana se han ganado un total de %.1f euros en reparaciones
                """.formatted(gananciasLunes,gananciasMartes,gananciasMiercoles,gananciasJueves,gananciasViernes,gananciasSemanales));
        System.out.println("¿Se han ganado entre 100 y 1000 euros esta semana? " + evaluacionGanancias);
    }
}