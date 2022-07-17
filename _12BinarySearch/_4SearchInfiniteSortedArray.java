package _12BinarySearch;

//Time Complexity = O(log n)
public class _4SearchInfiniteSortedArray {

	static int binarySearch(int a[],int key,int l,int r) {
		
		
		while(l <= r) {
			int mid = l + (r-l)/2;
			
			if(a[mid] == key) return mid;
			if(a[mid] < key) l = mid + 1;
			else {
				r = mid - 1;
			}
		}
		return -1;
	}
	static int searchInfiniteSortedArray(int [] a,int key) {
		
		if(a.length == 0) return -1;
		
		if(a[0] == key) return 0;
		int index = 1;
		
		while(a[index] <= key) {
			index *= 2;
		}
		return binarySearch(a, key, index/2, index);
	}
	public static void main(String[] args) {

		int [] a = {1,2,3,4,6,7,8,11,13,14,17,17,19,23,25,27,28,29,31,34,35,36};
		
		int key = 7; //key present in length of n/2 Array
		
		System.out.println(searchInfiniteSortedArray(a, key));
	}

}
