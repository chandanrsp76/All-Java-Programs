package string;

public class MergeTwoArrayInZigZagOrder {

	public static void main(String[] args) {
		int[] x = { 1, 3, 5, 7, 9, };
		System.out.println("\nUser Enter 1st Array:-");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + ",");
		}
		int[] y = { 2, 4, 6, 8, 10 };
		System.out.println("\nUser Enter 2nd Array:- ");
		for (int i = 0; i < y.length; i++) {
			System.out.print(y[i] + ",");
		}
		int[] arr1 = zigZagOrder(x, y);
		System.out.println("\nAfter Merging ZigZag Order:-");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+",");
		}

	}

	public static int[] zigZagOrder(int[] x, int[] y) {
		int[] z = new int[x.length + y.length];
		int i = 0, j = 0;
		while (i < x.length && i < y.length) {
			z[j] = x[i];
			j++;
			z[j] = y[i];
			j++;
			i++;
		}
		while (i < x.length) {
			z[j] = x[i];
			j++;
			i++;
		}
		while (i < y.length) {
			z[j] = y[i];
			j++;
			i++;
		}
		return z;
	}
}
