package Inheritance;

import java.util.Scanner;

public class Account1 {
int pin;
double balance;
public Account1(int pin, double balance) {
	this.pin = pin;
	this.balance = balance;
}
public void WithdrawMoney() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Pin");
	int p=sc.nextInt();
	try {
	if(p==pin) {
		System.out.println("Enter the Amount");
		double amount=sc.nextDouble();
		if(amount>balance){
			throw new InsufficientBalanceExcepetion("Your Balance is Insufficient.");
		}
		else {
			System.out.println("Collect your Cash");
			balance=balance-amount;
			System.out.println("Available balance "+balance);
		}
	}else {
		System.out.println("You have entered Wrong pin");
	}
	
	}catch(InsufficientBalanceExcepetion ob) {
		System.out.println(ob);
	}
	finally {
		System.out.println("Thank you for using our Banking");
	}

}
public static void main(String[] args) {
	Account1 a=new Account1(841243,10000);
	a.WithdrawMoney();
}
}