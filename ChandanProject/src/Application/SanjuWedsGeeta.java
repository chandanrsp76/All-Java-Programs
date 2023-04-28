package Application;
import java.util.Scanner;
public class SanjuWedsGeeta {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value");
	int a=sc.nextInt();
	String st=getWeds(a);
			System.out.println(st);
}
	public static String getWeds(int n) {
	if(n%3==0&&n%5==0)
		return"Sanju weds geeta ";
	else if(n%3==0)
		return"Sanju";
	else if(n%5==0)
		return"Geeta";
	else
		return"Break Up";
	}
}
