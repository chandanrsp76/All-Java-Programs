package patterns;


import java.util.Scanner;
//        5 
//      4 5 
//    3 4 5 
//  2 3 4 5 
//1 2 3 4 5 
public class Pattern21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:-");
		int n = sc.nextInt();
		for (int i = n; i >= 1; i--) {
			for (int sp = 1; sp<= i- 1; sp++) {
				System.out.print("  ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
