package patterns;

import java.util.Scanner;

public class Pattern24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n :-");
		int n = sc.nextInt();
		for (int i = 0; i < args.length; i++) {
			for (int sp = 0; sp < args.length; sp++) {
				System.out.print("  ");
			}
			for (int j = n; j >=2*i-1; j--) {
				System.out.println(j % 2 + " ");
			}
			System.out.println();
		}
	}

}
