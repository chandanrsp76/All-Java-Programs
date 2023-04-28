package string;

public class FrequencyOfEacharacter1 {

	public static void main(String[] args) {
		String str = "Chandan Prasad is Automation test Engineer";
		frequencyOfEachCharacter(str);
	}

	private static void frequencyOfEachCharacter(String str) {

		int count[] = new int[26];
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] >= 'a' && ch[i] <= 'z') {
				count[ch[i] - 97]++;
			} else if (ch[i] >= 'A' && ch[i] <= 'Z') {
				count[ch[i] - 65]++;
			}

		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0)
				System.out.println((char) (i + 65) + "----->" + count[i]);
		}

	}

}
