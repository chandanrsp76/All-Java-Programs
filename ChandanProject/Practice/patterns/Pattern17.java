package patterns;

import java.util.Scanner;

//* * * * * * * * * 
//  * * * * * * * 
//    * * * * * 
//      * * * 
//        * 
public class Pattern17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:-");
		int n = sc.nextInt();
		for (int i = n; i >= 1; i--) {
			for (int sp = i; sp < n; sp++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

}
