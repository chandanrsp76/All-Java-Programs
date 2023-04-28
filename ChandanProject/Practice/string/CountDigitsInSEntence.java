package string;

import java.util.Scanner;

public class CountDigitsInSEntence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String........");
		String str = sc.nextLine();
		int cd = countDigits(str);
		System.out.println("Present digits in sentence:= "+cd);
	}

	public static int countDigits(String str) {
		char[] ch = str.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
				if (ch[i] >= '0' && ch[i] <= '9')
					count++;
			}
		return count;
	}

}
