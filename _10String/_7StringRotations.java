package _10String;

public class _7StringRotations {

	public static boolean rotationalString(String s1, String s2) {
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		String doubleString = s1+s1;
		return doubleString.contains(s2);
	}
	public static void main(String[] args) {

	   String s1 = "abcd";
	   String s2 = "cdab";
	   
	   System.out.println(rotationalString(s1, s2));
	}
//  abcdabcd
}
