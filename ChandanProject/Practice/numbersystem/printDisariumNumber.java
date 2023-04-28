package numbersystem;

import java.util.Scanner;

public class printDisariumNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:-");
		int x=sc.nextInt();
		//int count = 0;
		for (int i = 0; i <= x; i++) {
			if (printDisarium(i))
				
				 System.out.println(i+" ");
		
				//count++;
		}
		//System.out.println(count);

	}

	public static boolean printDisarium(int n) {
		int sum = 0, temp = n;
		while (n != 0) {
			int d = n % 10;
			int dc = count(n);
			sum = sum + power(d, dc);
			dc--;
			n = n / 10;
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

	public static int count(int n) {
		int count = 0;
		do {
			n = n / 10;
			count++;
		} while (n != 0);
		return count;
	}

}
