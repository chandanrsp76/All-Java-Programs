package Pattern;
/*  1 2 3 4 5 
 *    2 3 4 5
 *      3 4 5 
 *        4 5
 *          5                */

import java.util.Scanner;

public class Pattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value of n");
       int n=sc.nextInt();
       for(int i=1;i<=n;i++) {
    	   for(int j=1;j<=i-1;j++) {
    		   System.out.print("  ");
    	   }
    	   for(int j=i;j<=n;j++) {
    		   System.out.print(j+" ");
    	   }
    	   System.out.println();
       }
	}

}
