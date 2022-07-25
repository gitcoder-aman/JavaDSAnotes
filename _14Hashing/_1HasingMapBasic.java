package _14Hashing;

import java.util.HashMap;

public class _1HasingMapBasic {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer>map = new HashMap<>();
		
		//Time Complexity of All Function works in O(1) 
		map.put("One", 1);
		map.put("Two", 2);
		
		map.put("One", 3);  //replace value from I
		
		System.out.println(map.get("One"));
		
		System.out.println(map.containsKey("Two"));
		
	    map.remove("One");
		
		System.out.println(map);
		
		
		int [] a = {1,2,1,3,2,4,2,5,7,5,4,2};
		
		HashMap<Integer, Integer>ht = new HashMap<>();
	    
		ht.put(7, 1);
		System.out.println(ht.get(7));
		for (int i : a) {
		    
			ht.put(i, 1);
			System.out.println(ht.get(i));
			
			System.out.println(ht);
		}
	}

}
