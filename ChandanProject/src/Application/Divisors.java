package Application;

import java.util.Scanner;

public class Divisors {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value of n: ");
	int n=sc.nextInt();
	long start=System.nanoTime();
	printDivisors(n);
	long end =System.nanoTime();
	System.out.println("time taken "+(end-start));
	}
	public static void printDivisors(int n) {
		for (int i=1;i*i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+"  ");
				System.out.print(n/i+" ");
		}
		}
	
		

}
}

