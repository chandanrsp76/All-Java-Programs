package string;

import java.util.Scanner;

public class EveryLastCharaterCapital {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence.....");
		String str = sc.nextLine();
		String str1 = lastCaps(str);
		System.out.println(str1);
	}

	public static String lastCaps(String str) {
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i == ch.length - 1 && ch[i] != ' ' || ch[i] != ' ' && ch[i + 1] == ' ') {
				if (ch[i] >= 'a' && ch[i] <= 'z') {
					ch[i] = (char) (ch[i] - 32);
				} else if (ch[i] >= 'A' && ch[i] <= 'Z') {
					ch[i] = (char) (ch[i] + 32);
				}
			}
		}
		String str1 = new String(ch);
		return str1;
	}

}
