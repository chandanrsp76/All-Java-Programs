package string;

public class ReverseEachWords {

	public static void main(String[] args) {
		String str = "Chandan Prasad is Automation Test Engineer";
		reverseTheWord(str);
	}

	private static void reverseTheWord(String str) {
		String[] word = str.split(" ");
		for (int i = 0; i < word.length; i++) {
			String str1 = reverse(word[i]);
			System.out.print(str1 + " ");
		}
	}

	private static String reverse(String str) {
		char[] ch = str.toCharArray();
		int i = 0, j = ch.length - 1;
		while (i < j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		String str1 = new String(ch);
		return str1;
	}
}
