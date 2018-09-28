
public class SearchInRotatedArray {
	
	public static int searchInSortedArray(int[] arr, int V) {
		int pivot = findPivot(arr, 0, arr.length - 1);
		
		if(pivot==-1)
			return binarySearch(arr, 0, arr.length-1, V);
		
		if(arr[pivot]==V)
			return pivot;
		
		if(arr[0] <= V)
			return binarySearch(arr, 0, pivot-1, V);
		return binarySearch(arr, pivot+1, arr.length-1, V);
		
	}
	
	public static int findPivot(int[] arr, int low, int high) {
		if(high<low)
			return -1;
		if(high==low)
			return low;
		
		int mid = (low+high)/2;
		if(mid<high && arr[mid] > arr[mid+1])
			return mid;
		if(mid>low && arr[mid] < arr[mid-1])
			return (mid-1);
		if(arr[low] >= arr[mid])
			return findPivot(arr, low, mid-1);
		return findPivot(arr, mid+1, high);				
	}
	
	public static int binarySearch(int[] arr, int l, int r, int V) {
		
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

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		
        System.out.println("Index of the element is : "
                      + searchInSortedArray(arr, 10));

	}

}
