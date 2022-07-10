package _3Array;

public class ReverseArray {
	
	public static void reverse(int a[]) {
		
		int s = 0;
		int e = a.length - 1;
		
		while(s <= e) {
			
			int temp = a[s];
			a[s++] = a[e];
			a[e--] = temp;
			
		}
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
	
		int a[] = {2,5,6,12,7,9};
		
		reverse(a);

	}

}
