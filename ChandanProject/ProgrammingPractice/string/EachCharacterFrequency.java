package string;

public class EachCharacterFrequency {

	public static void main(String[] args) {
		String str = "Chandan kumar";
		frequency(str);

	}

	private static void frequency(String str) {
		char[] ch = str.toCharArray();
		boolean[] b = new boolean[ch.length];
		for (int i = 0; i < ch.length; i++) {
			if (b[i] == false) {
				int count = 1;
				for (int j = i+1; j < ch.length; j++) {
					if (ch[i] == ch[j]) {
						count++;
						b[i] = true;
					}
				}
				if (count != 0) {
					System.out.println(ch[i] + "---->" + count);
				}
			}
		}
	}

}
