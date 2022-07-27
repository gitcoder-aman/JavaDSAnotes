package _14Hashing;

import java.util.HashMap;
import java.util.Map;

public class _94SumIsEqual {
	static class Pair{
		int i,j;
		
		public Pair(int i,int j) {
			this.i = i;
			this.j = j;
		}
	}

	static void fourSum(int a[],int x) {
		
		Map<Integer, Pair>map = new HashMap<>();
		
		for(int i = 0; i < a.length-1; i++) {
			
			for(int j = i + 1; j < a.length; j++) {
				map.put(a[i]+a[j], new Pair(i, j));
			}
		}
		for(Map.Entry<Integer, Pair>entry:map.entrySet()) {
			
			int firstSum = entry.getKey();
			Pair firstPair = entry.getValue();
			
			int secondSum = x - firstSum;
			
			if(map.containsKey(secondSum)) {
				Pair secondPair = map.get(secondSum);
				
				if(firstPair.i != secondPair.i && firstPair.i != secondPair.j 
						&& firstPair.j != secondPair.i && firstPair.j != secondPair.j) {
					
					System.out.println(firstPair.i + " "+ firstPair.j +" "+ secondPair.i + " "+ secondPair.j);
				    //return;
				}
			}
		}
		System.out.println("Not Found");
	}
	public static void main(String[] args) {

		int [] a = {2,3,4,6,8};
		int x = 19;
		
		
		fourSum(a, x);
	}

}
