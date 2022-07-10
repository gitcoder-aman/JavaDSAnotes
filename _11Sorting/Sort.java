package _11Sorting;

import java.util.Iterator;

public class Sort {

	public static void BubbleSort(int a[]) {
			
		for (int i = 0; i < a.length-1; i++) {
			
			printArray(a);
			System.out.println();
			
			for (int j = 0; j < a.length-i-1; j++) {
				
			 if(a[j] > a[j+1]) {
				
				 int temp = a[j];
				 a[j] = a[j+1];
				 a[j+1] = temp;
			 }
				
			}
		}
	    printArray(a);	
	}
	public static void InsertionSort(int a[]) {
		
		for(int i = 1; i < a.length; i++) {
			
//			printArray(a);
//			System.out.println();
			
			int temp = a[i];
			int j = i-1;
//			
				while((a[j] > temp) && j >= 0 ) {
					
					a[j+1] = a[j];
					j--;
				}
//			for(; j >= 0 ;j--) {
//				if(temp < a[j])
//				a[j+1] = a[j];
//
//			}
		a[j+1] = temp;
			
		}
		
		printArray(a);
	}
	static void selectionSort(int a[]) {
	   for (int i = 0; i < a.length-1; i++) {
		
		   for (int j = i+1; j < a.length; j++) {
			     
			   if(a[i] > a[j]) {
				   int temp = a[j];
				   a[j] = a[i];
				   a[i] = temp;
			   }
		}
		   
	  }
	   printArray(a);
	}
	static void printArray(int a[]) {
	
		for(int i = 0; i<a.length;i++) {
            System.out.print(a[i] + " ");
		}
	}
	public static void main(String[] args) {

		int [] arr = {5,9,2,6,3,1,3};
		//BubbleSort(arr);
//		InsertionSort(arr);
		selectionSort(arr);
		
	}

}
