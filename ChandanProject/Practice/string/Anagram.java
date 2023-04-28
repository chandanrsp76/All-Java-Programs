package string;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence.......");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		boolean rs = isAnagram(str1, str2);
		if (rs) {
			System.out.println("Given String is Anagram.");
		} else {
			System.out.println("Given String is not Anagram.");
		}
	}

	public static boolean isAnagram(String str1, String str2) {
		int[] c1 = countFreq(str1);
		int[] c2 = countFreq(str2);
		for (int i = 0; i < 26; i++) {
			if (c1[i] != c2[i])
				return false;
		}
		return true;
	}

	public static int[] countFreq(String str1) {
		int count[] = new int[26];
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				count[ch - 65]++;
			} else if (ch >= 'a' && ch <= 'z') {
				count[ch - 97]++;
			}
		}
		return count;
	}
}
