import java.util.Scanner;

public class CheckAnagram {

	public static void main(String[] args) {
    String str="hitler woman";
    String str1="Mother in law";
   if( isAnagram(str,str1))
    System.out.println(str+" is Anagram of "+str1);
   else
	   System.out.println(str+" is not Anagram of "+str1);  
	}

	public static boolean isAnagram(String str, String str1) {
		int c1[]=countFreq(str);
		int c2[]=countFreq(str1);
		for (int i = 0; i < c2.length; i++) {
			if(c1[i]!=c2[i])
				return false;
		}
		return true;
	}

	private static int[] countFreq(String str) {
        int count[]=new int[26];
       for (int i = 0; i < str.length(); i++) {
		char ch=str.charAt(i);
		if(ch>='a'&&ch<='z') {
			count[ch-97]++;
		}
		else if(ch>='A'&&ch<='Z') {
			count[ch-65]++;
		}
		
	}
       return count;

       
	}

}
