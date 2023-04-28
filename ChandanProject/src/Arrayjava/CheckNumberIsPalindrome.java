package Arrayjava;

public class CheckNumberIsPalindrome {

	public static void main(String[] args) {
		int n = 1222;
		if(isPalindrome(n)) {
			System.out.println(n+" is a palindrome Number");
		}else {
			System.out.println(n+" is not a palindrome number");
		}
	}

	private static boolean isPalindrome(int n) {
		int rev = 0, temp = n;
		while (n != 0) {
			int d = n % 10;
			rev = rev * 10 + d;
			n = n / 10;
		}
		return rev == temp;
	}

}
