
public class FindSingleOccurence {
	
	public static int findNumber(int[] arr) {
		int res = arr[0];
		for(int i=1;i<arr.length;i++) {
			res = res ^ arr[i];
		}
		return res;
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 1, 15, 3, 5, 4, 5, 3, 4};
		System.out.println(findNumber(arr));
	}

}
