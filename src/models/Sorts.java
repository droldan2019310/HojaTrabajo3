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
 


}
