package _10String;

public class _4ReverseWordString {

	static void reverseCharacters(char[]s,int i,int j) {
		while(i < j) {
			char temp = s[i];
			s[i++] = s[j];
			s[j--] = temp;
		}
	}
	static String reverseWords(String s) {
		
		char [] c = s.toCharArray();
		
		int start = 0;
		int end  = 0;
		for(; end < s.length(); end++) {
			if(c[end] == ' ') {
				reverseCharacters(c,start,end-1);
				start = end + 1; 
			}
		}
		//for last word reverse
		reverseCharacters(c,start,end-1);
	
		//step 2
		//All word reverse in a Sentence
		reverseCharacters(c,0,s.length()-1);
		return new String(c);
	}
	public static void main(String[] args) {

		String s = "I am the Boss";
		
		System.out.println(reverseWords(s));
	}

}
