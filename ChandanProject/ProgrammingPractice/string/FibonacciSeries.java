package string;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 100;
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(a + " " + b + " ");
		while (a + b <= n) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}

}
