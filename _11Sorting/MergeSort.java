package _11Sorting;

//Time Complexity = O(nLogn)
public class MergeSort {

	  static void mergeTwoSortedArray(int a[],int left,int mid,int right) {
		  
		  //Find sizes of two subarray
		  int n1 = mid - left + 1;
		  int n2 = right - mid;
		  
		  //Create temporary Array
		  int L[] = new int [n1];
		  int R[] = new int [n2];
		  
		  //Copy data to temp Array
		  for (int i = 0; i < n1; i++) {
			L[i] = a[left+i];
		  }
		  for (int j = 0; j < n2; j++) {
				R[j] = a[mid + 1 + j];
		   }
		  
		  //Merge Two Sorted Array
		  
		  int i = 0,j = 0;
		  int k = left; //Initial index of merged subarray array
		  
		  while(i < n1 && j < n2) {
			  if(L[i] <= R[j]) {
				  a[k] = L[i];
				  i++;
			  }
			  else {
				  a[k] = R[j];
				  j++;
			  }
			  k++;
		  }
		  
		  //Copy remaining elements of L[]
		  while(i < n1) {
			  a[k] = L[i];
			  i++;
			  k++;
		  }
		  //R[]
		  while(j < n2) {
			  a[k] = R[j];
			  j++;
			  k++;
		  }
		  
	  }
	  void Sort(int a[],int left,int right) {
		
		 if(left < right) {
			 int mid = left + (right-left)/2;
			 
			 Sort(a,left,mid);
			 Sort(a, mid+1, right);
			 
			 //Merge Two Sorted Array
			 
			 mergeTwoSortedArray(a,left,mid,right);
		 }
	}
	public static void main(String[] args) {

		int a[] = {12,11,13,5,6,7};
		
		MergeSort obMergeSort = new MergeSort();
		obMergeSort.Sort(a,0,a.length-1);
		
	    for (int i : a) {
			System.out.print(i + " ");
		}
	}

}
