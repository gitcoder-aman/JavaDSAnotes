package _14Hashing;

import java.util.HashSet;

public class _3CountDistinctElements {

	static int countDistinctElements(int a[]) {
		
		HashSet<Integer> htHashSet = new HashSet<>();
		
		for(int e : a) {
			htHashSet.add(e);
		}
		System.out.println(htHashSet);
		return htHashSet.size();
	}
	public static void main(String[] args) {

		int [] a = {1,2,1,3,2,4,2,5,7,5,4,2};
		
		System.out.println(countDistinctElements(a));
		
	}

}
