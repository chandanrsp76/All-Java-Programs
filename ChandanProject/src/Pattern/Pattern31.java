package Pattern;

import java.util.Scanner;

/*
 *             1
 *            212
 *           32123
 *          4321234
 *         543212345
 */

public class Pattern31 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
            int n=sc.nextInt();
            for(int i=1;i<=n;i++) {
            	for(int j=1;j<=n-i;j++) {
            		System.out.print("  ");
            	}
            	int x=i;
            	for(int j=1;j<=2*i-1;j++) {
            		System.out.print(x+" ");
            		if(j<i)
            			x--;
            		else
            			x++;
            	}
            	 System.out.println();
            }
           
	}

}
