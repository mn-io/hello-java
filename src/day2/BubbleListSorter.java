package day2;

public class BubbleListSorter extends ListSorter {

    public int[] sort() {
        int[] ints = convertToArray();

//      Credits to: http://mathbits.com/MathBits/Java/arrays/Bubble.htm

        int j;
        boolean flag = true;

        while (flag) {
            flag = false;
            for (j = 0; j < ints.length - 1; j++) {
                if (ints[j] > ints[j + 1]) {
                    swap(ints, j);
                    flag = true;
                }
            }
        }

        return ints;
    }

    private void swap(int[] ints, int j) {
        int temp;
        temp = ints[j];
        ints[j] = ints[j + 1];
        ints[j + 1] = temp;
    }
}
