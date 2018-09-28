
public class Palindrome {
	
	public static boolean isPalindrome(String s) {
		int n = s.length();
		for(int i = 0;i<n/2;i++) {
			if(s.charAt(i) != s.charAt(n-i-1))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String s = "Hoobooh";
		System.out.println(isPalindrome(s.toLowerCase()));
		
	}

}
