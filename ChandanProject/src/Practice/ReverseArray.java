package Practice;

public class ReverseArray {
	public static void main(String[] args) {
		int[] x = { 12, 13, 16, 19, 18, 10 };
		System.out.println("Before Reverse.");
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		Reverse(x);
		System.out.println("After Reverse.");
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

	private static void Reverse(int[] ar) {
		int i = 0, j = ar.length - 1;
		while (i < j) {
			int temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
			i++;
			j--;
		}

	}
}
