package StringPro;

import java.util.Scanner;

public class CountWordsInSentence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String...");
		String str=sc.nextLine();
		int wc=countWords(str);
		System.out.println("Total words prensnt in the sentence="+wc);
	}

	private static int countWords(String str) {
	   char ch[]=str.toCharArray();
	   int count=0;
	   for (int i = 0; i < ch.length; i++) {
		if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			count++;
	}
		return count;
	}

	
	

}
