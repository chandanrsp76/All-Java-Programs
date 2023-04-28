package Arrayspro;

import java.util.Scanner;

public class SearchElement {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.err.println("Enter the size of the Array:-");
	int n=sc.nextInt();
	int[] ar=new int[n];
	System.err.println("Enter "+n+" values");
	for (int i = 0; i < ar.length; i++) {
		ar[i]=sc.nextInt();
	}
	System.err.println("Enter the element too search:-");
	int ele=sc.nextInt();
	int in=search(ar,ele);
	if(in==-1)
		System.err.println("Enterd element is not present in the give array");
	else 
		System.err.println("element is present at index number:-"+in);
}

private static int search(int[] ar, int ele) {
	for (int i = 0; i < ar.length; i++) {
		if (ar[i]==ele)
			return i;
	}
	return -1;
}
}
