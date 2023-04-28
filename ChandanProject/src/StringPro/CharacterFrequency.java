package StringPro;

import java.util.Scanner;

public class CharacterFrequency {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enetr the String.....");
	String str=sc.nextLine();
	int count[] =new int[128];
	for (int i = 0; i < str.length(); i++) {
		char ch=str.charAt(i);
		count[ch]++;
	}
	System.out.println("Frequency of each character=");
	for (int i = 0; i < count.length; i++) {
		if(count[i]!=0)
			System.out.println((char)i+"--->"+count[i]);
		
	}
}
}
