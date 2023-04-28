package Application;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value:");
		int n=sc.nextInt();
		boolean rs=isPerfectNumber(n);
		if(rs) 
			System.out.println(n+" is a perfect Number");
		else
			System.out.println(n+" is not a perfect Number");
	}
	public static boolean isPerfectNumber(int a) {
		int sum=0;
		for(int i=1;i<=a/2;i++) {
			if(a%i==0) {
				sum=sum+i;
				}
			}
		return sum==a;
	}

}
