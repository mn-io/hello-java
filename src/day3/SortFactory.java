package day3;


import java.util.HashMap;

public class SortFactory {

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
