package patterns;

import java.util.Scanner;
//1 2 3 4 5 
//  2 3 4 5 
//    3 4 5 
//      4 5 
//        5 
public class Pattern16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:-");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int sp =1; sp <= i-1; sp++) {
				System.out.print("  ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
