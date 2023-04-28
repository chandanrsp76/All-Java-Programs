package string;

import java.util.Scanner;

public class Palindrome1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:-");
		int n = sc.nextInt();
		if (isPalindrome(n)) {
			System.out.println(n + " is a Palindrome Number");
		} else {
			System.out.println(n + " is not a Palindrome Number");
		}

	}

	private static boolean isPalindrome(int n) {
		int rev = 0, temp = n;
		while (n != 0) {
			int d = n % 10;
			rev = rev * 10 + d;
			n = n / 10;
		}
		return rev == temp;
	}

}
