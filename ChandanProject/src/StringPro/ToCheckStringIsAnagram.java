package StringPro;

import java.util.Scanner;

public class ToCheckStringIsAnagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st String.");
		String str1 = sc.nextLine();
		System.out.println("Enter the 2nd String.");
		String str2 = sc.nextLine();
		boolean rs = isAnagram(str1, str2);
		if (rs)
			System.out.println("String are Anagram.");
		else
			System.out.println("String are not Anagram.");
	}

	public static int[] countFrequency(String str) {
		int count[] = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				count[ch - 65]++;
			else if (ch >= 'a' && ch <= 'z')
				count[ch - 97]++;
		}
		return count;
	}

	public static boolean isAnagram(String str1, String str2) {
		int[] c1 = countFrequency(str1);
		int[] c2 = countFrequency(str2);
		for (int i = 0; i < 26; i++) {
			if (c1[i] != c2[i])
				return false;

		}

		return true;

	}
}
