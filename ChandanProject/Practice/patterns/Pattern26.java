package patterns;

import java.util.Scanner;
//        1 
//      1 2 1 
//    1 2 3 2 1 
//  1 2 3 4 3 2 1 
//1 2 3 4 5 4 3 2 1 

public class Pattern26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n :-");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int sp = 1; sp <= n - i; sp++) {
				System.out.print("  ");
			}
			int x = 1;
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
