package Arrayjava;

public class StringPalindrome {

	public static void main(String[] args) {
		String str = "madaM";
		boolean rs=isPalindrome(str);
	if(rs) {
		System.out.println(str+" is Palindrome String");
	}else {
		System.out.println(str+" is not Palindrome String");
	}
		
	}

	public static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;

		}

		return true;
	}

}
