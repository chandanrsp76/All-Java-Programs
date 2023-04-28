package numbersystem;

import java.util.Scanner;

public class PalindromeNumberWithinN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number.");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			if (palindromeNumber(i))
				System.out.print(i + " ");
		}
	}

	private static boolean palindromeNumber(int x) {
		int rev = 0, temp = x;
		do {
			int d = x % 10;
			rev = rev * 10 + d;
			x = x / 10;
		} while (x != 0);
		return rev == temp;
	}

}
