package Application;

import java.util.Scanner;

public class MainDate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Date(dd mm yyyy)");
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yy=sc.nextInt();
		if(dd<1||dd>31||mm>12||yy<1)
			System.out.println("Invalid");
		else if(mm==4||mm==6||mm==9||mm==11)
			System.out.println("Invalid");
		else if(mm==2&&dd>29)
			System.out.println("invalid");
		else if((yy%4==0 && yy%100!=0||yy%400==0)==false && mm==2 && dd>28)
            System.out.println("Invalid");
            else 
            	System.out.println("valid");
			
			
			
			
		

	}

}
