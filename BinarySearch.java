
public class BinarySearch {
	
	
	public static int getIndex(int[] arr, int V) {
		
		int l=0, r=arr.length-1;
		
		while(l<=r) {
			int m = l + (r-l)/2;
			if(arr[m] == V)
				return m;
			if(arr[m] < V)
				l = m+1;
			else
				r = m-1;			
		}
		
		return -1;
	}
	
	public static void main (String[] args) {
		
		int[] arr = {1, 2, 4, 10, 3, 6, 7, 5};
		
		System.out.println(getIndex(arr, 10)+1);
	}

}
