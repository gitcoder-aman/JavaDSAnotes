package _20Queue;

public class _6CircularTour {

	static int circularTourProblem(int p[],int d[]) {
		
		int n = p.length;
		int start = 0;
		int cur = 0;
		int deficit = 0; //how many want to distance
		
		for(int i = 0; i<n; i++) {
			cur += (p[i] - d[i]);
			
			if(cur < 0) {
				deficit += cur;
				cur = 0;
				start = i+1;
			}
		}
		if(cur + deficit >= 0) return start;
		
		return -1;
	}
	public static void main(String[] args) {

		int p[] = {6,10,2,3,20}; //petrol
		int d[] = {5,8,4,5,6};  //distance
		
		System.out.println(circularTourProblem(p, d));
	}

}
