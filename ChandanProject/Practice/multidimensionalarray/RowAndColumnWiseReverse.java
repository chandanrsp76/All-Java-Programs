package multidimensionalarray;

public class RowAndColumnWiseReverse {

	public static void main(String[] args) {
		Matrix mat = new Matrix();
		int[][] x = mat.readMat();
		System.out.println("User Entered Matrix.");
		mat.displayMat(x);
		int[][] rowrev = rowWiseReverse(x);
		System.out.println("Row wise Reverse.");
		mat.displayMat(rowrev);
		int[][] colrev = columnWiseReverse(x);
		System.out.println("Column wise Reverse.");
		mat.displayMat(colrev);
	}

	private static int[][] columnWiseReverse(int[][] x) {
		for (int i = 0; i < x.length / 2; i++) {
			for (int j = 0; j < x[i].length; j++) {
				int temp = x[i][j];
				x[i][j] = x[x.length - 1 - i][j];
				x[x.length - 1 - i][j] = temp;
			}
		}
		return x;
	}

	private static int[][] rowWiseReverse(int[][] x) {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length / 2; j++) {
				int temp = x[i][j];
				x[i][j] = x[i][x[i].length - 1 - j];
				x[i][x[i].length - 1 - j] = temp;
			}
		}
		return x;
	}

}
