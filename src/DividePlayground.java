public class DividePlayground {
    public static void main(String[] args) {
        int i = 1024;
        divideLoop(i);
    }

    private static void divideLoop(int i) {
        boolean condition = i % 2 == 0;
        System.out.println(i);
        while(condition) {
            i = i / 2;
            condition = i % 2 == 0;
            System.out.println(i);
        }
    }
}
