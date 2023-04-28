package Application;

import java.util.Scanner;

public class PerfectNumber2 {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number");
       int n=sc.nextInt();
       boolean rs=isPerfectNumber(n);
       if(rs)
    	   System.out.println(n+" is a Perfect Number");
       else
    	   System.out.println(n+" is not a perfect Number");
       }
	public static boolean isPerfectNumber(int x) {
		int sum=0;
		for(int i=1;i*i<x;i++) {
			if(x%i==0) {
				sum=sum+i;
				if(i!=1)
					sum=sum+x/i;
			}
		}
		return sum==x;
	}

}
