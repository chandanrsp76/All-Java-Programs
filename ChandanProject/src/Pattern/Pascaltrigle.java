package Pattern;
/*
 *      1   
      1   1   
    1   2   1   
  1   3   3   1   
1   4   6   4   1   

 */

import java.util.Scanner;

public class Pascaltrigle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
		
              int x=1;
              for(int j=1;j<=i;j++) {
            	  System.out.print(x+"   ");
            	  x=x*(i-j)/j;
              }
              System.out.println();
            	  
              }
	}

}
