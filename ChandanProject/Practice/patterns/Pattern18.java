package patterns;

import java.util.Scanner;
//5 4 3 2 1 
//  5 4 3 2 
//    5 4 3 
//      5 4 
//        5 

public class Pattern18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:-");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int sp = 1; sp <= i - 1; sp++) {
				System.out.print("  ");
			}
			for (int j = n; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
