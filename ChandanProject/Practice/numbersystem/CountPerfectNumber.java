package numbersystem;

import java.util.Scanner;

public class CountPerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start range:-");
		int n1 = sc.nextInt();
		System.out.println("Enter the end range:-");
		int n2=sc.nextInt();
		int ct = countPerfect(n1,n2);
		System.out.println("Total perfect Number: " + ct);
	}

	public static int countPerfect(int range1,int range2) {
		int count = 0;
		for (int x = range1; x <= range2; x++) {
			int sum = 0;
			for (int i = 1; i <= x / 2; i++) {
				if (x % i == 0)
					sum = sum + i;
			}
			if (sum == x)
				count++;
		}
		return count;
	}
}
