package patterns;

import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n :-");
		int n = sc.nextInt();
		int t = n, x = n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < n * 2; j++) {
				if (j <= x)
					System.out.print("* ");
				else if (j >= t)
					System.out.print("* ");
				else
					System.out.print("  ");

			}
			t++;
			x--;
			System.out.println();
		}
	}

}
