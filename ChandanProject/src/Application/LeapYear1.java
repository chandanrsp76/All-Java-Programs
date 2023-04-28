package Application;

import java.util.Scanner;

public class LeapYear1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year ");
		int a=sc.nextInt();
		boolean b=leapYear(a);
		if(b==true)
		System.out.println(a+"  is a leap year");
		else
			System.out.println(a+"  is not a leap year");
	}
		static boolean leapYear(int year) {
		if((year%4==0 && year%100!=0)||(year%400==0))
				return true;
			else
				return false;
			
		

	}

}
