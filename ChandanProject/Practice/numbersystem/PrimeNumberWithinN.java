package numbersystem;

import java.util.Scanner;

public class PrimeNumberWithinN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:-");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			if (printPrime(i))
				System.out.println (i);
		}
	}

	public static boolean printPrime(int x) {
		for (int i = 2; i <= x / 2; i++) {
			if (x % i == 0)
				return false;
		}
		return true;
	}
}
