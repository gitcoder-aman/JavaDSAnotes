package _17DoubtHashing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraySort {

	public static void main(String[] args) {

		int a[][] = {
				{1,2,23},
				{3,5,12},
				{2,7,1}
		};
		
		Arrays.sort(a,new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				
				return o1[0] - o2[0];
			}
		});
		
		
		for(int x[] : a) {
			for(int e : x) {
				System.out.print(e+" ");
			}
			System.out.println();
		}
	}

}
