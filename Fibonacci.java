public class Fibonacci{
    
    public static int getNumberAt(int position){
        int[] arr = new int[position+1];
        arr[1] = 1;
        arr[2] = 1;
        for (int i = 3; i<=position; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[position];
    }

    public static void main(String []args){
        int n = 10000;
        System.out.println(getNumberAt(n));
    }
}
