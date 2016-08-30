package live;

/**
 * Created by m on 8/30/16.
 */
public class StopAt7 {
    public static void main(String[] args) {
        int counter = 1;
//        while(counter % 7 != 0) {
//            System.out.println(counter);
//            counter++;
//        }

        for (int i = 1; i < 100; i++) {
            boolean condition = i % 7 == 0;
            if(condition) {
                break;
            }
            System.out.println(i);
        }
    }
}
