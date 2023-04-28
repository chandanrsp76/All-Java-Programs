package string;

import java.util.Scanner;

public class SwapFirstToLast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence......");
		String str = sc.nextLine();
		String str1 = swapFirstToLast(str);
		System.out.println(str1);
	}

	private static String swapFirstToLast(String str) {
		char[] ch = str.toCharArray();
		
		int f = 0;
		for (int i = 0; i < ch.length; i++) {
			if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
				f = i;
			} else if (i == ch.length - 1 && ch[i] != ' ' || ch[i] != ' ' && ch[i + 1] == ' ') {
				char temp = ch[i];
				ch[i] = ch[f];
				ch[f] = temp;
			}

		}
		String str1 = new String(ch);
		return str1;
	}

}
