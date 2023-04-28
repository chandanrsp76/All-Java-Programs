package Application;

import java.util.Scanner;

public class MainSpecial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		boolean rs=isSpecial(n);
		if(rs)
			System.out.println(n+ " is a special two digit Number");
		else 
			System.out.println(n+ " is not a special two digit Number");
		}
	public static boolean isSpecial(int p) {
		int d1=p/10;
		int d2=p%10;
		int sum=d1+d2+d1*d2;
		return sum==p;
		
		
	}

}
