package patterns;

import java.util.Scanner;
//*     *     * 
//  *   *   *   
//    * * *     
//* * * * * * * 
//    * * *     
//  *   *   *   
//*     *     * 

public class Pattern42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n :-");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == n / 2 + 1 || i == n / 2 + 1 || j == i || i + j == n + 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
