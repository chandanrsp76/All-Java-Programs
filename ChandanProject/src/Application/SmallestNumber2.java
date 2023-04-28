package Application;

import java.util.Scanner;

public class SmallestNumber2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enater double type value");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=getSmallNumber(a,b,c);
		System.out.println(d+" is a smallest Number");
		}
	public static double getSmallNumber(double p,double s,double r) {
         double small=p;
      if(s<small)
	    small=s;
	   if(r<small)
		small=r;
		return small;
		
	}     
}
