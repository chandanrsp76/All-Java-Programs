package string;

public class MergeTwoArray {

	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("\nUser Entered 1st Array:- ");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println("\nUser Enterd 2nd Array:-");
		int[] y = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,20 };
		for (int i = 0; i < y.length; i++) {
			System.out.print(y[i] + " ");
		}
		int[] m = merge(x, y);
		System.out.println("\nAfter Merge Array:-");
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + " ");
		}
	}

	private static int[] merge(int[] x, int[] y) {
		int[] z=new int[x.length+y.length];
		for (int i = 0; i < x.length; i++) {
			z[i]=x[i];
		}
		for (int i = 0; i < y.length; i++) {
			z[x.length+i]=y[i];
		}
		return z;
	}

	
}
