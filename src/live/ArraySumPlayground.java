package live;

/**
 * Created by m on 8/31/16.
 */
public class ArraySumPlayground {
    public static void main(String[] args) {
        int[] feld = new int[]{78, 4, 4, 67, 5, 3, 4, 6, 7};

        for (int i = 0; i < feld.length; i++) {
            System.out.println(feld[i]);
        }

        System.out.println("///////////");

        int summe = summe(feld);
        System.out.println(summe);
    }

    public static int summe(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            // sum = sum + array[i];
        }
        return sum;
    }
}
