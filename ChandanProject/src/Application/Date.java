package Application;

import java.util.Scanner;

public class Date {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the date(dd mm yyyy)");
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yy=sc.nextInt();
String date=getDate(dd,mm,yy);
			System.out.println("Given date is " +date);
		}
public static String getDate(int dd,int mm,int yy)
{
	if(dd<1||dd>31||mm>12||mm<1||yy<1)
		return "invalid";
	else if((mm==4||mm==6||mm==9||mm==11)&&(dd>30))
       return "invalid";
       else if(mm==2 && dd>29)
    	   return "invalid";
       else if((yy%4==0&&yy%100!=0||yy%400==0)==false && mm==2&&dd>28)
    	   return "invalid";
       else
    	   return "valid";
    	   
    	  }
}
