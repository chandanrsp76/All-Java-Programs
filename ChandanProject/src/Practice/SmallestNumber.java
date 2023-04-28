package Practice;

public class SmallestNumber {
	public static void main(String[] args) {
		int[] x = { 10, 28, 30, 3, 27, 19, };
		int sm = getSmallest(x);
		System.out.println("Smallest nummberis: " + sm);
	}

	private static int getSmallest(int[] ar) {
		int small = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < small) {
				small = ar[i];
			}
		}
		return small;
	}
}
