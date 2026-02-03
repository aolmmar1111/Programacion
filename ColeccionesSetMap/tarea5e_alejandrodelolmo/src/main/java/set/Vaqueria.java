package set;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Vaqueria {
    private Set<Vaca> listaVacas;

    public Vaqueria(){
        this.listaVacas = new HashSet<>();
    }

    public int numeroVacas (){
        return this.listaVacas.size();
    }

    public void añadirVaca(Vaca vaquita){
        this.listaVacas.add(vaquita);
    }

    public boolean tieneVaca (){
        return this.listaVacas.isEmpty();
    }

    public boolean estaEnVaqueria (Vaca vaquita){
        return this.listaVacas.contains(vaquita);
    }

    public ArrayList sacarAnimales (){
        ArrayList array1 = 
    }
}   
