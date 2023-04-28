package string;

import java.util.Scanner;

public class ConvertLowerToUpper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String.......");
		String str = sc.nextLine();
		String rs="";
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z')
				ch=(char)(ch-32);
			rs=rs+ch;
		}
		System.out.println(rs);
	}

}
