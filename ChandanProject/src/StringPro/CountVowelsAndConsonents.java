package StringPro;

import java.util.Scanner;

public class CountVowelsAndConsonents {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String...");
	String str=sc.nextLine();
	int vc=0,cc=0;
	for (int i = 0; i < str.length(); i++) {
		char ch=str.charAt(i);
		if(ch>='A'&& ch<='Z'||ch>='a'&&ch<='z') {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
              vc++;
			else
				cc++;
		}
		
	}
	System.out.println("Number of vowels:-"+vc);
	System.out.println("Number of consonents:-"+cc);
}
}
