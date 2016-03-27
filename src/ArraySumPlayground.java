public class ArraySumPlayground {

    public static void main(String[] args) {
        int[] values = new int[]{4, 5, 6, 3, 2, 4, 6, 3, 2, 5, 7};
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        System.out.println("Summe: " + sum);
    }

}
