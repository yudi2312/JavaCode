import java.util.HashMap;
import java.util.HashSet;

public class FindDuplicate {
	
	public static int getNoOfDupliates(int[] arr) {
		int count = 0;
		
		HashMap<Integer, Integer> set = new HashMap<Integer, Integer>();
		
		for(int i: arr) {
			if(set.containsKey(i) && set.get(i) == 1) {
				set.replace(i, 2);
				count++;
			}
			else{
				set.put(i, 1);
			}
		}
		
		return count;
	}
	
	public static int getDuplicateInSeries(int[] arr) {
		 
		int count=0;
		for(int i=0; i < arr.length; i++) {
			if( arr[Math.abs(arr[i])] >= 0)
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			else
				++count;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {0, 0, 1, 2, 3, 4};
		
		System.out.println(getNoOfDupliates(arr));
		System.out.println(getDuplicateInSeries(arr));
		
	}

}
