package Practice;

public class BiggestNumber {
	public static void main(String[] args) {
		int[] x = { 17, 13, 65, 37, 17, 45 };
		int bg = getBiggest(x);
		System.out.println(bg);
	}

	private static int getBiggest(int[] ar) {
		int big = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > big) {
				big = ar[i];
			}

		}
		return big;
	}
}
