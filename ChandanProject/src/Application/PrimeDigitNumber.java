package Application;

import java.util.Scanner;

public class PrimeDigitNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();
	int ct=countPrimeD(n);
	System.out.println("Number of Prime digits "+ct);
}
	public static int countPrimeD(int x) {
		int count =0;
		while(x!=0) {
			int r=x%10;
			if(r==1||r==2||r==3||r==5||r==7)
				count++;
			x=x/10;
		}
		
		return count;
		
	}
	

}
