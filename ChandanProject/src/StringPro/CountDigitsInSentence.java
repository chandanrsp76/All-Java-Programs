package StringPro;

import java.util.Scanner;

public class CountDigitsInSentence {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String sentence");
	String str=sc.nextLine();
	int ct=countDigit(str);
	System.out.println(""+ct);
}

 static int countDigit(String str) {
	char[] ch=str.toCharArray();
	int count=0, sum=0;
	for (int i = 0; i < ch.length; i++) {
		if(ch[i]>='0'&&ch[i]<='9')
			     count++;
	}
	return count;
}
}
