package string;

import java.util.Scanner;

public class CheckStringisPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String............");
		String str = sc.nextLine();
		boolean pal = palindrome(str);
		if (pal) {
			System.out.println("Given String is Palindrome.");
		} else {
			System.out.println("Given String is not a Palindrome.");
		}
	}

	private static boolean palindrome(String str) {
		char[] ch = str.toCharArray();
		int i = 0, j = ch.length - 1;// madam
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;

		}
		return true;

	}
}
