package Application;

import java.util.Scanner;

public class BiggestValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Double type value");
		 double a=sc.nextDouble();
		 double b=sc.nextDouble();
		 double c=sc.nextDouble();
		 double d=sc.nextDouble();
		 double big =a;
		 
		 if(b>big)
			 big=b;
			 if(c>big)
				 big=c;
			 if(d>big)
				 big=d;
			 System.out.println("Biggest double type value is "+big);
				 
		 

	}

}
