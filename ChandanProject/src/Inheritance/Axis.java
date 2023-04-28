package Inheritance;

public class Axis extends Rbi implements Atm {
 long accno;
 int pin;
 double balance;
public Axis(long accno, int pin, double balance) {
	this.accno = accno;
	this.pin = pin;
	this.balance = balance;
}
public void welcome() {
	System.out.println("Welcome to Axis Banking.");
}
public void checkBalance() {
	System.out.println("Your Balance is: "+balance);
}
public void withdrawCash() {
	System.out.println("Collect your Cash.");
}
 
}
