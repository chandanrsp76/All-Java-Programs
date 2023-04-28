package patterns;

import java.util.Scanner;
//1 2 3 4 5 4 3 2 1 
//2 3 4 5 4 3 2 
//  3 4 5 4 3 
//    4 5 4 
//      5 

public class Pattern30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n :-");
		int n = sc.nextInt();
		for (int i = n; i >= 1; i--) {

			for (int sp = 1; sp <= n - i; sp++) {
				System.out.print("  ");
			}
			int x = n - i + 1;
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(x + " ");
				if (j < i)
					x++;
				else
					x--;
			}
			System.out.println();
		}
	}

}
