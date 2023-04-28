package Pattern;
/* a
 * a b
 * a b c
 * a b c d
 * a b c d e   */
import java.util.Scanner;

public class pttern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the value of n");
	     int n=sc.nextInt();
	     for(int i=1;i<=n;i++) {
	    	for(int j=1;j<=i;j++) {
	    		System.out.print((char)(96+j)+" ");
	    	}
	    	System.out.println();
	     }
	}

}
