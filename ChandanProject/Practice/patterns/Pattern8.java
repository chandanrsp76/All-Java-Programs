package patterns;

import java.util.Scanner;

//A 
//B B 
//C C C 
//D D D D 
//E E E E E 
public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:-");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (i + 64) + " ");
			}
			System.out.println();
		}
	}

}
