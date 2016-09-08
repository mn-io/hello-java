package live2;

/**
 * Created by m on 9/6/16.
 */
public class LoopPlayground {

    public static void main(String[] args) {

        int n = 10;
        for (int nameIstEgal = 0; nameIstEgal < n; nameIstEgal++) {
            System.out.println("i ist jetzt: " + nameIstEgal);
            String text = "";
            for (int j = nameIstEgal; j < n; j++) {
                System.out.println("j ist jetzt: " + j);
                text += "*";
            }
            System.out.println(text);
        }
    }

}
