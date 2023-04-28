package Arrayspro;

public class Marge {
	public static void main(String[] args) {
		 ZigzagOrder mr=new  ZigzagOrder();
		 System.err.println("Read the First Array:- ");
		int x[]= mr.readArray();
		System.err.println("Read the Second Array:- ");
		int y[]=mr.readArray();
		System.err.print("User Entered First Array:- ");
		mr.displayArray(x);
		System.out.print("User Entered Second Array:- ");
		mr.displayArray(y);
		System.err.print("After merge:- ");
		int[] z=mr.zigZagOrder(x,y);
		mr.displayArray(z);
		
}
}