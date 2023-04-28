package Pattern;
/*  C
 *  C H
 *  C H A
 *  C H A N
 *  C H A N D
 *  C H A N D A
 *  C H A N D A N   */
import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String value st");
		String st=sc.nextLine();
		int n=st.length();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(st.charAt(j)+" ");
			}
			System.out.println();
		}
	}
}
