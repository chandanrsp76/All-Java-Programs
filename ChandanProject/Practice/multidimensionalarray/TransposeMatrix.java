package multidimensionalarray;

public class TransposeMatrix {

	public static void main(String[] args) {
		Matrix mat = new Matrix();
		int[][] x = mat.readMat();
		System.out.println("User Entered Matrix:-");
		mat.displayMat(x);
		int[][] tr = trasposeMatrix(x);
		System.out.println("After Transpose:-");
		mat.displayMat(tr);
	}

	private static int[][] trasposeMatrix(int[][] mat) {
		int[][] rs = new int[mat[0].length][mat.length];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				rs[j][i] = mat[i][j];
			}
		}
		return rs;
	}

}
