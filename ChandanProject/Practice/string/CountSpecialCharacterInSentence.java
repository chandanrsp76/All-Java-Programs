package string;

import java.util.Scanner;

public class CountSpecialCharacterInSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence......");
		String str = sc.nextLine();
		int cspc = countSpecialCharacter(str);
		System.out.println(cspc);
	}

	public static int countSpecialCharacter(String str) {
		char[] ch = str.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z' || ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= '0' && ch[i] <= '9') {

			} else
				count++;
		}
		return count;
	}

}
