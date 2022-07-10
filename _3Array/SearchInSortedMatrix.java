package _3Array;

public class SearchInSortedMatrix {
	
	static boolean searchInMatrix(int a[][],int key) {
		
		int row = 0;
		int col = a.length - 1;
		
		while(row < a.length && col >= 0) {
			if(a[row][col] == key) {
				return true;
			}
			else if(key > a[row][col]) {
				row++;
			}
			else {
				col--;
			}
		}
		return false;
	}
	public static void main(String args[]) {
		
		int [][] a = {{1,3,5,7},
	             	  {10,11,16,20},
	             	  {23,30,34,60}};
		
		int key = 11;
		if(searchInMatrix(a,key)) {
			System.out.println("Key is Found");
		}
		else {
			System.out.println("Key is not Found");
		}
	}

}
