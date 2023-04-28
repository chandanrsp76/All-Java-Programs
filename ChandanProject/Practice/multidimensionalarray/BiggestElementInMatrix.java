package multidimensionalarray;

public class BiggestElementInMatrix {

	public static void main(String[] args) {
		Matrix mat = new Matrix();
		int[][] x = mat.readMat();
		System.out.println("User enter Matrix");
		mat.displayMat(x);
		int big = getBiggest(x);
		System.out.println("Biggest Element is: " + big);
	}

	public static int getBiggest(int[][] mat) {
		int big = mat[0][0];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] > big)
					big = mat[i][j];
			}
		}
		return big;
	}

}
