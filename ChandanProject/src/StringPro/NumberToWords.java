package StringPro;

import java.util.Scanner;

public class NumberToWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount");
		int amt = sc.nextInt();
		nw(amt / 10000000 % 100, "crore");
		nw(amt / 100000 % 100, "lakh");
		nw(amt / 1000 % 10, "thounsand");
		nw(amt % 100, "");

	}

	private static void nw(int n, String st) {
		String[] x = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "forteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String[] y = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninty" };
		if (n < 20)
			System.out.print(x[n]);
		else
			System.out.print(y[n / 10] + x[n % 10]);
		if(n!=0)
			System.out.print(st+" ");
	}
}
