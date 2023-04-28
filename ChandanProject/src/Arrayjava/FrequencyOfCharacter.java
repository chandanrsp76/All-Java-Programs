package Arrayjava;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		String str = "Chandan prasad chandanrsp76@gmail.com";
		frequency(str);
	}

	private static void frequency(String str) {
		char[] ch = str.toCharArray();
		boolean[] b = new boolean[str.length()];
		for (int i = 0; i < ch.length; i++) {
			if (b[i] == false) {
				int count = 1;
				for (int j = i + 1; j < ch.length; j++) {
					if (ch[i] == ch[j]) {
						count++;
						b[i] = true;
					}
				}
				if (count != 0)

					if (ch[i] != ' ')

						System.out.println(ch[i] + "------->" + count);

			}
		}
	}

}
