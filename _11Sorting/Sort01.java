package _11Sorting;

//Dutch National Flag use
public class Sort01 {

	public static void Sort(int a[]) {
		
		int low = 0;
		int high = a.length-1;
		int mid = 0;
		while(mid < high) {
			
			if(a[mid] == 0) {
				int temp = a[low];
				a[low] = a[mid];
				a[mid] = temp;
				low++;
			    mid++;
			}
			else if(a[mid] == 1) {
				mid++;
			}
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
	public static void main(String[] args) {

		int a[] = {1,1,0,1,0,0,1};
		
		Sort(a);
	}
}
