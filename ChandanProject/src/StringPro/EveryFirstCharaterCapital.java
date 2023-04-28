package StringPro;

import java.util.Scanner;

public class EveryFirstCharaterCapital {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String str=sc.nextLine();
		String st=initCaps(str);
		System.out.println(st);
	}

	 static String initCaps(String str) {
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				if(ch[i]>='a'&&ch[i]<='z')
					ch[i]=(char)(ch[i]-32);
			}
			else if(ch[i]>='A'&&ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+32);
			}
		
		}
		str=new String(ch);
		return str;
	 }
}
