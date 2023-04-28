package numbersystem;

import java.util.Scanner;

public class FibonacciSeriesNthTerm {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter 1st n Term:");
      int n=sc.nextInt();
      int a=0,b=1;
      while(n>0) {
    	  System.out.print(a+",");
    	  int c=a+b;
    	  a=b;
    	  b=c;
    	  n--;
      }
	}

}
