
public class FindSecondLargest {
	
	public static int findSecondLargest(int[] arr) {
		int first, second;
		if(arr.length < 2)
			return 0;
		first = second = Integer.MIN_VALUE;
		for(int i: arr) {
			if(i > first) {
				second = first;
				first = i;
			} else if (i > second && i <= first )
				second = i;			
		}		
		if(second==Integer.MIN_VALUE)
			return 0;
		return second;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 4, 5, 6, 7, 1, 9, 10, 14};
		System.out.println(findSecondLargest(arr));
	}

}
