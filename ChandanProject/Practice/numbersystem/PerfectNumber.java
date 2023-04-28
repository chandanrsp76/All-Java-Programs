package numbersystem;

public class PerfectNumber {

	public static void main(String[] args) {
		int n = 6;
		boolean rs=isPerfect(n);
		if(rs) {
			System.out.println(n+" is a perfect Number");
		}
		else {
			System.out.println(n+" not a perfect number");
		}
	}

	private static boolean isPerfect(int x) {
		int sum = 0;
		for (int i = 1; i <= x/ 2; i++) {
			if (x% i == 0)
				sum = sum + i;
		}
		return sum == x;
	}
}