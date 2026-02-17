package set;

import java.util.ArrayList;
import java.util.TreeSet;

public class VaqueriaOrdenada {
    private TreeSet<Vaca> listaOrdenadaDeVacas;
    
    public VaqueriaOrdenada (){
        this.listaOrdenadaDeVacas = new TreeSet<>();
    }

    public int numeroVacas (){
        return this.listaOrdenadaDeVacas.size();
    }

    public void añadirVaca(Vaca vaquita){
        this.listaOrdenadaDeVacas.add(vaquita);
    }

    public boolean estaVacia (){
        return this.listaOrdenadaDeVacas.isEmpty();
    }

    public boolean estaEnVaqueria (Vaca vaquita){
        return this.listaOrdenadaDeVacas.contains(vaquita);
    }

    public ArrayList<Vaca> sacarAnimales (){
        ArrayList<Vaca> array1 = new ArrayList<>();
        for (Vaca vaca : listaOrdenadaDeVacas) {
            array1.add(vaca);
        }
        return array1;
    }

    public void darDeBaja(Vaca vaquita){
        this.listaOrdenadaDeVacas.remove(vaquita);
    }
}
