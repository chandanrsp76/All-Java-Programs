package numbersystem;

import java.util.Scanner;

public class FibonannciSeriesWithinN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter term:-");
         int n=sc.nextInt();
         int a=0;
         int b=1;
         while(n>a) {
        	 System.out.print(a+",");
        	 int c=a+b;
        	 a=b;
        	 b=c;
        	 
         }
         
	}

}
