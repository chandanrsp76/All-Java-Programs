package patterns;

import java.util.Scanner;

//1 0 1 0 1 
//1 0 1 0 1 
//1 0 1 0 1 
//1 0 1 0 1 
//1 0 1 0 1 
public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of n");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j % 2 + " ");
			}
			System.out.println();
		}
	}

}
