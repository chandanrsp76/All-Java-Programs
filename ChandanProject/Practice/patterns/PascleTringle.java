package patterns;

import java.util.Scanner;

public class PascleTringle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n :-");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int sp = 1; sp <= n - i; sp++) {
				System.out.print("  ");
			}
			int x = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(x + "   ");
				x = x * (i - j) / j;
			}
			System.out.println();
		}
	}

}
