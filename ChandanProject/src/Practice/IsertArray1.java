package Practice;

import java.util.Scanner;

public class IsertArray1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array:-");
		int size = sc.nextInt();
		System.out.println("Enter " + size + " values:-");
		int[] ar = new int[size];
		System.out.println("Before insert:-");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
			System.out.println(ar[i] + " ");
		}
		System.out.println("Enter the index:-");
		int in = sc.nextInt();
		System.out.println("Enter the Element:-");
		int ele = sc.nextInt();
		int[] insert = insertArray(ar, in, ele);
		System.out.println("After insert:-");
		for (int i = 0; i < insert.length; i++) {
			System.out.println(insert[i] + " ");
		}
	}

	private static int[] insertArray(int[] ar, int in, int ele) {
		if (in < 0 || in > ar.length) {
			System.out.println("Index out of range.");
			return ar;
		}
		int[] br = new int[ar.length + 1];
		br[in] = ele;
		for (int i = 0; i < ar.length; i++) {
			if (i < in)
				br[i] = ar[i];
			else
				br[i + 1] = ar[i];
		}
		return br;

	}
}
