package set;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pruebas {
    public static void main(String[] args) {
        // Inicializamos la vaqueriaOrdenada
        VaqueriaOrdenada vaqueria = new VaqueriaOrdenada();

        //Creamos 4 vaquitas, creando primero la 4 que la 3 para luego ver que aún asi 
        // la lista estará ordeanada
        Vaca vaquita1 = new Vaca(1, LocalDate.now(), "Vaca 1");
        Vaca vaquita2 = new Vaca(2, LocalDate.now(), "Vaca 2");
        Vaca vaquita4 = new Vaca(4, LocalDate.now(), "Vaca 4");
        Vaca vaquita3 = new Vaca(3, LocalDate.now(), "Vaca 3");

        // Las añadimos ocn el mismo orden con el que se han creado
        vaqueria.añadirVaca(vaquita1);
        vaqueria.añadirVaca(vaquita2);
        vaqueria.añadirVaca(vaquita4);
        vaqueria.añadirVaca(vaquita3);

        // Imprimimos el numero de vacas y toda la lista de animales
        System.out.println(vaqueria.numeroVacas());
        ArrayList vaqueriaArray = vaqueria.sacarAnimales();
        for (Object vaca : vaqueriaArray) {
            System.out.println(vaca);
        }

        // Probamos los metodos de si esta vacia y si esta en vaqueria
        System.out.println(vaqueria.estaVacia());
        System.out.println(vaqueria.estaEnVaqueria(vaquita3));

    }
}
