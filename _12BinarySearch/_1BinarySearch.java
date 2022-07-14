package _12BinarySearch;

import java.awt.geom.AffineTransform;

//Time Complexity  = O(log n)
//space = O(1)
public class _1BinarySearch {

	static int binarySearch(int a[],int key) {
		
		int l = 0;
		int r = a.length - 1;
		
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
	static int firstOccurence(int a[],int key) {
		
		int l = 0;
		int r = a.length - 1;
		
		int ans = -1;
		while(l <= r) {
			int mid = l + (r-l)/2;
			
			if(a[mid] == key) {
			
				ans = mid;
				r = mid - 1;
			}
			else if(a[mid] < key) l = mid + 1;
			else {
				r = mid - 1;
			}
		}
		return ans;
	}
	static int LastOccurence(int a[],int key) {
		
		int l = 0;
		int r = a.length - 1;
		
		int ans = -1;
		while(l <= r) {
			int mid = l + (r-l)/2;
			
			if(a[mid] == key) {
			
				ans = mid;
				l = mid + 1;
			}
			else if(a[mid] < key) l = mid + 1;
			else {
				r = mid - 1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {

		int a[] = {1,3,5,9,11,17};
		System.out.println(binarySearch(a, 11));
		
//		int b[] = {1,2,4,4,4,5,9,9,11,11};
		int b[] = {4,4,4,4,4,4,4,4};
		
		System.out.println(firstOccurence(b, 4));
		
		System.out.println(LastOccurence(b, 4));
	}

}
