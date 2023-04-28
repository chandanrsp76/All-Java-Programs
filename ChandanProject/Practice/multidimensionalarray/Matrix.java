package multidimensionalarray;

import java.util.Scanner;

public class Matrix {
	public int[][] readMat() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order of the matrix.");
		int row = sc.nextInt();
		int col = sc.nextInt();
		System.out.println("Enter " + row * col + " Integer values.");
		int[][] mat = new int[row][col];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		return mat;
	}

	public void displayMat(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
