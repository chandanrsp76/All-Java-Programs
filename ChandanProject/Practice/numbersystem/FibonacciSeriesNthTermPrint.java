package numbersystem;

import java.util.Scanner;

public class FibonacciSeriesNthTermPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the term:-");
		int n=sc.nextInt();
		int a=0,b=1;
		while(n>1) {
			int c=a+b;
			a=b;
			b=c;
			n--;
		}
		System.out.print(a+"");
	}
}
