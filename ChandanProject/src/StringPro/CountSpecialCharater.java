package StringPro;

import java.util.Scanner;

public class CountSpecialCharater {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String with Special Character");
	String str=sc.nextLine();
	int ct=CountSpecialchar(str);
			System.out.println("Special character at="+ct);
}

    static int CountSpecialchar(String str) {
	char[] ch=str.toCharArray();
	int spc=0;
	for (int i = 0; i < ch.length; i++) {
		int a=ch[i];
		if(a<48||a>57&&a<65||a>91&&a<97||a>122)
	    spc++;
	}
	return spc;
}

}