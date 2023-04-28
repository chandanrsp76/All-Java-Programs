 package numbersystem;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number.");
	int n=sc.nextInt();
		if(isArmStrong(n))
			System.out.println(n+" is a ArmStrong Number.");
		else
			System.out.println(n+" is not ArmStrong Number.");
	}

	public static boolean isArmStrong(int x) {
		int sum = 0, temp = x;
		while (x != 0) {
			int d = x % 10;
			sum = sum + power(d, count(temp));
			x = x / 10;
		}
		return sum == temp;
	}

	private static int count(int temp) {
		int count = 0;
		do {
			temp = temp / 10;
			count++;
		} while (temp != 0);
		return count;
	}

	public static int power(int n, int p) {
		int prod = 1;
		while (p > 0) {
			prod = prod * n;
			p--;
		}
		return prod;
	}

}
