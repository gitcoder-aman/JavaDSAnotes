package _8DoubleSecond;

public class majorityElement {

	static int majority(int a[]) {
        
		int currElement = -1;
		int count = 0;
		
		for(int i = 0; i < a.length; i++) {
			if(count == 0) {
				currElement = a[i];
				count = 1;
			}else {
				if(a[i] == currElement) {
					count++;
				}
				else {
					count--;
				}
			}
		}
		int finalCount = 0;
		for(int e : a) {
			if(e == currElement) {
				finalCount++;
			}
		}
		if(finalCount > a.length / 2) {
			return currElement;
		}
		else {
			return -1;
		}
	}
	public static void main(String[] args) {
		
		int a[] = {3,2,3,5,3,7,3};
		
		System.out.println(majority(a));
		
	}

}
