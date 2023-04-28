package Application;

import java.util.Scanner;

public class SmallestNUmber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter three integer Number");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int small=a;
			if(b<small)
				small=b;
	          if(c<small)
		       small=c;
	          System.out.println("Smallest Number is "+small);
	

	}

}
