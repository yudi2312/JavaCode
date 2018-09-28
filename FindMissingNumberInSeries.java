
public class FindMissingNumberInSeries {
	
	public static int findNumber(int[] arr) {
		int n = arr.length + 1;
		int total = (n)*(n+1)/2;
		for(int i:arr) {
			total -= i;
		}		
		return total;		
	}
	
	public static int findNumberUsingXOR(int[] arr) {
		int x1 = arr[0];
		int x2 = 1;
		
		for(int i=1; i<arr.length;i++)
			x1 = x1^ arr[i];
		
		for(int i=2; i<=arr.length+1;i++)
			x2 = x2 ^ i;
		
		return x1 ^ x2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 5, 6};
		System.out.println(findNumberUsingXOR(arr));
	}

}
