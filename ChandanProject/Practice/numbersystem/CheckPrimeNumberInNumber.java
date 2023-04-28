package numbersystem;

import java.util.Scanner;

public class CheckPrimeNumberInNumber {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:-");
        int n=sc.nextInt();
        isPrime(n);
	}

	public  static void isPrime(int n) {
      int count=0;
      while(n!=0) {
    	  int r=n%10;
    	  if(r==1||r==2||r==3||r==5||r==7)
    		  count++;
    	  n=n/10;
      }
      System.out.println(count);
      
	}

}
