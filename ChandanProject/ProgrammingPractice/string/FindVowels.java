package string;

import Arrayjava.CharacterArray;

public class FindVowels {

	public static void main(String[] args) {
		String str = "Chanden Prasad chainpur gopalganj";
		vowels(str);

	}

	public static void vowels(String str) {
		int vc =0,cc=0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
 
			vc++;

			}else {
				cc++;
			}

		}
		System.out.println("Number of vowels Latters:-"+vc);
		System.out.println("Number of consonent Latter:-"+cc);

	}

}
