package daw;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    private Puerta puerta;
    private List<Ventana> ventanas;
    private List<Calefactor> calefactores;

    public Casa (Ventana v, Puerta p){
        this.puerta = p;
        this.ventanas = new ArrayList<>();
        ventanas.add(v);
        this.calefactores = new ArrayList<>();
    }
}
