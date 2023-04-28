package Inheritance;

import java.util.Scanner;

public class MultiCatch {
public static void main(String[] args) {
	int[] a= {12,13,14,15,45};
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number:");
	int n=sc.nextInt();
	System.out.println("Dividing Array element by the number entered user:");
	try {
		for (int i = 0; i <= 5; i++) {
			System.out.println(a[i]/n);
		}
	}catch(ArrayIndexOutOfBoundsException ob) {
		System.out.println("Exception is occured");
	}
	catch(ArithmeticException obj) {
		System.out.println("Exception is occured");
	}
       finally{
		System.out.println("Hii");
	}
	System.out.println("Done");
	
}
}
