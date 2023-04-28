package numbersystem;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number.");
		int n = sc.nextInt();
		if (isPalindrome(n))
			System.out.println(n + " is Palindrome Number.");
		else
			System.out.println(n + " is not a Palindrome number.");
	}

	private static boolean isPalindrome(int x) {
		int rev = 0, temp = x;
		do {
			int d = x % 10;
			rev = rev * 10 + d;
			x = x / 10; 
		} while (x != 0);
		return rev == temp;
	}

}
