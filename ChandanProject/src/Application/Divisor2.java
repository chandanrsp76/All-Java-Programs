package Application;

import java.util.Scanner;

public class Divisor2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value of n:");
		int n=sc.nextInt();
		printDivisor(n);
		}
public static void printDivisor(int n) {
	for(int i=1;i<n/2;i++) {
		if(n%i==0) {
			System.out.print(i+" ");
			System.out.print(n/i+" ");
		}
	}
	
}
}
