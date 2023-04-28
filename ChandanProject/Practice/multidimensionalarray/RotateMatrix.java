package multidimensionalarray;

public class RotateMatrix {

	public static void main(String[] args) {
		Matrix mat = new Matrix();
		int[][] x = mat.readMat();
		System.out.println("User Entered Matrix.");
		mat.displayMat(x);
		int[][] left = rotate90degreeLeft(x);
		System.out.println("After Rotate 90 degree Left.");
		mat.displayMat(left);
		int[][] right = rotate90degreeRight(x);
		System.out.println("After Rotate 90 degree Right.");
		mat.displayMat(right);

	}

	private static int[][] rotate90degreeRight(int[][] x) {
		x = transpose(x);
		rowWiseReverse(x);
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

	private static int[][] rotate90degreeLeft(int[][] x) {
		x = transpose(x);
		columnWiseReverse(x);
		return x;
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

	private static int[][] transpose(int[][] x) {
		int[][] rs = new int[x[0].length][x.length];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				rs[j][i] = x[i][j];

			}
		}
		return rs;
	}

}
