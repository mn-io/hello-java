public class ForLoopPlayground {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            boolean condition2 = i % 2 == 0;
            boolean condition3 = i % 3 == 0;

            if (condition2) {
                System.out.println(i + " ist durch 2 teilbar.");
            }
            if (condition3) {
                System.out.println(i + " ist durch 3 teilbar.");
            }
        }
    }

}
