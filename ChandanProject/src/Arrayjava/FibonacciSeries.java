package Arrayjava;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 10;
		int a = 0;
		int b = 1;
		//System.out.print(a+" ");
		while (n > 0) {
			int c = a + b;
			System.out.print(a+" ");
			b = a;
			a = c;
			n--;

		}
	}

}
