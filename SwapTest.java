/**
 * Created by m on 3/24/16.
 */
public class SwapTest {
    public static void main(String[] args) {
        int x = 7;
        int y = 5;

        System.out.println(x);
        System.out.println(y);

        swap(x, y);

        System.out.println("swaped:");
        System.out.println(x);
        System.out.println(y);
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
