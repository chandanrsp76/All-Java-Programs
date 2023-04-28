package Practice;

public class OddEveninArray {

	public static void main(String[] args) {
		int[] x = { 12, 13, 15, 17, 18, 19, 23, 18 };
		int[] ct = OddEven(x);
		System.out.println("Total even Number=" + ct[0]);
		System.out.println("Total odd Number=" + ct[1]);
	}

	private static int[] OddEven(int[] x) {
		int ec = 0, oc = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0) {
				ec++;
			} else {
				oc++;
			}
		}
		int[] total = { ec, oc };
		return total;
	}

}
