package day1;

public class Counter {
    public static void main(String[] args) {
        int limit = 10;

        for (int i = 0; i < limit; i++) {
            boolean isEven = i % 2 == 0;
            if (isEven) {
                System.out.print(".");
            } else {
                System.out.print("!");
            }
        }
    }
}
