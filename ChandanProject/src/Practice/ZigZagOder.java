package Practice;

import java.util.Scanner;

public class ZigZagOder {
	int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array:-");
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

	int[] zigZag(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int i = 0, j = 0;
		while (i < a.length && i < b.length) {
			c[j] = a[i];
			j++;
			c[j] = b[i];
			j++;
			i++;
		}
		while (i < a.length) {
			c[j] = a[i];
			j++;
			i++;
		}
		while (i < b.length) {
			c[j] = b[i];
			j++;
			i++;
		}
		return c;
	}

	public static void main(String[] args) {
		ZigZagOder zo = new ZigZagOder();
		System.out.println("Read 1st Array:-");
		int[] x = zo.readArray();
		System.out.println("Read 2nd Array:-");
		int[] y = zo.readArray();
		System.out.println("User entered 1st Array:-");
		zo.displayArray(x);
		System.out.println("User Entered 2nd array:-");
		zo.displayArray(y);
		System.out.println("Atfer merge:-");
		int[] z = zo.zigZag(x, y);
		zo.displayArray(z);
	}

}
