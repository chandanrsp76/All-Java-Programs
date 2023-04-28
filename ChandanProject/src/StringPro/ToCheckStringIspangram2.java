package StringPro;

import java.util.Scanner;

public class ToCheckStringIspangram2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String.....");
		String str = sc.nextLine();
		boolean rs = isPangram(str);
		if (rs)
			System.out.println("String are Pangram.");
		else
			System.out.println("Enter String are not Pangram.");
	}
	private static boolean isPangram(String str) {
		if (str.length() < 26)
			return false;
		str = str.toLowerCase();
		for (char ch = 'a'; ch < 'z'; ch++) {
			if (str.indexOf(ch) == -1)
				return false;
		}
		return true;
	}
}
