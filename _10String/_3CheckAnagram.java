package _10String;

public class _3CheckAnagram {

	
	static boolean anagrams(String s1,String s2) {
		
		int a[] = new int[256];
		
		//frequency increase
		for(int i = 0;i < s1.length(); i++) {
			a[s1.charAt(i)]++;
		}
		
		for(int e:a) {
			System.out.print(e + " ");
		}
		//frequency decrease
		for(int i = 0;i < s2.length(); i++) {
			a[s2.charAt(i)]--;
		}
		
		for(int e:a) {
			if(e != 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {

		String st1 = "abcda";
		String st2 = "abca";
		
		System.out.println(anagrams(st1,st2));
		
	}

}
