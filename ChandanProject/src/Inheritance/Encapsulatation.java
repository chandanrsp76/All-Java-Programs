package Inheritance;

import java.util.Scanner;

public class Encapsulatation {
   long Accountno;
   private int pin;
   private double balance;
   private long contactno;
public Encapsulatation(long accountno, int pin, double balance, long contactno) {
	this.Accountno = accountno;
	this.pin = pin;
	this.balance = balance;
	this.contactno = contactno;
}
public void setPin() {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the existing pin: ");
	int p=sc.nextInt();
	if(p==pin) {
		System.out.println("Enter the new Pin: ");
		p=sc.nextInt();
		System.out.println("Your pin is updated successfully: ");
	}else {
		System.out.println("you have enterd worng pin: ");
	}
}
public void setContact() {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the Existing contact number: ");
	long c=sc.nextLong();
	if(c==contactno) {
		System.out.println("Enter the new contact number: ");
		c=sc.nextLong();
		}
	else {
		System.out.println("you have enter worng contact number: ");
	}
}
public void getBalance() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the pin: ");
	int p=sc.nextInt();
	if(p==pin) {
		System.out.println("Avalilable balance: "+balance);
	}
	else {
		System.out.println("You have entered worng pin.");
	}
}
   
}
