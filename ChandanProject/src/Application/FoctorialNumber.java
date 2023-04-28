package Application;

import java.util.Scanner;

public class FoctorialNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int fc=getFact(num);
		System.out.println(fc);
	}
		public static int getFact(int n) {
		int fact =1;
		for(int i=2;i<=n;i++) {
			fact=fact*i;
		}
		return fact; 
			
		}
			
				

	}


