package LeetCodeQ;

import java.util.ArrayList;
import java.util.Collections;

public class UnionOfTwoSortedArray {

	public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        int i = 0;
        int j = 0;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
    
        while(i < n){
            if(!arrayList.contains(arr1[i]))
            arrayList.add(arr1[i]);
            
            i++;
        }
        while(j < m){
             if(!arrayList.contains(arr2[j]))
             arrayList.add(arr2[j]);
            
            j++;
        }
        Collections.sort(arrayList);
        return arrayList;
    }
	public static void main(String[] args) {

		int arr1[] = {1,1,1,1,1};
		int arr2[] = {2,2,2,2,2};
		
		ArrayList<Integer> array = findUnion(arr1, arr2, 5, 5);
		
		for (int i : array) {
		
			System.out.print(i + " ");
		}
	}

}
