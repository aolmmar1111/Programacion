package alboran.ejercicios;

public class EjercicioArraysIguales {
    public static void main(String[] args) {
        
    }
    public static String compararString (String [] arrayString1 , String [] arrayString2) {
        boolean iguales = true;
        if (!(arrayString1.length == arrayString2.length)) {
            iguales = false;
        } else {
            for (int i = 0; i < arrayString1.length; i++) {
                if (!(arrayString1[i].equalsIgnoreCase(arrayString2[i]))) {
                    iguales = false;
                }else {
                    iguales = true;
                }
            }
        }
        if (iguales) {
            return "Ambos arrays son iguales";
        } else {
            return "No son iguales";
        }
    }
}
