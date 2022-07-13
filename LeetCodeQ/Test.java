package LeetCodeQ;

public class Test {

	    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        
	        int j = 0;
	        int m = nums1.length;
	        int n = nums2.length;
	        int k = 0;
	        int i = 0;
	        int ans[] = new int[n+m];
	       while(i < m && j < n) {
	            if (nums1[i] < nums2[j]) {
	                ans[k++] = nums1[i++];
	            }else{
	                ans[k++] = nums2[j++];
	            }
	        }
	        while (j < n) {
	            ans[k++] = nums2[j++];
	        }
	        while(i < m) {
	        	ans[k++] = nums1[i++];
	        }
	        for (double e : ans) {
	            System.out.println(e * 1.00000);
	        }
	        int mid = ans.length/2;
	        if(ans.length % 2 == 0 && mid != 0){

	            double midian = ((double)ans[mid] + (double)ans[mid-1])/2;
	            return midian;
	        }
	        return ans[mid];
	    }
	   public static void main(String[] args) {
	        int [] nums1 = {1,2};
	        int [] nums2 = {3,4};

	        double ans = findMedianSortedArrays(nums1,nums2);
	        System.out.println(ans);
	    }
}
