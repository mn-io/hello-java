public class ArrayForPlayground {

    public static void main(String[] args) {
        boolean[] results = new boolean[10];

        for (int i = 0; i <= results.length; i++) {
            boolean condition2 = i % 2 == 0;
            results[i] = condition2;

            if (results[i]) {
                System.out.println(i + " ist durch 2 teilbar.");
            }
        }
    }

}
