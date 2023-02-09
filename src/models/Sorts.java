package models;

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
		
	public void mergeSort(T[] array, int start, int end){
		if (start < end)
		{

			int middle = (start + end) / 2;

			mergeSort(array, start, middle);
			mergeSort(array, middle + 1, end);

			merge(array, start, middle, end);
		}
	}

	public void merge(T[] array, int start, int middle, int end){
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
	}
//Algoritmo de mergesort https://big-o.io/examples/merge-sort/java-generic/.
//Algoritmo de buublesort obtenido https://www.geeksforgeeks.org/bubble-sort/
//Algoritmo de GnomeSort obtenido de http://lwh.free.fr/pages/algo/tri/tri_gnome_es.html
//Algoritmo de Quicksort obtenido de http://puntocomnoesunlenguaje.blogspot.com/2012/12/java-quicksort.html
}

