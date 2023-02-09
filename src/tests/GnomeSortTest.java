package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import models.Sorts;

public class GnomeSortTest {
    
    @Test public void gnomeSortTest(){
        Sorts<Integer> sort = new Sorts<Integer>();
		Integer[] randomNumbers= {2,1,3};
		Integer[] numbersInOrder= {1,2,3};
        assertArrayEquals(numbersInOrder,sort.gnomeSort(randomNumbers));
    }
}
