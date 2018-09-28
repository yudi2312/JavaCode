
public class LargestSumSubArray {
	
	public static int largestSumSubArray(int[] arr) {
		int max_so_far = arr[0], curr_max = arr[0];
		for(int i=1; i<arr.length; i++) {
			curr_max = Math.max(curr_max + arr[i], arr[i]);
			max_so_far = Math.max(max_so_far, curr_max);
		}
		return max_so_far;
	}

	public static void main(String[] args) {
		
		int[] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
		System.out.print(largestSumSubArray(a));
	}

}
