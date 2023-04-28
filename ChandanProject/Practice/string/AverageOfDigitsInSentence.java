package string;

import java.util.Scanner;

public class AverageOfDigitsInSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence........");
		String str = sc.nextLine();
		double avd = AverageOfDigits(str);
		System.out.println("Average of Digits:= " + avd);
	}

	public static double AverageOfDigits(String str) {
		char[] ch = str.toCharArray();
		double count = 0, sum = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= '0' && ch[i] <= '9') {
				sum = sum + (ch[i] - 48);
				count++;
			}
		}
		return sum / count;
	}

}
