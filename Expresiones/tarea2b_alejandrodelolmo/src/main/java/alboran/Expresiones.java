package alboran;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Expresiones {
    public static void main(String[] args) {
        // Inicializamos el Scanner para el teclado y le pedimos al usuario un numero
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num1 = teclado.nextInt();
        System.out.println("El numero introducido es = " + num1);
        
        // Ahora creamos el Input para el segundo numero usando JOptionPane y pasando el String a Int
        String txt1 = JOptionPane.showInputDialog("Introduce otro numero");
        int num2 = Integer.parseInt(txt1);
        System.out.println("El numero introducido es = " + num2);
        
        // En el apartado A tenemos el siguiente enunciado:
        // a) num1 es mayor que num2 y num1 menos 10 es menor que num2-1
        // Para esto usamos el siguiente booleano:
        boolean apartadoA = num1 > num2 && num1 - 10 < num2-num1;

        // En el apartado B tenemos el siguiente enunciado:
        // b) num1 es par o num2 es par
        // Para esto usaremos el siguiente booleano:
        boolean apartadoB = (double) num1 % 2 == 0 || (double) num2 % 2 == 0;

        // En el apartado C tenemos el siguiente enunciado:
        // c) num2 es impar y num1 es par
        // Para esto usaremos el siguiente booleano:        
        boolean apartadoC = (double) num1  % 2 == 0 && (double) num2 %2 != 0;

        // En el apartado D tenemos el siguiente enunciado:
        // d) Al resto de dividir num1 entre 3 se le suma 1. Comprobar que el resultado es igual a 3
        // Para esto usaremos el siguiente booleano:
        boolean apartadoD = (double) (num1 % 3) + 1 == 3;

        // En el apartado E tenemos el siguiente enunciado:
        // e) 10 es menor o igual que 2 multiplicado por num1 y 3 es menor que 4 o 8 
        // no es mayor que 7 y num2 multiplicado por 2 es menor o igual que 4 por 2 menos 1
        // Para esto usaremos el siguiente booleano:
        boolean apartadoE = 10 <= (2 * num1) && ((3 < 4) || !(8 < 7)) && (num2 * 2) <= (4*2) - 1; // esta mal seguramente, no entendi nada del enunciado

        // En el apartado F tenemos el siguiente enunciado:
        // f) el resultado de negar la expresión: num2 es mayor que num1 y dos por num1 menor o igual a num2
        // Para esto usaremos el siguiente booleano:
        boolean apartadoF = !(num2 > num1 && (2 * num1) <= num2);

        // En el apartado G tenemos el siguiente enunciado:
        // g) num2/2<num1 y num1++/2>num2
        // Para esto usaremos el siguiente booleano:
        boolean apartadoG = (num2/2)<num1 && num1++/2>num2;
        
        // En el apartado H tenemos el siguiente enunciado:
        // h) num1 está entre 15 y 20
        // Para esto usaremos el siguiente booleano:
        boolean apartadoH = num1 >= 15 && num1 <= 20;

        // En el apartado I tenemos el siguiente enunciado:
        // i) num1 está entre 15 y 20 o num2 es distinto de 7
        // Para esto usaremos el siguiente booleano:
        boolean apartadoI = (num1 >= 15 && num1 <= 20) && num2 != 7;
        
        // En el apartado J tenemos el siguiente enunciado:
        // j) num2 no es 100
        // Para esto usaremos el siguiente booleano:
        boolean apartadoJ = num2 != 100;

        // En el apartado K tenemos el siguiente enunciado:
        // k) num2 no está entre 50 y 100
        // Para esto usaremos el siguiente booleano:
        boolean apartadoK = !(num2 <= 50 && num2 >= 100);

        JOptionPane.showMessageDialog(null, """
                a) num1 es mayor que num2 y num1 menos 10 es menor que num2-1: %s
                
                b) num1 es par o num2 es par: %s
                
                c) num2 es impar y num1 es par: %s
                
                d) Al resto de dividir num1 entre 3 se le suma 1. Comprobar que el resultado es igual a 3: %s
                
                e) 10 es menor o igual que 2 multiplicado por num1 y 3 es menor que 4 o 8 
                no es mayor que 7 y num2 multiplicado por 2 es menor o igual que 4 por 2 menos 1: %s
                
                f) el resultado de negar la expresión: num2 es mayor que num1 y dos por num1 menor o igual a num2: %s
                
                g) num2/2<num1 y num1++/2>num2: %s
                
                h) num1 está entre 15 y 20: %s
                
                i) num1 está entre 15 y 20 o num2 es distinto de 7: %s
                
                j) num2 no es 100: %s
                
                k) num2 no está entre 50 y 100: %s

                """.formatted(apartadoA,apartadoB,apartadoC,apartadoD,apartadoE,apartadoF,apartadoG,apartadoH,apartadoI,apartadoJ,apartadoK));
        
    }
}
