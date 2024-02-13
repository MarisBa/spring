package lv.rvt;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import rvt.Sorter;



public class SorterTest {
    @Test 
    public void testSmallest() {
        int[] numbers = {6, 5, 8, 7, 11};
        assertEquals(5, Sorter.smallest(numbers));;
    }

    @Test
    public void testSmallestIndex() {
        int[] numbers = {6, 5, 8, 7, 11, -1};
        assertEquals(5, Sorter.indexOfSmallest(numbers));
    }

    @Test
    public void testSmallestIndexFrom() {
        int[] numbers = {6, 1, 8, 7, 11, -1, 3, 2};
        assertEquals(5, Sorter.indexOfSmallestFrom(numbers, 2));
    }


    @Test
    public void testswap() {

        int[] numbers =       {3, 2, 5, 4, 8};
        int[] expectedArray = {4, 2, 5, 3, 8};

        assertArrayEquals(expectedArray, Sorter.swap(numbers, 0, 3));

    }

    @Test
    public void sortteset(){
        int[] wrongnumber   = {8, 3, 7, 9, 1, 2, 4};
        int[] expectedarray = {1, 2, 3, 4, 7, 8, 9};

        assertArrayEquals(expectedarray,Sorter.sort(wrongnumber));
    }
}
