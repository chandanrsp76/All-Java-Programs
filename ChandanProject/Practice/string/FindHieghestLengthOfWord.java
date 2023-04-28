package string;

import java.util.Scanner;

public class FindHieghestLengthOfWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many word you have:-");
		int n = sc.nextInt();
		String[] word = new String[n];
		System.out.println(" Enter " + n + " words");
		for (int i = 0; i < word.length; i++) {
			word[i] = sc.nextLine();
		}
		String hw=highestLength(word);
		System.out.println(hw);

	}

	private static String highestLength(String[] w) {
         String h=w[0]	;
         for (int i = 0; i < w.length; i++) {
			if(w[i].length()>h.length())
				h=w[i];
		}
         return h;
	}

}
