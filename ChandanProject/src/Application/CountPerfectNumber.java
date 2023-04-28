package Application;

import java.util.Scanner;

public class CountPerfectNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range");
		int n=sc.nextInt();
		int ct=countPerfect(n);
		System.out.println("perfect Number:"+ct);
	}
	public static int countPerfect(int range) {
		int count=0;
		for(int x=1;x<=range;x++) {
			int sum=0;
			for(int i=1;i<=x/2;i++) {
				if(x%i==0)
					sum=sum+i;
				}
			if(sum==x)
				count++;
			}
		return count;
		
	}

}
	