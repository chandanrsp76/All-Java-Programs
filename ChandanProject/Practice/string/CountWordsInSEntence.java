package string;

import java.util.Scanner;

public class CountWordsInSEntence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence..........");
		String str = sc.nextLine();
		int cc = countCharacter(str);
		System.out.println("Character present in a sentence:=" + cc);
	}

	public static int countCharacter(String str) {
		char[] ch = str.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z' || ch[i] >= 'a' && ch[i] <= 'z')
				count++;
		}
		return count;
	}

}
