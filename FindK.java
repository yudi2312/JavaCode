import java.util.ArrayList;
import java.util.HashMap;

public class FindK {
	
	public static void findK(int[] arr) {
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		HashMap<Integer, Integer> map =  new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(Math.abs(arr[i]))) {
				if(map.get(Math.abs(arr[i])) == 1) {
					map.put(Math.abs(arr[i]), 0);
					if(!arrList.contains(Math.abs(arr[i]))) {
						arrList.add(Math.abs(arr[i]));
						arrList.add(-Math.abs(arr[i]));
					}
				}
			} else {
				map.put(Math.abs(arr[i]), 1);
			}			
		}
		
		if(arrList.isEmpty()) {
			System.out.println(0);
			return;
		}
		
		System.out.println(arrList);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {-1, 1, 0, 4, 3, -4, -3};
		findK(arr);
		
	}

}
