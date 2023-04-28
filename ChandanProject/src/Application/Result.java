package Application;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the 4 Subject Marks");
	int p=sc.nextInt();
	int c=sc.nextInt();
	int m=sc.nextInt();
	int b=sc.nextInt();
 String st=getResult(p,c,m,b); 
 System.out.println(st);
	}
	public static String getResult(int a,int b,int c,int d) 
	{
		if(a<35||b<35||c<35||d<35)
			return "Fail";
		double per=(a+b+c+d)/4.0;
		if(per>=85)
			return "distinction";
		else if(per>=60)
			return "1st division";
		else if(per>=50)
			return "2nd division";
		else 
			return "pass";
			
		
	}
	
	

	
}
