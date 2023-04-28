package patterns;

import java.util.Scanner;
//        A 
//      B A B 
//    C B A B C 
//  D C B A B C D 
//E D C B A B C D E 

public class Pattern29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n :-");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int sp = 1; sp <= n - i; sp++) {
				System.out.print("  ");
			}
			int x = i;
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print((char) (x + 64) + " ");
				if (j < i)
					x--;
				else
					x++;
			}
			System.out.println();
		}
	}

}
