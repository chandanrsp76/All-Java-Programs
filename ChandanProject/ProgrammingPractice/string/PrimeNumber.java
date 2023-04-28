package string;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:-");
		int n = sc.nextInt();
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				System.out.print(i+" ");
			}

		}
	}

	private static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}

}
