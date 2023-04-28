package numbersystem;

public class BinaryToDecimal {

	public static void main(String[] args) {
		int n = 11001;
		int bd = binaryToDecimal(n);
		System.out.println(bd);
		int bo = binaryToOctal(n);
		System.out.println(bo);
	}

	private static int binaryToOctal(int n) {
		int pow = 1, dec = 0;
		do {
			int r = n % 10;
			dec = dec + r * pow;
			pow = pow * 8;
			n = n / 10;
		} while (n != 0);
		return dec;
	}

	private static int binaryToDecimal(int x) {
		int pow = 1, dec = 0;
		do {
			int r = x % 10;
			dec = dec + r * pow;
			pow = pow * 2;
			x = x / 10;
		} while (x != 0);

		return dec;
	}

}
