package _10String;

import java.util.Arrays;

public class _8LongestSubstringChar {

	static int longestSubstringDistinctChars(char[] s) {
		
		int i = 0,j =0;
		
		int index [] = new int [256];
		Arrays.fill(index, -1);
		
		int ans = 0;
		while (j < s.length) {
			
			int lastPos = index[s[j]];
			
			boolean isPresent = true;
			if(lastPos == -1 || lastPos < i) {
				isPresent = false;
			}
			if(isPresent) {
				i = lastPos + 1;
			}
			
			int curWindoSize = j-i+1;
			ans = Math.max(ans,curWindoSize);
			index[s[j]] = j;
			j++;
		}
		return ans;
	}
	public static void main(String[] args) {

		String s = "abcdcapbbbc"; // dcapb 5 ans
		System.out.println(longestSubstringDistinctChars(s.toCharArray()));
	}

}
