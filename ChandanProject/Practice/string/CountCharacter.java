package string;

import java.util.Scanner;

public class CountCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String.....");
		String str = sc.nextLine();
		int uc = 0, lc = 0, spc = 0, dc = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				uc++;
			} else if (ch >= 'a' && ch <= 'z') {
				lc++;
			} else if (ch >= '0' && ch <= '9') {
				dc++;
			} else
				spc++;

		}
		System.out.println("Capital latter = " + uc);
		System.out.println("Small latter = " + lc);
		System.out.println("Digits = " + dc);
		System.out.println("Special charater = " + spc);
	}

}
