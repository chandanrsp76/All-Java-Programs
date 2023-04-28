package Practice;

public class ReplaceEveryArraywWithSum {
	public static void main(String[] args) {
		int[] x = { 15, 78, 45, 12, 46, 79, 12, 45, 79, 54, 79, 45, };
		update(x);
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

	private static void update(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			int n = ar[i], sum = 0;
			do {
				int r = n % 10;
				sum = sum + r;
				n = n / 10;
			} while (n != 0);
			ar[i]=sum;
		}
	}
}
