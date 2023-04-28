package patterns;

import java.util.Scanner;

public class Pattern28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n :-");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int sp = 1; sp <= n - i; sp++) {
				System.out.print("  ");
			}
			int k = 1;

			for (int j = 1; j <= 2 * i - 1; j++) {
				if (j % 2 == 0)
					System.out.print("* ");
				else
					System.out.print(k++ + " ");

			}
			System.out.println();
		}
	}

}
