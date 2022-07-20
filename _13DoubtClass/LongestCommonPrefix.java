package _13DoubtClass;

//Given a set of strings . find the longest common prefix using Divide
// and Conquer.

 // STRING : "Apple","App" and "Apply" have "App" in common prefix.

public class LongestCommonPrefix {

	static String commonUtilString(String firstString, String secondString) {
		
		int i = 0,j = 0;
		
		while(i < firstString.length() && j < secondString.length()) {
		
			if(firstString.charAt(i) != secondString.charAt(j)) {
				break;
			}
			i++;
			j++;
		}
		return firstString.substring(0,i); // i not include
	}
	static String longestCommonPrefix(String [] a,int l,int r) {
		
		if(l > r) return null;
		if(l+1 == r) return commonUtilString(a[l],a[r]);
		while(l <= r) {
			int mid = (l + r)/2;
			String leftString = longestCommonPrefix(a, l, mid);
			String rightString = longestCommonPrefix(a, mid+1, r);
			
			return commonUtilString(leftString,rightString);
		}
		return null;
	}
	public static void main(String[] args) {

		String [] s = {"Apple","App","Apply","App"};
		
		System.out.println(longestCommonPrefix(s,0,s.length-1));
 	}

}
