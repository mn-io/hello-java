package day2;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;

public class NamedListSorter {

    private final String name;
    private ArrayList<Integer> list;

    public NamedListSorter(String name) {
        this.list = new ArrayList<Integer>();
        this.name = name;
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

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "My name is: " + name + " with length: " + list.size();
    }
}
