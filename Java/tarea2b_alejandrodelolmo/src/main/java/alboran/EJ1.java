package alboran;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EJ1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primero numero");
        int num1 = teclado.nextInt();
        String numero2 = JOptionPane.showInputDialog("Introduce el segundo numero");
        int num2 = Integer.parseInt(numero2);

        System.out.println("Numero 1" + num1 + "Numero 2" + num2);

        boolean apartadoA = num1 > num2 && num1 - 10 < num2 - num1;
        
    }
}
