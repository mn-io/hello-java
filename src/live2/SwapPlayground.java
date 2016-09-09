package live2;

/**
 * Created by m on 9/9/16.
 */
public class SwapPlayground {
    public static void main(String[] args) {
        int i = 7;
        int j = 5;
        System.out.println("i hat den Wert " + i);
        System.out.println("j hat den Wert " + j);
        System.out.println("--------------");

        int sicherungskopie = i;
        i = j;
        j = sicherungskopie;

        System.out.println("i hat den Wert " + i);
        System.out.println("j hat den Wert " + j);
    }
}
