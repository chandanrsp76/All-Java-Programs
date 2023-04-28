package Pattern;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Value of n");
int n=sc.nextInt();
int x=1;
for(int i=1;i<=n;i++) {
	for(int j=1;j<=n;j++) {
		if(x<=9)
			System.out.print(x+"");
		else {
			x=1;
			System.out.print(x+"");
		}
		x++;
	}
	System.out.println();
}

	}

}
