package Application;

import java.util.Scanner;

public class CountPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range");
		int n = sc.nextInt();
		int count = 0;
		for (int j = 0; j <= n; j++) {
			if (isPrime(j))
				System.out.println(j);
			//count++;
		}
	//	System.out.println(count);
	}

	public static boolean isPrime(int y) {
		for (int i = 2; i <= y/2; i++) {
			if (y % i == 0)
				return false;
		}
		return true;
	}
}
