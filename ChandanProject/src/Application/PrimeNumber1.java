package Application;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		boolean rs=isPrimeNumber(n);
		if(rs)
			System.out.println(n+" is a prime Number");
		else
			System.out.println(n+" is not a prime Number");
		}
	public static boolean isPrimeNumber(int p) {
		for(int i=2;i*i<=p;i++) {
			if(p%i==0)
				return false;
		}
		return true;
	}

}
