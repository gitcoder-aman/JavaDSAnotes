package _14Hashing;

import java.util.HashMap;

//Time complexity = O(n)
//Space Complexity = O(n)
public class _4Frequency {

	static void frequencyOfElement(int [] a) {
		
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		
		for(int e : a) {
			
//			if(hashMap.containsKey(e)) {
//				int temp  = hashMap.get(e); //no of key store
//				hashMap.put(e, temp+1);
//			}
//			else {
//				hashMap.put(e, 1);
//			}
			hashMap.put(e,hashMap.getOrDefault(e,0)+1);
			
			System.out.println(e + " "+ hashMap);
		}
			System.out.println(hashMap);	
	}
	public static void main(String[] args) {
		
		int [] a = {1,2,1,3,2};
		
		frequencyOfElement(a);
		
	}

}
