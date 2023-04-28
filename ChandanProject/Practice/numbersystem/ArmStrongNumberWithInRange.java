package numbersystem;

import java.util.Scanner;

public class ArmStrongNumberWithInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:-");
		int n = sc.nextInt();
		// int count=0;
		for (int i = 0; i <= n; i++) {
			if (printArmStrongNumber(i))
				System.out.println(i);
			// count++;
		}
		// System.out.println(count);

	}

	public static boolean printArmStrongNumber(int x) {
		int sum = 0, temp = x;
		while (x != 0) {
			int d = x % 10;
			sum = sum + power(d, count(temp));
			x = x / 10;
		}
		return sum == temp;
	}

	private static int power(int n, int p) {
		int prod = 1;
		while (p > 0) {
			prod = prod * n;
			p--;
		}
		return prod;
	}

	private static int count(int n) {
		int count = 0;
		do {
			n = n / 10;
			count++;
		} while (n != 0);
		return count;
	}

}
