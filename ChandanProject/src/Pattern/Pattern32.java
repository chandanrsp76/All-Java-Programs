package Pattern;

import java.util.Scanner;

/*               1
 *             1 * 2
 *           1 * 2 * 3
 *         1 * 2 * 3 * 4
 *       1 * 2 * 3 * 4 * 5
 * 
 */

public class Pattern32 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		int k=1;
		for(int j=1;j<=n-i;j++) {
			System.out.println("  ");
			
		}
		
		for(int j=1;j<=2*i-1;j++) {
			if(j%2==0) {
				System.out.print("*");
			}
			else {
				System.out.print(k++);
			
			}
		}
		System.out.println();
	}
	
}
}
