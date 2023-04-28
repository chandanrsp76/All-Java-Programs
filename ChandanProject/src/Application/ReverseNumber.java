package Application;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int rv=revese(n);
		System.out.println("Reverse of "+n+" is "+rv);
     }
         public static int revese(int x) {
        	 int rev=0;
        	 while (x!=0) {
        		 int r=x%10;
        		 rev=rev*10+r;
        		 x=x/10;
        	 }
        	return rev;	 
         }
}
