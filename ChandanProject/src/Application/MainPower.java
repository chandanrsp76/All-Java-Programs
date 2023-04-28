package Application;

import java.util.Scanner;

public class MainPower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		System.out.println("Enter the power");
		int p=sc.nextInt();
		int pw=power(n,p);
		System.out.println(pw);

	}
	public static int power(int a,int p) {
		int prod=1;
		while(p>0) {
			prod=prod*a;
			p--;
		}
		return prod;
	}

}
