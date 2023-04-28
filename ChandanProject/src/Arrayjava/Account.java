package Arrayjava;

import java.util.Scanner;

public class Account {
	int pin;
	double balance;

	public Account(int pin, double balance) {
		this.pin = pin;
		this.balance = balance;
	}

	public void withdrawMoney() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pin");
		int p = sc.nextInt();
		
		try {
			if (p == pin) {
				System.out.println("Enter the amount");
				double amount = sc.nextDouble();
				if (amount > balance) {
					throw new InSufficientBalanceException("Your balance is insufficient");
				} else {
					System.out.println("collect your cash");
				}
			} else {
				throw new InValidPinException("you have enter wrong pin");
			}

		} finally {
			System.out.println("Thank you for using our banking");
		}

	}

	public void print() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		Account ob = new Account(841243, 10000d);
		ob.withdrawMoney();
		ob.print();
	}

}
