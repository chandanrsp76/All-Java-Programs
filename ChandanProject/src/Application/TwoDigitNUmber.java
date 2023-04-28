package Application;

import java.util.Scanner;

public class TwoDigitNUmber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one integer value");
		int n=sc.nextInt();
		if((n>=10 && n<=99)||(n<=-10 && n>=-99))
			System.out.println("Two digit Number");
			
		else
			System.out.println("Not Two digit Number");
		
	
		
	}

	}


