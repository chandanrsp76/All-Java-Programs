package numbersystem;

public class ReverseNumber {

	public static void main(String[] args) {
		int n = 234567;
		int r = reverse(n);
		System.out.println(r);
	}

	public static int reverse(int x) {
		int rev = 0;
		do {
			int d = x % 10;
			rev = rev * 10 + d;
			x = x / 10;
		} while (x != 0);
		return rev;
	}
}
