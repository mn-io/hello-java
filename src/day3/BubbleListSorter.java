package day3;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleListSorter implements INamedListSorter {

    private final String name;
    private ArrayList<Integer> list;

    public BubbleListSorter() {
        this.list = new ArrayList<Integer>();
        this.name = "BubbleSort";
    }

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

    protected int[] convertToArray() {
        int[] intArray = new int[list.size()];
        int count = 0;
        for (int i : list) {
            intArray[count++] = i;
        }
        return intArray;
    }

    public String toString() {
        return "This is a implementation of BubbleSort, named here: " + this.getName();
    }

    public void add(int toAdd) {
        list.add(toAdd);
    }

    public int[] getAllSorted() {
        return sort();
    }

    public void printAllSorted() {
        String s = Arrays.toString(getAllSorted());
        System.out.println(s);
    }

    public String getName() {
        return this.name;
    }
}
