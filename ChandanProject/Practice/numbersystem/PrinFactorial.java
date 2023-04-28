package numbersystem;

import java.util.Scanner;

public class PrinFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number.");
		int n = sc.nextInt();
		printFact(n);
	}
	private static void printFact(int n) {
		int prod = 1;
		while (n > 0) {
			prod = prod * n;
			n--;
		}
		System.out.println(prod);
	}

}
