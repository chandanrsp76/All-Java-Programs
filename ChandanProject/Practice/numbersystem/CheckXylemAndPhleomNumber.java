package numbersystem;

import java.util.Scanner;

public class CheckXylemAndPhleomNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number.");
		int x = sc.nextInt();
		if (isXylemOrPhleom(x))
			System.out.println(x + " is a Xylem Number.");
		else
			System.out.println(x + " is a phleom Number");
	}

	public static boolean isXylemOrPhleom(int n) {
		int d = n % 10;
		n = n / 10;
		int mid = 0;
		while (n > 9) {
			int dc = n % 10;
			mid = mid + dc;
			n = n / 10;
		}
		int end = n + d;
		return end == mid;
	}

}
