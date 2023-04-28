package Application;

import java.util.Scanner;

public class CountArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; i <= n; i++) {
			if (isArmStrongNumber(i))
				// System.out.println(i);
				count++;
		}
		System.out.println(count);

	}

	public static boolean isArmStrongNumber(int x) {
		int sum = 0, temp = x;
		while (x != 0) {
			int d = x % 10;
			sum = sum + power(d, count(temp));
			x = x / 10;
		}
		return sum == temp;
	}

	private static int power(int d, int p) {
		int prod = 1;
		while (p > 0) {
			prod = prod * d;
			p--;
		}
		return prod;
	}

	private static int count(int x) {
		int count = 0;
		do {
			x = x / 10;
			count++;
		} while (x != 0);
		return count;
	}

}
