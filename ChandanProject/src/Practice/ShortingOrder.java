package Practice;

import java.util.Scanner;

public class ShortingOrder {
	int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the Array:-");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " values:-");
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

	int[] shortArray(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				c[k] = a[i];
				k++;
				i++;
			} else {
				c[k] = b[j];
				k++;
				j++;
			}
		}
		while (i < a.length) {
			c[k] = a[i];
			k++;
			i++;
		}
		while (j < b.length) {
			c[k] = b[j];
			k++;
			j++;
		}
		return c;
	}

	public static void main(String[] args) {
		ShortingOrder so = new ShortingOrder();
		System.out.println("Read 1st Array:-");
		int[] x = so.readArray();
		System.out.println("Read 2nd Array:-");
		int[] y = so.readArray();
		System.out.println("User entered 1st Array:-");
		so.displayArray(x);
		System.out.println("User entered 2nd Array:-");
		so.displayArray(y);
		System.out.println("After shorting:-");
		int[] z = so.shortArray(x, y);
		so.displayArray(z);
	}
}
