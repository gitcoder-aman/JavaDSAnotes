package _11Sorting;

import java.util.Random;

public class QuickSort {

	static void swap(int a[],int i,int j) {
		
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	static void random(int a[],int low,int high) {
		
		//int randomIndex = low + (int)(Math.random() * (high-low+1));

		Random objRandom = new Random();
		int n = objRandom.nextInt(low,high);
		
		swap(a, low, n);
	}
	public static int secondApproachPartition(int a[],int low,int high) {
		
		int pivot = a[high];
		int i = low-1;
		
		for (int j = low; j < high; j++) {
			if(a[j] < pivot) {
				i++;
				//swap
				swap(a, i, j);
			}
		}
		swap(a, i+1, high);
		
		return i+1; //pivot index
	}
	public static int partition(int a[],int low,int high) {
		
		int i = low;
		int j = high;
		
		random(a, low, high);
		int pivot = a[low];
		
		while (i < j) {
		     
			while(a[i] <= pivot && i < j) i++;
			while(a[j] > pivot) j--;
			if(i < j) {
				swap(a, i, j);
			}
		
		}
		swap(a, low, j);
		return j;
	}
	public static void quickSort(int a[],int low,int high) {
		if(low < high ) {
			int pivot = partition(a, low, high);
			quickSort(a, low, pivot-1);
			quickSort(a, pivot+1, high);
		}
		
	}
	public static void main(String[] args) {

		int a[] = {4,7,2,1,9,12,3};
		
		quickSort(a,0,a.length-1);
		for (int i : a) {
			System.out.print(i + " ");
		}

	}
	

}
