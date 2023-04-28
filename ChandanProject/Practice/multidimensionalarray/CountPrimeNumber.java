package multidimensionalarray;

public class CountPrimeNumber {

	public static void main(String[] args) {
		Matrix mat = new Matrix();
		int[][] x = mat.readMat();
		System.out.println("User Entered Matrix.");
		mat.displayMat(x);
		int totalPrime = countPrime(x);
		System.out.println("Total Prime Number = " + totalPrime);

	}

	private static int countPrime(int[][] mat) {
		int pc = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				boolean rs = isPrime(mat[i][j]);
				if (rs == true)
					pc++;
			}
		}
		return pc;
	}

	private static boolean isPrime(int x) {
		for (int i = 2; i < x / 2; i++) {
			if (x % i == 0)
				return false;
		}
		return true;
	}

}
