public class CheckPairInArray{

    private static final int MAX = 100000;
    
    public static boolean isPresent(int[] arr, int sum){
        boolean[] binmap = new boolean[MAX];
        for (int i=0;i<arr.length;i++){
            int temp = sum - arr[i];
            if (temp >= 0 && binmap[temp]) {
                return true;
            }
            binmap[arr[i]] = true;
        }
        return false;
    }
    public static void main(String []args){
        int A[] = {1, 4, 4, -1, 6};
        int n = 8;
        System.out.println(isPresent(A, n));
    }
}
