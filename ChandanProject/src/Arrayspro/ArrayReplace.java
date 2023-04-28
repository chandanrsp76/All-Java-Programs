package Arrayspro;

import java.util.Scanner;
public class ArrayReplace {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Size of an Array:-");
	int n=sc.nextInt();
	System.out.print("Enter "+n+" values:-");
	int[] ar=new int[n];
	for (int i = 0; i < ar.length; i++) {
		ar[i]=sc.nextInt();
	}
			update(ar);
			System.out.println("Sum of every elements:-");
	for (int i = 0; i < ar.length; i++) {
		
		System.out.print(ar[i]+" ");
	}
}

private static void update(int[] ar) {
	 for (int i = 0; i < ar.length; i++) {
		int n= ar[i],sum=0;
		do {
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}while(n!=0);
	     ar[i]=sum;
	}
}
}
