package StringPro;

import java.util.Scanner;

public class AverageDigitsInSentence {
	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
     System.out.println("Enter the String Sentence");
     String str=sc.nextLine();
     float ct=avarageSumOfDigits(str);
     System.out.println("Avarge Sum of Digits="+ct);
	}

	 static float avarageSumOfDigits(String str) {
		char[] ch=str.toCharArray();
		float sum=0,count=0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='0'&&ch[i]<='9') {
				sum=sum+(ch[i]-48);
			count++;
			}
		}
		return sum/count;
	}
}
