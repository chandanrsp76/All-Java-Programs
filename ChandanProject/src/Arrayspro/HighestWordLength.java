package Arrayspro;

import java.util.Scanner;

public class HighestWordLength {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter how many word you have:-");
	int n=sc.nextInt();
	String[] words=new String[n];
	System.out.println("Enter "+n+" words");
	for (int i = 0; i < words.length; i++) {
		words[i]=sc.next();
	}
	String hw=highestLength(words);
	System.out.println("highest Length of the word:-"+hw);
}

 static String highestLength(String[] w) {
	String h=w[0];
	for (int i = 1; i < w.length; i++) {
		if(w[i].length()>h.length())
		h=w[i];
	}
	return h;
}

}
