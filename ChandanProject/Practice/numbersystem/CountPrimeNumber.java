package numbersystem;

import java.util.Scanner;

public class CountPrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:-");
		int n=sc.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (countPrime(i)) {
				count++;
			}
		}

		System.out.println(count);
	}

	public static boolean countPrime(int x) {

		for (int i = 2; i <= x / 2; i++) {
			if (x % i == 0)
				return false;
		}
		return true;
	}
}
