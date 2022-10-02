package testing;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestingSort {
    /** Test the Sort.sort method. */
    @Test
    public void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i" };

        Sort.sort(input);

        assertArrayEquals(expected, input);
    }

    /**Test the Sort.findSmallest method. */
    @Test
    public void testFindSmallest() {
        String[] input = {"i", "have", "an", "egg"};
        int expected = 2;

        int actual = Sort.findSmallest(input, 0);

        assertEquals(expected, actual);
    }

    /** Test the Sort.swap method. */
    @Test
    public void testSwap() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"have", "i", "an", "egg"};

        Sort.swap(input, 1, 2);

        assertArrayEquals(expected, expected);
    }
}
