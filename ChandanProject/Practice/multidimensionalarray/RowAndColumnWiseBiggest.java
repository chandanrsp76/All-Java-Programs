package multidimensionalarray;

public class RowAndColumnWiseBiggest {

	public static void main(String[] args) {
		Matrix mat = new Matrix();
		int[][] x = mat.readMat();
		System.out.println("User Entered Matrix:-");
		mat.displayMat(x);
		int[] rbg = rowWiseBiggest(x);
		int[] cbg = columnWiseBiggest(x);
		for (int i = 0; i < rbg.length; i++) {
			System.out.println(i + 1 + " Row Biggest = " + rbg[i]);
		}
		for (int i = 0; i < cbg.length; i++) {
			System.out.println(i + 1 + " Column Biggest = " + cbg[i]);
		}
	}

	private static int[] columnWiseBiggest(int[][] mat) {
		int[] big = new int[mat[0].length];
		for (int i = 0; i < mat[0].length; i++) {
			big[i] = mat[0][i];
			for (int j = 0; j < mat.length; j++) {
				if (mat[j][i] > big[i])
					big[i] = mat[j][i];
			}
		}
		return big;
	}

	private static int[] rowWiseBiggest(int[][] mat) {
		int[] big = new int[mat.length];
		for (int i = 0; i < mat.length; i++) {
			big[i] = mat[i][0];
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] > big[i])
					big[i] = mat[i][j];
			}
		}
		return big;
	}

}
