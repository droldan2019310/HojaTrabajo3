package tests;
import models.Sorts;
import org.junit.*;
import org.junit.Test;
import org.junit.Test;
import org.junit.Test;
 
public class SortTests  {
	
	
	@Test
	public void testQuick(){
		Sorts sort = new Sorts<Integer>();
		Integer[] randomNumbers= {2,1,3};
		Integer[] numbersInOrder= {1,2,3};
		Assert.assertArrayEquals(sort.quickSort(randomNumbers,1,1), numbersInOrder);
		
		
	}
	

}
