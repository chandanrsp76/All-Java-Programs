package Arrayspro;

import java.util.Scanner;

public class AverageArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n=sc.nextInt();
	float[] ar=new float[n];
	System.out.println("enter "+n+" values");
	for (int i = 0; i < ar.length; i++) {
		ar[i]=sc.nextFloat();
	}
System.out.println("Average of Array "+findAverage(ar));	
	
}
private static float findAverage(float[] ar) {
	float sum=0;
	for (int i = 0; i <ar.length; i++) {
		sum=sum+ar[i];	
}
	return sum/ar.length;
}
}
