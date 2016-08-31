package live;

/**
 * Created by m on 8/31/16.
 */
public class Fakul {
    public static void main(String[] args) {
        final int n = 5;
        System.out.println("n vorher: " + n);
        int result = fakulIterativ(n);
        System.out.println("n nachher: " +n);
        System.out.println(result);
    }

    public static int fakulRekursiv(int n) {
        //System.out.println(n);
        if(0 == n) {
            return 1;
        }
        return n * fakulRekursiv(n-1);
    }

    public static int fakulIterativ(int n) {
        int result = 1;
        while (n > 0) {
            System.out.println(n + ": Mein Result vorher:" + result);
            result = result * n;
            System.out.println(n + ": Mein Result nachher:" + result);
            n--;
            System.out.println("neue Schleife---------");
        }
        return result;
    }

    public static int fakulIterativ2(int n) {
        int result = 1;
        for (int i = n; i > 0; i--) {
            result = result * i;
        }
        return result;
    }
}
