package Arrayspro;

import java.util.Scanner;

public class ZigzagOrder {
	int[] readArray() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of an Array:-");
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.print("Enter "+n+" values:-");
		for (int i = 0; i < ar.length; i++) {
			  ar[i]=sc.nextInt();
		}
		return ar;
	   }
	void displayArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}
	int[] zigZagOrder(int[] a,int[] b) {
		int[] c=new int[a.length+b.length];
		int i=0,j=0;
		while(i<a.length&&i<b.length) {
			c[j]=a[i];
			j++;
			c[j]=b[i];
			j++;
			i++;
	    }
		while(i<a.length) {
			c[j]=a[i];
			j++;
			i++;
		}
		while(i<b.length) {
			c[j]=b[i];
			j++;
			i++;
		}
		return c;
		
	}
}