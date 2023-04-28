package Application;

import java.util.Scanner;

public class PossitiveNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=sc.nextInt();
		if(a>0)
			System.out.println("Given Number is Positive ");
		else if(a==0)
			System.out.println("Given Number is Zero ");
		else
			System.out.println("given Number is Negative");
	}

}
