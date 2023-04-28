package multidimensionalarray;

public class AddToMatrix {

	public static void main(String[] args) {
		Matrix mat = new Matrix();
		System.out.println("Enter the 1st Matrix:-");
		int[][] x = mat.readMat();
		System.out.println("Enter the 2nd Matrix:-");
		int[][] y = mat.readMat();
		System.out.println("User Entered 1st Matrix.");
		mat.displayMat(x);
		System.out.println("User Entered 2nd Matrix.");
		mat.displayMat(y);
		int[][] sum = addMatrix(x, y);
		if (sum == null) {
			System.out.println("Addition is failed.");
		} else {
			System.out.println("Add Matrix:-");
			mat.displayMat(sum);
		}

	}

	private static int[][] addMatrix(int[][] x, int[][] y) {
		if (x.length != y.length || x[0].length != y[0].length) {
			return null;
		}
		int[][] rs = new int[x.length][x[0].length];
		for (int i = 0; i < rs.length; i++) {
			for (int j = 0; j < rs[i].length; j++) {
				rs[i][j] = x[i][j] + y[i][j];
			}
		}
		return rs;
	}

}
