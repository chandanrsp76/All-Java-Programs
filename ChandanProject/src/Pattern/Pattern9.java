package Pattern;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the value of N");
	    int n=sc.nextInt();
	    int x=1;
	    for(int i=1;i<=n;i++) {
	    	for(int j=1;j<=i;j++) {
	    		System.out.print(i+" ");
	    	}
	    	System.out.println();
	}
	}
}
