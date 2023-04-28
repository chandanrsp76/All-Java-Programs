package Arrayjava;

public class FrequencyOfEachCharacterAlphabate {

	public static void main(String[] args) {
		String str = "Chandan Kumar";
		frequency(str);
	}

	private static void frequency(String str1) {
		int count[] = new int[26];
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			if (ch >= 'a' && ch <= 'z')
				count[ch - 97]++;
			else if (ch >= 'A' && ch <= 'Z')
				count[ch - 65]++;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0)
				System.out.println((char) (i + 65) + "---> "+count[i]);
		}
	}
}
