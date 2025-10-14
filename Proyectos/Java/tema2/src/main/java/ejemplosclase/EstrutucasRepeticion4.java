package ejemplosclase;

import javax.swing.JOptionPane;

public class EstrutucasRepeticion4 {
    public static void main(String[] args) {
        /*
        Usando JOption, solicita cuatro numeros d ela clave pin de un
        movil. Para saber i el pin es valido hay varias restricciones,
        los digitos no se pueden repetir,
        los digitos impares deben sumar par,
        la suma de los digitos pares debe ser impares
        Filtra los digitos introducios (Entre 0 y 9), En caso de error
        solicitar de nuevo
         */   

        boolean invalido = false;
        do { 
            String numero1Txt = JOptionPane.showInputDialog("Introduce el primer digito de tu pin");
            int numero1Int = Integer.parseInt(numero1Txt);
            String numero2Txt = JOptionPane.showInputDialog("Introduce el segundo digito de tu pin");
            int numero2Int = Integer.parseInt(numero2Txt);
            String numero3Txt = JOptionPane.showInputDialog("Introduce el tercer digito de tu pin");
            int numero3Int = Integer.parseInt(numero3Txt);
            String numero4Txt = JOptionPane.showInputDialog("Introduce el cuarto digito de tu pin");
            int numero4Int = Integer.parseInt(numero4Txt);  
            

            if ((numero1Int == numero2Int || numero1Int == numero3Int || numero1Int == numero4Int ||
                numero2Int == numero3Int || numero2Int == numero4Int ||
                numero3Int == numero4Int)) {
                    invalido = true;
            }
            if (numero1Int > 9 || numero1Int < 0) {
                invalido = true;
            }
            if (numero2Int > 9 || numero2Int < 0 ) {
                invalido = true;
            }
            if (numero3Int > 9 || numero3Int < 0) {
                invalido = true;
            }
            if (numero4Int > 9 || numero4Int < 0) {
                invalido = true;
            }   

            if ((numero2Int + numero4Int) % 2 == 0) {
                invalido = true;
            }
            if ((numero1Int + numero3Int) % 2 == 1 ) {
                invalido = true;
            }
            if (invalido) {
                System.out.println("Digitos incorrectos \n");
            } else {
            System.out.println("Los 4 digitos que has introducido son correctos");
            }
        } while (invalido);
    }
}
