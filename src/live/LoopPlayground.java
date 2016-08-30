package live;

/**
 * Created by m on 8/30/16.
 */
public class LoopPlayground {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++) {
            System.out.println(i);
            boolean isEven = i % 2 == 0;
            boolean isBy3 = i % 3 == 0;

            if(isEven) {
                System.out.println("i ist gerade");
            }

            if(isBy3) {
                System.out.println("i ist durch 3 teilbar");
            }
        }
    }
}
