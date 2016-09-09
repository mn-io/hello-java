package live2;

/**
 * Created by m on 9/9/16.
 */
public class SwapPlayground2 {
    public static void main(String[] args) {
        int[] buch = new int[]{5, 7};

        System.out.println("i hat den Wert " + buch[0]);
        System.out.println("j hat den Wert " + buch[1]);

        System.out.println("------------------------");

        // it's a kind of magic
        int kopie = buch[1];
        buch[1] = buch[0];
        buch[0] = kopie;

        System.out.println("i hat den Wert " + buch[0]);
        System.out.println("j hat den Wert " + buch[1]);
    }
}
