package Application;

import java.util.Scanner;

public class PerfectNumber3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range");
		int n=sc.nextInt();
		for(int v=1;v<=n;v++) {
			boolean rs=isPerfectNumber(v);
		if(rs)
			System.out.println(v+" is perfect Number");
		}
	}
	public static boolean isPerfectNumber(int x) {
		int sum=0;
		for(int i=1;i<=x/2;i++) {
			if(x%i==0) {
				sum=sum+i;
			}
		}
		return sum==x;	
	}
		
	}


