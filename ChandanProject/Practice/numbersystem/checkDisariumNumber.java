package numbersystem;

public class checkDisariumNumber {

	public static void main(String[] args) {
		int n = 135;
		if(isDisariumNumber(n))
			System.out.println(n+" is a Disarium Number.");
		else
			System.out.println(n+" is not a Disarium Number.");
	}

	public static boolean isDisariumNumber(int x) {
		int sum = 0, temp = x;
		while (x != 0) {
			int d = x % 10;
			sum = sum + power(d, count(x));
			x = x / 10;
		}
		return sum == temp;
	}

	private static int power(int n, int p) {
		int prod = 1;
		while (p > 0) {
			prod = prod * n;
			p--;
		}

		return prod;
	}

	private static int count(int x) {
		int count = 0;
		while (x != 0) {
			x = x / 10;
			count++;
		}
		return count;
	}

}
