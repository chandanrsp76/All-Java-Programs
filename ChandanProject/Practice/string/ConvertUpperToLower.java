package string;

import java.util.Scanner;

public class ConvertUpperToLower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String........");
		String rs = "";
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				ch = (char) (ch + 32);
			rs = rs + ch;
		}
		System.out.println(rs);
	}
}
