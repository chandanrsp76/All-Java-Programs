package string;

import java.util.Scanner;

public class ConvertNumberToWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enterd the Amount.");
		int amt = sc.nextInt();
		nw(amt / 10000000, "Crore");
		nw(amt / 100000 % 100, "Lakh");
		nw(amt / 1000 % 100, "Thousand");
		nw(amt / 100 % 10, "Hundred");
		nw(amt % 100, "");
	}

	public static void nw(int n, String st) {
		String[] x = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String[] y = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };
		if (n < 20) {
			System.out.print(x[n]);
		} else {
			System.out.print(y[n / 10] + x[n % 10]);
		}
		if (n != 0)
			System.out.print(st + " ");

	}

}
