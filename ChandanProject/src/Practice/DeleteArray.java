package Practice;

import java.util.Scanner;

public class DeleteArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array:-");
		int size = sc.nextInt();
		System.out.println("Enter " + size + " values:-");
		int[] ar = new int[size];
		System.out.println("Befor delete");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
			System.out.println(ar[i] + " ");
		}
		System.out.println("Enter the index value to deleate:-");
		int in = sc.nextInt();
		System.out.println("After delete:-");
		int[] y = deleteArray(ar, in);
		for (int i = 0; i < y.length; i++) {
			System.out.println(y[i] + " ");
		}
	}

	static void displayArray(int[] ar, int in) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + " ");
		}
		System.out.println();
	}

	static int[] deleteArray(int[] ar, int in) {
		if (in < 0 || in >= ar.length) {
			System.out.println("Not possible to delete:-");
			return ar;
		}
		int[] br = new int[ar.length - 1];
		for (int i = 0; i < br.length; i++) {
			if (i < in)
				br[i] = ar[i];
			else
				br[i] = ar[i + 1];
		}
		return br;
	}

}
