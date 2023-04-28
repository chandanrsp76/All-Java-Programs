package patterns;

import java.util.Scanner;
//C 
//C H 
//C H A 
//C H A N 
//C H A N D 
//C H A N D A 
//C H A N D A N 
public class Pattern11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String Values.");
		String str = sc.nextLine();
		int n = str.length();
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(str.charAt(j) + " ");
			}
			System.out.println();
		}
	}

}
