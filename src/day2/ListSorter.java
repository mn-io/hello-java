package day2;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;

public class ListSorter {

    ArrayList<Integer> list;

    public ListSorter() {
        this.list = new ArrayList<Integer>();
    }

    public void add(int toAdd) {
        list.add(toAdd);
    }

    public int[] sort() {
        throw new NotImplementedException();
    }

    protected int[] convertToArray() {
        int[] intArray = new int[list.size()];
        int count = 0;
        for (int i : list) {
            intArray[count++] = i;
        }
        return intArray;
    }
}
