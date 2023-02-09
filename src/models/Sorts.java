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
	
}
