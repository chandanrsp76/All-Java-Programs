package string;

import java.util.Scanner;

public class PangramWithInbuiltMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence..........");
		String str = sc.nextLine();
		boolean rs = isPangram(str);
		if (rs) {
			System.out.println("Given String is a Panagram.");
		} else {
			System.out.println("Given String is not  a Panagram.");
		}

	}

	private static boolean isPangram(String str) {
		if (str.length() <= 26) {
			return false;
		}
		str = str.toLowerCase();
		for (int ch = 'a'; ch <= 'z'; ch++) {
			if (str.indexOf(ch) == -1)
				return false;
		}
		return true;
	}
}
