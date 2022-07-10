package _9BitMaipulation;

public class _1FindIthBit {

	static int findIthBit(int n,int i) {
		
		int mask = 1 << i;
		
		int result = n & mask;
		if(result == 0) return 0;
		else return 1;
	}
	public static void main(String[] args) {

		System.out.println(findIthBit(5,2));
	}

}
