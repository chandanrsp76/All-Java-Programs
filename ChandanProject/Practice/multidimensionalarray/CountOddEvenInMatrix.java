package multidimensionalarray;

public class CountOddEvenInMatrix {

	public static void main(String[] args) {
		Matrix mat = new Matrix();
		int[][] x = mat.readMat();
		System.out.println("User Entered Matrix.");
		mat.displayMat(x);
		int[] total = countOddEven(x);
		System.out.println("Total Even Element = " + total[0]);
		System.out.println("Total Odd Element = " + total[1]);
	}

	private static int[] countOddEven(int[][] x) {
		int ev = 0, odd = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] % 2 == 0) {
					ev++;
				} else {
					odd++;
				}

			}
		}
		int[] total = { ev, odd };
		return total;
	}

}
