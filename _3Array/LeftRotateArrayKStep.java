package _3Array;

public class LeftRotateArrayKStep {

	static void reverse(int a [], int s,int e) {
		
		int temp = 0;
		while(s <= e) {
			temp  = a[s];
			a[s++] = a[e];
			a[e--] = temp;
		}
	}
	static void rotate(int a[],int k) {
		
		reverse(a,0,k-1);
		reverse(a,k,a.length-1);
		reverse(a,0,a.length-1);
		
		for(int i = 0; i < a.length ; i++) {
		
			System.out.print(a[i] + " ");
		}
		
	}
	public static void main(String[] args) {

		int [] a = {1,2,3,4,5,6,7,8};
		int k = 3;
	    
		//2 8 9 2 4 7 3
		
		
	   rotate(a,k);
	}

}
