package Application;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int p=sc.nextInt();
		int count=0;
		for(int x=2;x<=p;x++) {
			int num=0;
			for(int i=2;i<x;i++) {
				if(x%i==0) {
					num++;
			}
			
		}
			if(num<1) {
				count++;
			}
	}
System.out.println(count);
	}
}
	