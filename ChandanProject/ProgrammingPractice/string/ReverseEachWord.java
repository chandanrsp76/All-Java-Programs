package string;

public class ReverseEachWord {
	public static void main(String[] args) {
		String str = "Chandan Kumar Automation Engineer ";

		revWord(str);
	}

	private static void revWord(String str) {
		String[] word = str.split(" ");
		for (int i = 0; i < word.length; i++) {
			String str2 = reverse(word[i]);
			System.out.print(str2 + " ");
		}
	}

	private static String reverse(String str1) {
		char[] ch = str1.toCharArray();
		int i = 0, j = ch.length - 1;
		while (i < j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;

		}
		String str2 = new String(ch);
		return str2;
	}
}