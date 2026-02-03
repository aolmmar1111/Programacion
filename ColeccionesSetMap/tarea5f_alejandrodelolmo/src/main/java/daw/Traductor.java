package daw;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Traductor {
    public static void main(String[] args) {
    }

    private Map<String,String> palabras;

    public Traductor(){
        palabras = new TreeMap<>();
    }

    public void guardarTraduccion (String palabra1, String palabra2){
        palabras.put(palabra1, palabra2);
    }

    public void borrarTraduccion (String key){
        palabras.remove(key);
    }

    public void imprimir (){
        for (Map.Entry<String,String> entrada : palabras.entrySet()){
            String key = entrada.getKey();
            String value = entrada.getValue();
            System.out.println("Palabra: " + key + " traduccion: " + value);
        }
    }

    public void imprimir2(){
        System.out.println(palabras);
    }

    public void imprimir3(){
        for (String key : palabras.keySet()) {
            System.out.println(key + " ......... " + palabras.get(key));
        }
    }

    public Set<String> ObtenerConjuntoKeys (){
        return palabras.keySet();
    }

    public List<String> obtenerListaDeValores (){
        return new ArrayList<>(palabras.values());
    }
}