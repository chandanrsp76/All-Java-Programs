package StringPro;

import java.util.Scanner;

public class StringIntoArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String....");
	String str=sc.nextLine();
	
	char ch[]=str.toCharArray();
	int uc=0,lc=0,dc=0,spc=0;
	for (int i = 0; i < ch.length; i++) {
		if(ch[i]>='A'&& ch[i]<='Z')
			uc++;
		 else if(ch[i]>='a'&& ch[i]<='z')
		     lc++;
		else if(ch[i]>='0'&& ch[i]<='9')
		     dc++;
		else
			spc++;
	}
	System.out.println("Number of Capital later:-"+uc);
	System.out.println("Number of Small later:-"+lc);
	System.out.println("Number of digits:-"+dc);
	System.out.println("Number of Special charecter:-"+spc);
}
}
