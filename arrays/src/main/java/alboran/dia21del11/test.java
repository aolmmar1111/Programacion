package alboran.dia21del11;

import java.util.Arrays;
import java.util.Random;

public class test {

    private static final Random random = new Random();
    public static void main(String[] args) {
        int [] arrayInt = new int [10];

        arrayInt = rellenarArray(arrayInt);
        System.out.println(Arrays.toString(arrayInt));
        arrayInt = invertirArray(arrayInt);
        System.out.println(Arrays.toString(arrayInt));
    }
    public static int [] rellenarArray (int [] arrayInt){
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = random.nextInt(1,31);
        }
        return arrayInt;
    }
    public static int [] invertirArray (int [] arrayInt){
        int aux = 0,contador = (arrayInt.length) -1;
        for (int i = 1; i < arrayInt.length; i++) {
            aux = arrayInt[(i)-1];
            arrayInt[(i)-1] = arrayInt[contador];
            arrayInt[contador] = aux;
            contador--;
        }

        return arrayInt;
    }
}
