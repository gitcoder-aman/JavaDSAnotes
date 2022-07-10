package _3Array;

public class IsSortedArray {
	
	public static boolean checkSort(int a[]) {
		
		int checkNumber = -1;
		for(int i = 0; i < a.length; i++) {
			
			if(a[i] > checkNumber) {
				
				checkNumber = a[i];
				
			}
			else {
				return false;
			}
		}
		return true;
	}
	public static void main(String [] args) {
		
		int a[] = {2,6,9,10,11,23};
		
		System.out.println(checkSort(a));
	}

}
