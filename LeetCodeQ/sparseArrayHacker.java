package LeetCodeQ;

import java.util.ArrayList;
import java.util.List;

public class sparseArrayHacker {

	 public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
		    
		    List<Integer> list = new ArrayList<Integer>();
		      for (int i = 0; i < queries.size(); i++) {
		          int counter = 0;
		          for(int j = 0; j < strings.size(); j++){
		              
		              if(queries.get(i) == strings.get(j)){
		                  counter++;
		              }
		          }
		          list.add(counter);
		      }
		      return list;
		    }

	public static void main(String[] args) {

		List<String> string = new ArrayList<String>();
		List<String> queries = new ArrayList<String>();
		
		string.add("aba");
		string.add("baba");
		string.add("aba");
		string.add("xzxb");
		
		queries.add("aba");
		queries.add("xzxb");
		queries.add("ab");
		
		System.out.println(matchingStrings(string, queries));
		
		
		
	}

}
