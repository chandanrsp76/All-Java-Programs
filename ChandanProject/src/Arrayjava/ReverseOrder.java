package Arrayjava;

public class ReverseOrder {
public static void main(String[] args) {
	String s="morning";
	int l=s.length();
	System.out.println("Length of the given String is:"+l);
	char ch=s.charAt(3);
	System.out.println("character at index 3 is "+ch);
	for (int i = l-1; i >=0; i--) {
		ch=s.charAt(i);
		System.out.print(ch);
	}
	
}
}
