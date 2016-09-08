package live2;

/**
 * Created by m on 9/7/16.
 */
public class Fakultaet {
    //////////////////////////////////////////////
    public static void main(String[] args) {
        int nOderSo = 5;
        System.out.println("es geht los mit " + nOderSo);
        long result = fakultaet2(nOderSo);
        System.out.println("----------------------");
        System.out.println(result);
    }

    ///////////////////////////////////////////////

    public static int fakultaet2(int n) {
        int result = 1;
        while (n > 0) {//Start
            result = result * n;
            n--;
            if (n == 1) {
                continue;
            }
            System.out.println("kein continue bei n =" + n);
        }//Ende der Schleife
        System.out.println("Ende mit " + result);
        return result;
    }

    public static long fakultaet(long n) {
        String text = "Aufruf mit " + n;
        System.out.println(text);
        if (n == 0) {
            System.out.println("Anker erreicht! Ende, da n == 0");
            return 1;
        }

        long f = n * fakultaet(n - 1);
        return f;

    }

    //////////////////////////////////////////////
}
