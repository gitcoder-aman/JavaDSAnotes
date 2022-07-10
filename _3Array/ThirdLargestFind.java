package _3Array;

public class ThirdLargestFind {
	
	public static int thirdMax(int a[]) {
		
		int thirdmax = Integer.MIN_VALUE;
		int firstmax = Integer.MIN_VALUE;
		int secmax = Integer.MIN_VALUE;
		System.out.println(thirdmax);
		
		for(int i = 0; i < a.length; i++) {
			
			if(a[i] > firstmax) {
				secmax = firstmax;
				firstmax = a[i];
			}
			else if(a[i] < firstmax) {
				if(a[i] > secmax) {
					thirdmax = secmax;
					secmax = a[i];
				}
			}
			 if(a[i] < secmax) {
				if(a[i] > thirdmax) {
					thirdmax = a[i];
				}
			}
		}
		return thirdmax;
	}
	public static void main(String [] args) {
		
		int a[] = {5,3,8,2,7,6,1};
		
		System.out.println(thirdMax(a));
	}

}
