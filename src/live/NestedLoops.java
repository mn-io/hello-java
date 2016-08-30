package live;

/**
 * Created by m on 8/30/16.
 */
public class NestedLoops {
    public static void main(String[] args) {
//        int a = 0;
//        int b = 0;
//        while (true) {
//            int c = a * b;
//            System.out.println(c);
//            if (c > 100) {
//                return;
//            }
//            a++;
//            b++;
//        }

//        for (int a = 1; a <= 10; a++) {
//            for (int b = 1; b <= 10; b++) {
//                int c = a * b;
//                System.out.println(c);
//            }
//        }

        for (int a = 1, b = 1; b <= 10; a++) {
            int c = a * b;
            System.out.println(a + " * " + b + " = " + c);

            if (a == 10) {
                b++;
                a = 1;
            }
//            if (b == 10) {
//                break;
//            }
        }
    }
}
