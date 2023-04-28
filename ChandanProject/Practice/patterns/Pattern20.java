package patterns;

import java.util.Scanner;

//        A 
//      A B 
//    A B C 
//  A B C D 
//A B C D E 
public class Pattern20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:-");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int sp = 1; sp <= n - i; sp++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (j + 64) + " ");
			}
			System.out.println();
		}
	}

}
