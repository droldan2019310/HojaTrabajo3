package models;

import java.util.ArrayList;

public class Sorts<T extends Comparable<T>>  {


 public T[] bubbleSort(T[] array) {

 for (int i = array.length - 1; i > 0; i--) {
		for (int j = 0; j < i; j++) {
			if (array[j].compareTo(array[j + 1])==1)  {
				swap(array, j, j+1);
			}
		}
	}
 return array;
}

public void swap(T[] array, int a, int b) {
	T value = array[b];
	array[b] = array[a];
	array[a] = value;
}
}
