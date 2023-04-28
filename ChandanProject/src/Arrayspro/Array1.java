package Arrayspro;

import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enterd how many words you have ");
		int n = sc.nextInt();
		String[] words = new String[n];
		System.out.println("Enter " + n + " words");
		for (int i = 0; i < words.length; i++) {
			words[i] = sc.next();
		}
		String hw = highestLength(words);
		System.out.println("highest length of the word:- " + hw);
	}

	static String highestLength(String[] w) {
		String h = w[0];
		for (int i = 1; i < w.length; i++) {
			if (w[i].length() > h.length())
				h = w[i];
		}
		return h;
	}

}
