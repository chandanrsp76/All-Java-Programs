package Practice;

import java.util.Scanner;

public class SearchElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array.");
		int n = sc.nextInt();
		System.out.println("Enter " + n + " values");
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println("Enter the Element too search");
		int ele = sc.nextInt();
		int in = search(ar, ele);
		if (in == -1)
			System.out.println("element is not present.");
		else
			System.out.println("Element present at " + in);
	}

	private static int search(int[] ar, int ele) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == ele)
				return i;
		}
		return -1;
	}

}
