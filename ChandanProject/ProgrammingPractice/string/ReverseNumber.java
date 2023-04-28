package string;

public class ReverseNumber {

	public static void main(String[] args) {
		int n = 1234567;
		int rev = reverse(n);
		System.out.println(rev);

	}

	private static int reverse(int n) {
		int rev = 0;
		while (n != 0) {
			int d = n % 10;
			rev = rev * 10 + d;
			n = n / 10;
		}
		return rev;
	}

}
