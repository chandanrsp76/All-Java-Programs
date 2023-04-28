package string;

public class StringPalinDrome {

	public static void main(String[] args) {
		String str = "Madam";
		if (isPalindrome(str)) {
			System.out.println(str + " is a Palindrome String.");
		} else {
			System.out.println(str + " is not a PalinDrome String");
		}
	}

	private static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;

			}
			i++;
			j--;
		}
		return true;
	}

}
