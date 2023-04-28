package string;

public class FrequencyOfEachCharacter1 {

	public static void main(String[] args) {
		String str = "Chandan Prasad Automation Engineer";
		frequency(str);
	}

	private static void frequency(String str) {
		char[] ch = str.toCharArray();
		int count[] = new int[128];
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				count[ch[i] - 65]++;
			} else if (ch[i] >= 'a' && ch[i] <= 'z') {
				count[ch[i] - 97]++;
			}
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0)
				System.out.println((char)(i+65)+ "------>" + count[i]);
		}
	}

}
