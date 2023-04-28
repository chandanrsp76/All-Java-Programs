package string;

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Setence............");
		String str = sc.nextLine();
		boolean rs = isPangram(str);
		if (rs) {
			System.out.println("Given String is Pangram.");
		} else {
			System.out.println("Given String is not Pangram.");
		}

	}

	public static boolean isPangram(String str) {
		if (str.length() < 26) {
			return false;
		}
		int count[] = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				count[ch - 65]++;
			} else if (ch >= 'a' && ch <= 'z') {
				count[ch - 97]++;
			}
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] == 0)
				return false;
		}
		return true;

	}

}
