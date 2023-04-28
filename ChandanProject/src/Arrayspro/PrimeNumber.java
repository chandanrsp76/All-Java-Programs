package Arrayspro;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n=sc.nextInt();
	int[] ar=new int[n];
	System.out.println("enter "+n+" values");
	for (int i = 0; i < ar.length; i++) {
		ar[i]=sc.nextInt();
	}
	int count=0;
	for (int i = 0; i < ar.length; i++) {	
	if(isPrime(ar[i]))
		count++;
	}
	System.out.print("number of prime:-"+count);
} 

private static boolean isPrime(int ar) {
	for (int i = 2; i <ar; i++) {
		if(ar%i==0)
		return false;
	}
	return true;
	
}
}
