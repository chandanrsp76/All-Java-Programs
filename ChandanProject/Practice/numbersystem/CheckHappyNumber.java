package numbersystem;

import java.util.Scanner;

public class CheckHappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number.");
		int x = sc.nextInt();
		if (isHappy(x)) {
			System.out.println(x + " is a Happy Number.");
		} else
			System.out.println(x + " is not a Happy Number.");
	}

	public static boolean isHappy(int n) {
		while (n > 9) {
			int sum = 0;
			do {
				int d = n % 10;
				sum = sum + d * d;
				n = n / 10;
			} while (n != 0);
			n = sum;

		}
		return n == 1 || n == 7;
	}

}
