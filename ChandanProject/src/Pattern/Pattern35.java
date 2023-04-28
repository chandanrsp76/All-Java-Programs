package Pattern;
/*
 * 
      * 
    *   * 
  *       * 
*           * 
  *       * 
    *   * 
      * 

 */

import java.util.Scanner;

public class Pattern35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the value of n");
     int n=sc.nextInt();
     int sp=n/2,st=1;
     for(int i=1;i<=n;i++) {   //Number of line
    	 for(int j=1;j<=sp;j++) {  //Number of space
    		 System.out.print("  ");
    	 }
    	 for(int j=1;j<=st;j++) { //Number of star
    		 if(j==1||j==st)
    			 System.out.print("* ");
    		 else
    			 System.out.print("  ");
    	 }
    	 if(i<=n/2) {
    		 sp--;
    		 st=st+2;
    	 }
    	 else {
    		 sp++;
    		 st=st-2;
    	 }
    	 System.out.println();
    		 
     }
     
	}

}
