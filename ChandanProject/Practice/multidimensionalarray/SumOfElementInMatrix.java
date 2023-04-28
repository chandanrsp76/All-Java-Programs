package multidimensionalarray;

import java.util.Scanner;

public class SumOfElementInMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order of the matrix.");
		int row = sc.nextInt();
		int col = sc.nextInt();
		System.out.println("Enter " + row * col + " integer values");
		int[][] mat = new int[row][col];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("User Entered Matrix.");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		int sum = sumOfElement(mat);
		System.out.println("Sum of the Element: " + sum);
	}

	public static int sumOfElement(int[][] mat) {
		int sum = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				sum = sum + mat[i][j];
			}
		}
		return sum;
	}

}
