package string;

import java.util.Scanner;

public class FrequencyOfEachCharacterIrrespectiveOfAlphabate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence........");
		String str = sc.nextLine();
		int count[] = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				count[ch - 65]++;

			else if (ch >= 'a' && ch <= 'z')
				count[ch - 97]++;
		}
		System.out.println("Frequency of each character.");
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0)
				System.out.println((char) (i + 65) + "----->" + count[i]);
		}

	}

}
