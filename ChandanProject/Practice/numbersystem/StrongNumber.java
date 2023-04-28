package numbersystem;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:-");
		int n = sc.nextInt();
		if (isStrong(n))
			System.out.println(n + " is Strong Number.");
		else
			System.out.println(n + " is not Strong Number.");
	}

	private static boolean isStrong(int x) {
		int sum = 0, temp = x;
		do {
			int d = x % 10;
			sum = sum + fact(d);
			x = x / 10;
		} while (x != 0);
		return sum == temp;
	}

	private static int fact(int d) {
		if (d == 0)
			return 1;
		else
			return d * fact(d - 1);
	}

}
