package string;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence.......");
		String str = sc.nextLine();
		revesrWord(str);
	}

	private static void revesrWord(String str) {
		String[] word = str.split(" ");
		for (int i = 0; i < word.length; i++) {
			String revw = revese(word[i]+" ");
			System.out.print(revw +"");
		}
	}

	private static String revese(String str) {
		char[] ch = str.toCharArray();
		int f = 0, l = ch.length - 1;
		while (f < l) {
			char temp = ch[f];
			ch[f] = ch[l];
			ch[l] = temp;
			f++;
			l--;
		}
		String str1 = new String(ch);
		return str1;
	}

}
