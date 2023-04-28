package Practice;

import java.util.Scanner;

public class ArrayOperatin {
	int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array:-");
		int size = sc.nextInt();
		System.out.println("Enter " + size + " values:-");
		int[] ar = new int[size];
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
}
