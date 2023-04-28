
public class Rerverse {

	public static void main(String[] args) {
		String str = "Chandan";
		char[] ch = str.toCharArray();
		int i = 0, j = ch.length - 1;
		while (i < j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		String str1=new String(ch);
		System.out.println(str1);

	}

}
