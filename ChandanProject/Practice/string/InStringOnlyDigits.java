package string;

public class InStringOnlyDigits {

	public static void main(String[] args) {
		String str = "chandan@ 12Kumar12 H&M";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z' || ch[i] >= 'a' && ch[i] <= 'z' || 
   ch[i] == ' '|| ch[i] < 48|| ch[i] > 57 && ch[i] < 65 || ch[i] > 91 && ch[i] < 97 || ch[i] > 122);
				

			else
				System.out.print(ch[i]);
		}
	}

}
