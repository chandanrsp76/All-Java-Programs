package numbersystem;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:-");
		int n = sc.nextInt();
		boolean prime = isPrime(n);
		if (prime)
			System.out.println(n + " is a prime Number");
		else
			System.out.println(n + " is not a Prime Number.");
	}
	private static boolean isPrime(int x) {
		for (int i = 2; i <= x / 2; i++) {
			if (x % i == 0)  {
				return false;
			}		}
		return true;
	}

}
