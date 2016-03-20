package day4;


import day3.BubbleListSorter;
import day3.INamedListSorter;

import java.util.HashMap;

public class SortFactory {

    private static SortFactory instance;

    public static SortFactory getInstance() {
        if(instance == null) {
            instance = new SortFactory();
        }

        return instance;
    }

    private final HashMap<String, INamedListSorter> map;

    public SortFactory() {
        map = new HashMap<>();

        BubbleListSorter bubbleListSorter = new BubbleListSorter();

        map.put(bubbleListSorter.getName(), bubbleListSorter);
    }

    public INamedListSorter getAlgorithm(String name) {
        INamedListSorter sorter = map.get(name);

        if(sorter == null) {
            throw new IllegalArgumentException("Algorithm with " + name + " not found.");
        }

        return sorter;
    }
}
