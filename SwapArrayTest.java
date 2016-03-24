/**
 * Created by m on 3/24/16.
 */
public class SwapArrayTest {
    public static void main(String[] args) {
        int[] xy = new int[2];
        xy[0] = 7;
        xy[1] = 5;

        System.out.println(xy[0]);
        System.out.println(xy[1]);

        swap(xy);

        System.out.println("swaped array:");
        System.out.println(xy[0]);
        System.out.println(xy[1]);
    }

    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
