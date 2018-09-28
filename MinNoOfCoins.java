
public class MinNoOfCoins {
	
	public static int minCoins(int[] coins, int V) {
		int[] table = new int[V+1];

		table[0] = 0;
		for(int i=1;i<=V; i++)
			table[i] = Integer.MAX_VALUE;
		
		
		for(int i=1;i<=V;i++) {
			for(int j=0; j<coins.length;j++) {
				if(coins[j] <= i) {
					int sub_res = table[i-coins[j]];
					if(sub_res != Integer.MAX_VALUE && sub_res + 1 < table[i]) {
						table[i] = sub_res + 1;
					}
				}
			}
		}
		
		return table[V];
		
		
//		for(int i=0; i < coins.length; i++ ) {
//			if(coins[i] <= V) {
//				int subRes = minCoins(coins, V-coins[i]);
//				
//				System.out.println("SUB " + subRes + " || RES " + res );
//				if(subRes != Integer.MAX_VALUE && subRes + 1 < res)
//					res = subRes + 1;
//				
//			}
//		}
//		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int coins[] =  {1, 5, 6, 9}; 
        int V = 11; 
        System.out.println("Minimum coins required is "+ minCoins(coins, V) ); 
	}

}
