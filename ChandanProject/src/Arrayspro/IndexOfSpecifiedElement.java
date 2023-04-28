package Arrayspro;

import java.util.Scanner;

public class IndexOfSpecifiedElement {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of an Array");
	int n=sc.nextInt();
	int[] ar=new int[n];
	System.out.println("Enter "+n+" value");
	for (int i = 0; i < ar.length; i++) {
		ar[i]=sc.nextInt();
	}
	System.out.println("Enter the element too search ");
	int ele=sc.nextInt();
	int in=search(ar,ele);
	if(in==-1)
	System.out.println("Element is Not present");
	else
		System.out.println("present at"+in);
}
     static int search(int[] ar, int ele) {
	 for (int i = 0; i < ar.length; i++) {
		if(ar[i]==ele)
			return i;
	}
	return -1;
}
 
}