package ProgrammingRev;

import java.util.ArrayList;

/*1 
  2 3
  4 5 6
  7 8 9 10 8*/
  
public class Pattern {
public static void main(String[] args) {
  
	for (int i = 1; i <=5; i++) {
		int x=i;
		for (int j =1; j >=5-i ; j++) {
			System.out.print(" ");
		
		}
		for (int j = 1; j <= 5-i; j++) {
			System.out.print(x+" ");
			x++;
		}
		System.out.println();
	}
	
}
}
