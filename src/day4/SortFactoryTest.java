package day4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mario on 3/20/16.
 */
public class SortFactoryTest {

    @Test
    public void testGetInstance() throws Exception {
        SortFactory instance1 = SortFactory.getInstance();
        SortFactory instance2 = SortFactory.getInstance();

        assertEquals(instance1, instance2);
    }
}