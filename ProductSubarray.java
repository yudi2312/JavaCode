
public class ProductSubarray {
	
	public static int min(int x, int y) { return x < y ? x : y; }		
	public static int max(int x, int y) { return x > y ? x : y; }
	
	public static int maxSubarrayProduct(int[] arr) {
		int max_ending_here = 1;
		int min_ending_here = 1;
		for(int i=0; i <arr.length; i++) {
			if(arr[i] > 0) {
				max_ending_here = max_ending_here * arr[i];
				min_ending_here = min(min_ending_here, 1);
			}
			else if( arr[i] == 0) {
				max_ending_here = 1;
				min_ending_here = 1;
			}
			else
			{
				int temp = max_ending_here;
			}
							
		}
		
		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
