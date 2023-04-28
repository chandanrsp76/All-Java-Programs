package Inheritance;

public class MultiCatch2 {
public static void main(String[] args) {
	int a=10,b=0,c;
	int[] d=new int[3];
	String s=null;
	try {
		d[3]=44;
	}catch(ArrayIndexOutOfBoundsException ob) {
		System.out.println("Array Exception cought");
	}
	try {
		c=a/b;
	}catch(ArithmeticException obj){
		System.out.println("Exception is cought");
	}
	try {
		
		System.out.println(s.length());
	}
	catch(NullPointerException p){
		System.out.println(p);
	}
	finally {
		System.out.println("Hii");
	}
}
}
