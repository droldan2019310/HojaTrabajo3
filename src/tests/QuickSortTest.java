package tests;

import org.junit.Assert;
import org.junit.Test;

import models.Sorts;


public class QuickSortTest {
	@Test
	public void testQuick(){
		Sorts sort = new Sorts<Integer>();
		Integer[] randomNumbers= {2,1,3};
		Integer[] numbersInOrder= {1,2,3};
		Assert.assertArrayEquals(sort.quickSort(randomNumbers,1,1), numbersInOrder);
		
		
	}
}
