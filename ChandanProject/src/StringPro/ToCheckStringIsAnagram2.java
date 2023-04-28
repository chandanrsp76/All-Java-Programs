package StringPro;

import java.util.Arrays;
import java.util.Scanner;

public class ToCheckStringIsAnagram2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.err.println("Enter the 1st String.");
   String str1=sc.nextLine();
   System.err.println("Enter the 2nd string.");
   String str2=sc.nextLine();
   boolean rs=isAnagram(str1,str2);
   if(rs) 
	   System.out.println("String are Anagram.");
   else
	   System.out.println("String are not Anagram.");
}

private static boolean isAnagram(String str1, String str2) {
	str1=str1.replaceAll(" ","");
	str2=str2.replaceAll(" ", "");
	if(str1.length()!=str2.length())
		return false;
	str1=str1.toLowerCase();
	str2=str2.toLowerCase();
	char[] c1=str1.toCharArray();
	char[] c2=str2.toCharArray();
	Arrays.sort(c1);
	Arrays.sort(c2);
	
	
	return Arrays.equals(c1, c2);
}
}
