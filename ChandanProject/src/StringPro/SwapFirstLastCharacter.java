package StringPro;

import java.util.Scanner;

public class SwapFirstLastCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String......");
		String str = sc.nextLine();
		String st = swapFLChar(str);
		System.out.println(st);
	}

	private static String swapFLChar(String str) {
		char[] ch=str.toCharArray();//chandan kumar
		int f=0;
		for (int i = 0; i < ch.length; i++) {
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				f=i;
			}
			else if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' ' &&ch[i+1]==' ')
			{
				char t=ch[i];
				ch[i]=ch[f];
				ch[f]=t;
			}
		}
		        str=new String(ch);
		return str;
}
}