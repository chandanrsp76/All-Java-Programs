package Inheritance;

public class Counter {
 public static void main(String[] args) {
	Axis ob=insert();
	ob.welcome();
	ob.withdrawCash();
	ob.checkBalance();
	ob.interestRate();
}

public  static Axis insert() {
	Axis ob=new Axis(2073101020505l,841243,25000);
	return ob;
}
}
