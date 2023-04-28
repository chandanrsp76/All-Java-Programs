package patterns;

import java.util.Scanner;
//1 2 3 4 5 
//6 7 8 9 1 
//2 3 4 5 6 
//7 8 9 1 2 
//3 4 5 6 7 

public class Pattern9 {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the value of n:-");
 int n=sc.nextInt();
 int x=1;
 for (int i = 1; i <=n; i++) {
	for (int j = 1; j <=n; j++) {
		System.out.print(x+" ");
		x++;
		if(x==10)
			x=1;
	}
	System.out.println();
}
	}

}
