package test;

import org.junit.*;
import min.Min;

import static org.junit.Assert.assertThrows;

import java.util.*;

public class MinTests {
    @Test
    public void minWithSortedListTest() {
        Min min = new Min();
        Assert.assertEquals(1, (int) min.min(Arrays.asList(1, 2, 3, 4, 5, 6)));
    }

    @Test
    public void minWithReversedSortedListTest() {
        Min min = new Min();
        Assert.assertEquals(1, (int) min.min(Arrays.asList(6, 5, 4, 3, 2, 1)));
    }

    @Test
    public void minWithEmptyListTest() {
        Min min = new Min();
        List<Integer> emptyList = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> min.min(emptyList));
    }

    @Test
    public void minWithNullListTest() {
        Min min = new Min();
        List<Integer> listWithNulls = Arrays.asList(null, null, null);
        assertThrows(NullPointerException.class, () -> min.min(listWithNulls));
    }

}
