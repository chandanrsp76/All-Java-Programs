package Arrayjava;

public class Stringex {
 public static void main(String[] args) {
	String a="India";
	int l=a.length();
	char c[]=new char[l];
	for(int i=0;i<l;i++) {
		c[i]=a.charAt(i);
	}
	for (int i = 0; i <l; i++) {
		System.out.print(c[i]+" ");
	}
}
}
