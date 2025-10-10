package hola;

public class Ejemplo {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        
        // Operadores relacionales
        // a == b

        boolean esAIgualB = a == b;
        System.out.println("Es A igual que B: " + esAIgualB);

        boolean esAMayorIgualB = a >= b;
        System.out.println("Es A mayor o igual que b: " + esAMayorIgualB);

        boolean sonDistintas = a != b;
        System.out.println("Son distintas: " + sonDistintas );

        int estatura = 178;
        boolean esDistintade200 = estatura != 200;
        boolean esMayorQueCero = estatura > 0;

        // Y lógico e strue cuando las dos partes
        // son true
        boolean esDistintade200yMayorCero = 
        esDistintade200 && esMayorQueCero;
    
        // O lógico es true cuando una de la partes
        // es true
        // Si la estatura es menor que cero o mayor
        // que 200, para la ejecución
        estatura = 210;
        boolean x = estatura<0 || estatura > 200;
        System.out.println(x);

        // Negación
        boolean verdad = true;
        System.out.println(!verdad); 
        
    }
}
