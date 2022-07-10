package _4Recursion;

import java.util.HashSet;
import java.util.Set;

//set is stored unique value
//Time Complexity = O(2^n)
//Space Complexity = O(n)
public class SubsetOfAString6 {

	static void generateAllSubsets(String s) {
		Set<String>set = new HashSet<>();
		utilGenerateAllSubsets(s,0,"",set);
		
		for(String st:set) {
			System.out.println(st);
		}
	}
	static void utilGenerateAllSubsets(String s,int i,String curr,Set<String>set) {
		
		//base case
		if(i == s.length()) {
			//System.out.println(curr);
			set.add(curr);
			return;
		}
		utilGenerateAllSubsets(s,i+1,curr,set);
		utilGenerateAllSubsets(s,i+1,curr + s.charAt(i),set);
	}
	public static void main(String[] args) {

		generateAllSubsets("aaa");
		generateAllSubsets("abc");
	}

}
