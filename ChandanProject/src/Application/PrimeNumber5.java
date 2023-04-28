package Application;

import java.util.Scanner;

public class PrimeNumber5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
			int p =countPrimeNumber(n);
		
		System.out.println(p);
		
}
	
	public static int countPrimeNumber(int x) {
		int count=0;
		for(int j=1;j<=x;j++) {
			int num=0;
			for(int i=1;i<=j;i++) {
			if(j%i==0) {
				num++;
			}
			}
			if(num==2) 
				count++;
			
		}
		
		return count;
	}

}

	