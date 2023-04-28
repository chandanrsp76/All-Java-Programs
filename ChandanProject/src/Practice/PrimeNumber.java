package Practice;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter " + n + " Values");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (isPrime(ar[i]))
				count++;
		}
		System.out.println(count);
	}

	private static boolean isPrime(int x) {
		for (int j = 2; j < x; j++) {
			if (x % j == 0)
				return false;
		}
		return true;
	}

}
