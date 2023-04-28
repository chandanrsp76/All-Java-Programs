package ProgrammingRev;

import java.util.Scanner;

public class Factorial1 {
   public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the Number");
	int num=sc.nextInt();
	int fc=getFact(num);
	System.out.println(num+" factorial is: "+fc);
}

private static int getFact(int n) {
	int fact=1;
	while(n>1) {
		fact=fact*n;
		n--;
	}
	return fact;
}

}
