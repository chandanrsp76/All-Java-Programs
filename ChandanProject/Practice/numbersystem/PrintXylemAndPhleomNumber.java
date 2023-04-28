package numbersystem;

public class PrintXylemAndPhleomNumber {

	public static void main(String[] args) {
		int x = 1000;
	System.out.println("Xylem Number");
		for (int i = 0; i <= x; i++) {
			if (isXylemORPhleom(i))
				System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Phleom Number");
		for (int i = 0; i < x; i++) {
			if (!(isXylemORPhleom(i)))
				System.out.print(i + " ");
		}
	}

	public static boolean isXylemORPhleom(int n) {
		int d = n % 10;
		n = n / 10;
		int mid = 0;
		while (n > 9) {
			int m = n % 10;
			mid = mid + m;
			n = n / 10;
		}
		int end = d + n;
		return end == mid;
	}

}
