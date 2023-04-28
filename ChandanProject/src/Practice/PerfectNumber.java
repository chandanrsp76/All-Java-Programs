package Practice;

import java.util.Scanner;

public class PerfectNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Range. ");
	int n=sc.nextInt();
	boolean rs=isPerfact(n);
	if(rs)
		System.out.println(n+" is perfect number");
	else
		System.out.println(n+" is not a Perfact number.");
}

private static boolean isPerfact(int x) {
	int sum=0;
	for (int i = 0; i < x/2; i++) {
		if(x%i==0) 
			sum=sum+i;
		
		
	}
	return sum==x;
}
}
