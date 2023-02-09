

package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import models.Sorts;

public class RadixSortTest {

    @Test public void testRadixSort(){
        Sorts<Integer> sort = new Sorts<Integer>();
		Integer[] randomNumbers= {2,1,3};
		Integer[] numbersInOrder= {1,2,3};

        assertArrayEquals(numbersInOrder,sort.RadixSort(randomNumbers));
    }
    
}
