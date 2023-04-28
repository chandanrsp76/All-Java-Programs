package Application;

import java.util.Scanner;

public class NaturalNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  the Natural Number ");
		int num=sc.nextInt();
		int nat=getNatural(num);
		System.out.println("Sum of first Natural Number sum is:"+nat);
	}
		public static int getNatural(int n) {
			int sum=0;
					for(int i=0;i<=n;i++) {
						sum=sum+i;
					}
					return sum;
		}
	}


