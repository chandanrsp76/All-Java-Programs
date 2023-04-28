package multidimensionalarray;

import java.util.Scanner;

public class SmallestElementInMatrix2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Order of the Matrix.");
		int row = sc.nextInt();
		int col = sc.nextInt();
		System.out.println("Enter " + row * col + " integer values.");
		int[][] mat = new int[row][col];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("User entered Matrix.");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		int small = getSmallest(mat);
		System.out.println("Smallest Element is:  " + small);
	}

	private static int getSmallest(int[][] mat) {
		int small = mat[0][0];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < small)
					small = mat[i][j];
			}
		}
		return small;
	}

}
