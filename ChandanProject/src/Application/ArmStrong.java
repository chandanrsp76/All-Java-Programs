package Application;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number");
       int n=sc.nextInt();//356
       boolean rs=isArmStrong(n);
       if(rs)
    	   System.out.println(n+" is an Armstrong Number");
       else
    	   System.out.println(n+" is not an ArmStrong Number");
	}
	public static boolean isArmStrong(int x){//356
	int sum=0,temp=x;
	 while (x!=0) {
		 int d=x%10;
		 sum=sum+d*d*d;
		 x=x/10;
	 }
	 return sum==temp;
	}

}
