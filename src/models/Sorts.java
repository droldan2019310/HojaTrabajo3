package models;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Sorts<T extends Comparable<T>>  {

	public T[] quickSort(T[] a, int left, int right) {

		T pivot=a[left]; 
		int i=left;         
		int j=right;        
		T aux;
		
		while(i < j){                                                            
			while((a[i].compareTo(pivot)==-1) ||(a[i].compareTo(pivot)==0)  && i < j) i++; 
			while(a[j].compareTo(pivot)==1) j--;           
			if (i < j) {                                         
				aux= a[i];                      
				a[i]=a[j];
				a[j]=aux;
			}
		}
		
		a[left]=a[j];                                      
		a[j]=pivot;      
		
		if(left < j-1)
			quickSort(a,left,j-1);          
		if(j+1 < right)
			quickSort(a,j+1,right);  
		
		return a;
		   
	}
	
	public T[] gnomeSort(T[] a){
		int pos =1;
		while(pos<a.length) {
			if ((a[pos].compareTo(a[pos-1])==1) || (a[pos].compareTo(a[pos-1])==0)) {
				pos = pos+1;
			}
			else {
				T temp=a[pos];
				a[pos]=a[pos-1];
				a[pos-1]= temp;
				if(pos>1) {
					pos= pos-1;
				}
			}
		
		}
		return a;
	}
	
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
		
	public T[] mergeSort(T[] array, int start, int end){
		if (start < end)
		{

			int middle = (start + end) / 2;

			mergeSort(array, start, middle);
			mergeSort(array, middle + 1, end);

			return merge(array, start, middle, end);
		}
		return null;
	}

	public T[] merge(T[] array, int start, int middle, int end){
		T[] leftArray  = (T[]) new Comparable[middle - start + 1];
		T[] rightArray = (T[]) new Comparable[end - middle];

		for (int i = 0; i < leftArray.length; ++i)
			leftArray[i] = array[start + i];

		for (int i = 0; i < rightArray.length; ++i)
			rightArray[i] = array[middle + 1 + i];

		int leftIndex = 0, rightIndex = 0;

		int currentIndex = start;

		while (leftIndex < leftArray.length && rightIndex < rightArray.length)
		{
			if (leftArray[leftIndex].compareTo(rightArray[rightIndex]) <= 0)
			{
				array[currentIndex] = leftArray[leftIndex];
				leftIndex++;
			}
			else
			{
				array[currentIndex] = rightArray[rightIndex];
				rightIndex++;
			}
			currentIndex++;
		}

		while (leftIndex < leftArray.length) array[currentIndex++] = leftArray[leftIndex++];
		
		while (rightIndex < rightArray.length) array[currentIndex++] = rightArray[rightIndex++];

		return array;
	}



	
    private T getMax(T[] arr){
    	T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
        	if(max.compareTo(arr[i]) == -1){
				max = arr[i];
			}
        }
        return max;
    }
 

    

    private void counterSort(T[] arr, int e){
    	Integer[] output = new Integer[arr.length];
        int i;
        int contador[] = new int[10];
        Arrays.fill(contador, 0);
        
		for (i = 0; i < arr.length; i++) {	
			Integer value = (Integer) arr[i];
			contador[((value/e) % 10)]++;
		}
 
        for (i = 1; i < 10; i++) {        	
        	contador[i] += contador[i - 1];
        }
 
        for (i = arr.length - 1; i >= 0; i--) {
        	Integer value = (Integer) arr[i];
            output[contador[((value / e) % 10)] - 1] = (Integer) arr[i];
            contador[((value / e) % 10)]--;
        }
        
        for (i = 0; i < arr.length; i++){
            arr[i] =  (T) output[i];
        }
    }
 


    public T[] RadixSort(T[] arr){

        Integer m = (Integer) getMax(arr);
 
        for (int exp = 1;   m / exp > 0; exp *= 10) {        	
        	counterSort(arr, exp);
        }

		return arr;
    }
	
//Algoritmo de mergesort https://big-o.io/examples/merge-sort/java-generic/.
//Algoritmo de buublesort obtenido https://www.geeksforgeeks.org/bubble-sort/
//Algoritmo de GnomeSort obtenido de http://lwh.free.fr/pages/algo/tri/tri_gnome_es.html
//Algoritmo de Quicksort obtenido de http://puntocomnoesunlenguaje.blogspot.com/2012/12/java-quicksort.html
//Algoritmo de Radixsort obtenido de https://www.geeksforgeeks.org/radix-sort/
}

