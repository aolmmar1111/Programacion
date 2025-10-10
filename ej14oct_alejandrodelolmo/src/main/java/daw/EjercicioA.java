package daw;

public class EjercicioA {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int multiploA = i;
            for (int j = 1; j <= 10; j++) {
                int multiploB = j;
                System.out.println(multiploA + " x " + multiploB  + " = " + (multiploA*multiploB));
            }
        }
    }
}