package string;

public class FindOnlyDigits {

	public static void main(String[] args) {
		  String str="hii  102LObh12345 bye";
		  for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z') {
				
			}
			else if(ch==' ') {
				
			}
			else {
				System.out.print(ch);
			}
				
		}
	}

}
