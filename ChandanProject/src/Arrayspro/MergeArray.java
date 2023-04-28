package Arrayspro;

import java.util.Scanner;

public class MergeArray {
	int[] readArray() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Size of the Array");
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter "+n+" value");
	    for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
		}
	    return ar;
	}
	void displayArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]+" ");
		}
	}
	int[] zigZagOrder(int[] a, int[] b) {
		int[] c=new int[a.length+b.length];
		for (int i = 0; i < a.length; i++) {
			c[i]=a[i];
		}
		for (int i = 0; i < b.length; i++) {
		     c[a.length+i]=b[i];	
		}
		return c;
	}
}
	

