
public class StringPalindrome {

	public static void main(String[] args) {
		int num = 1224;
		if (reverse(num))
			System.out.println(num + " is a palindrome number");
		else
			System.out.println(num + " is not a palindrome number");
	}

	private static boolean reverse(int num) {
		int rev = 0, temp = num;
		while (num != 0) {
			int d = num % 10;
			rev = rev * 10 + d;
			num = num / 10;
		}
		return rev == temp;
	}
}
