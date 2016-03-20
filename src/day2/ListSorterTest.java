package day2;

import org.junit.Test;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ListSorterTest {

    @Test
    public void testSortNotImplemented() throws Exception {
        ListSorter listSorter = new ListSorter();
        listSorter.add(2);
        listSorter.add(4);
        listSorter.add(4);
        listSorter.add(3);

        try {
            listSorter.sort();
            fail("Expected exception");
        } catch (NotImplementedException e) {
        }
    }

    @Test
    public void testSort() throws Exception {
        ListSorter listSorter = new BubbleListSorter();
        listSorter.add(2);
        listSorter.add(4);
        listSorter.add(4);
        listSorter.add(3);

        int[] sort = listSorter.sort();

        String message = "Not sorted " + Arrays.toString(sort);

        int previousInt = Integer.MIN_VALUE;
        for (int i : sort) {
            assertTrue(message, i >= previousInt);
            previousInt = i;
        }
    }
}