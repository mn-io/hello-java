public class ArrayFindPlayground {

    public static void main(String[] args) {
        int[] values = new int[]{4, 5, 6, 9, 2, 4, 6, 3, 2, 5, 7};
        int biggest = Integer.MIN_VALUE;
        int position = -1;

        for (int i = 0; i < values.length; i++) {
            int currentValue = values[i];
            boolean istGroesser = biggest < currentValue;
            System.out.println("Wert auf Seite " + i + " ist groesser? " + biggest + " < " + currentValue + " ## " + istGroesser);
            if (istGroesser) {
                biggest = currentValue;
                position = i;
            }
        }

        System.out.println("Größter Wert: " + biggest + " an Position: " + position);
    }

}
