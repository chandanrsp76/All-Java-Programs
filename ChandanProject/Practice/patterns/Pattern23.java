package patterns;

import java.util.Scanner;
//        1 
//      1 0 1 
//    1 0 1 0 1 
//  1 0 1 0 1 0 1 
//1 0 1 0 1 0 1 0 1 

public class Pattern23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n :-");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int sp = 1; sp <= n - i; sp++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(j % 2 + " ");
			}
			System.out.println();
		}
	}

}
