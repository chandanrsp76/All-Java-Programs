package string;

public class ReverseEachCharacter {

	public static void main(String[] args) {
		String str = "A quick brown fox jumps over the lazy Dog";
		revWord(str);
	}

	private static void revWord(String str) {
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			String str2=reverse(words[i]);
			System.out.print(str2+" ");
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
		String str2=new String(ch);
		return str2;
	}

}
