
public class SplitTwoEqualSumArray {

	public static int findElement(int[] arr) {
		int rightSum = 0, leftSum = 0;
		for(int i=1;i<arr.length;i++) {
			rightSum += arr[i];
		}
		
		for(int i=0, j=1;j<arr.length;j++, i++) {
			leftSum += arr[i];
			rightSum -= arr[j];
			
			if(leftSum==rightSum) {
				return arr[i+1];
			}
		}
		
		return -1;
	}
	
	
//	public static int findElement(int[] arr) {
//		
//		int rightSum = 0, leftSum = 0;
//		
//		for(int i=1; i< arr.length; i++)
//			rightSum += arr[i];
//		
//		for(int i=0, j = 1; j < arr.length; i++, j++) {
//			rightSum -= arr[j];	
//			leftSum += arr[i];
//			
//			if(leftSum == rightSum) {
//				return arr[i+1];
//			}
//		}
//			
//		return -1;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = { 2, 3, 1, 5 };        
        System.out.println(findElement(arr));

	}

}
