public class DoWhileLoopPlayground {

    public static void main(String[] args) {
        int i = 0;
        do {
            boolean condition2 = i % 2 == 0;
            boolean condition3 = i % 3 == 0;

            if (condition2) {
                System.out.println(i + " ist durch 2 teilbar.");
            }
            if (condition3) {
                System.out.println(i + " ist durch 3 teilbar.");
            }
            i++;
        } while (i <= 10);
    }

}
