package Inheritance;

public class OlaApp {
	public static void main(String[] args) {
		Prime p = new Prime();
		ride(p);
		Auto a = new Auto();
		ride(a);
	}

	public static void ride(Ola ob) {
		ob.welcome();
		ob.book();
		
		if (ob instanceof Prime) {
			Prime dp = (Prime) ob;
			dp.costPrime();
		} else {
			Auto da = (Auto) ob;
			da.costAuto();
		}

	}
}
