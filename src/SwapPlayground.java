public class SwapPlayground {

    public static void main(String[] args) {
        testArr();
        System.out.println("----------------");
        testIns();
    }

    public static void testArr() {
        System.out.println("test arrays swapping");
        int[] xy = new int[2];
        xy[0] = 7;
        xy[1] = 5;

        System.out.println(xy[0]);
        System.out.println(xy[1]);

        swapArray(xy);

        System.out.println("swapped array:");
        System.out.println(xy[0]);
        System.out.println(xy[1]);
    }

    public static void swapArray(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void testIns() {
        System.out.println("test ints swapping");
        int x = 7;
        int y = 5;

        System.out.println(x);
        System.out.println(y);

        swapInts(x, y);

        System.out.println("swapped ints:");
        System.out.println(x);
        System.out.println(y);
    }

    public static void swapInts(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
