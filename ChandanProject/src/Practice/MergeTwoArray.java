package Practice;

import java.util.Scanner;

public class MergeTwoArray {
	int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " values");
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		return ar;
	}

	void displayArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + " ");
		}
		System.out.println();
	}

	int[] merge(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];
		}
		return c;
	}

	public static void main(String[] args) {
		MergeTwoArray ma = new MergeTwoArray();
		System.out.println("Read 1st Array:-");
		int[] x = ma.readArray();
		System.out.println("Read 2nd Array:-");
		int[] y = ma.readArray();
		System.out.println("User entered 1st Array:-");
		ma.displayArray(x);
		System.out.println("User entered 2nd Array:-");
		ma.displayArray(y);
		int[] z = ma.merge(x, y);
		System.out.println("After merge:-");
		ma.displayArray(z);
	}

}
