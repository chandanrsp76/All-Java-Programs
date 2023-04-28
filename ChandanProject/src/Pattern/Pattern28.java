package Pattern;

import java.util.Scanner;

/*           1
 *         0 0 0
 *       1 1 1 1 1
 *     0 0 0 0 0 0 0
 *   1 1 1 1 1 1 1 1 1  
 * 
 */
public class Pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the value of n");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++) {
    	  for(int j=1;j<=n-i;j++) {
    		  System.out.print("  ");
    	  }
    	  for(int j=1;j<=2*i-1;j++) {
    		  System.out.print(i%2+" ");
    	  }
    	  System.out.println();
      }
	}

}
