package _11Sorting;

import java.util.ArrayList;

public class IntersectionSortedArray {

	static int [] intersectionOfTwoSortedArray(int a[],int b[]) {
		
		int i = 0;
		int j = 0;
		
		ArrayList<Integer>ans = new ArrayList<>();
		while(i < a.length && j < b.length) {
		
			if(a[i] == b[j]) {		
//				System.out.print(a[i] + " ");
				ans.add(a[i]);
				i++;
				j++;
			}else if(a[i] > b[j]) {
				j++;
			}else if(a[i] < b[j]) {
				i++;
			}
		}

//		int res[] = new int[ans.size()];
//		
//		for (int k = 0; k < ans.size(); k++) {
//			res[k] = ans.get(k);
//		}
		//or
		int[] res = ans.stream().mapToInt(k -> k).toArray(); //ArrayList to convert Array 
		return res;
	}
	public static void main(String[] args) {

		int [] a = {2,6,6,6,8,8};
		int [] b = {1,1,2,3,6,6,9};
		
		int res[] = intersectionOfTwoSortedArray(a,b);
		
		for (int i : res) {
			System.out.print(i+" ");
		}
		
	}

}
