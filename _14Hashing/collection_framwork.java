package _14Hashing;

import java.util.ArrayList;
import java.util.List;

public class collection_framwork {

	public static void main(String[] args) {

		int a[][] = {
						{1,2},
						{3,5},
						{1,7}
		            };
		
		List<List<Integer>>list = new ArrayList<List<Integer>>();
		for(int i = 0; i < 3; i++ ) {
			
			List<Integer>list2 = new ArrayList<>();
	
			list.add(list2);
		}
		
		list.get(0).add(1);
		list.get(0).add(2);
		
		list.get(1).add(3);
		list.get(1).add(5);
		
		list.get(2).add(1);
		list.get(2).add(7);
		
		System.out.println(list);
	}

}
