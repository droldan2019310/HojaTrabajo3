package tests;

import static org.junit.Assert.*;

import org.junit.Test;


import models.Sorts;


public class QuickSortTest {
	
	

	@Test public void testQuick(){
		Sorts<Integer> sort = new Sorts<Integer>();
		Integer[] randomNumbers= {2,1,3};
		Integer[] numbersInOrder= {1,2,3};
		
		assertArrayEquals(numbersInOrder,sort.quickSort(randomNumbers,0,(randomNumbers.length-1)));
		
	}
}
