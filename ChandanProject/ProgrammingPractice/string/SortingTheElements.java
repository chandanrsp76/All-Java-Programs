package string;

import java.util.Arrays;

public class SortingTheElements {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 1, 6, 5, 3, 7, 9, 8, 11, 10 };
		System.out.println("Before Sorting.........");
		System.out.println(Arrays.toString(arr));
		int temp = 0;
		boolean rs = true;
		while (rs) {
			rs = false;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					rs = true;
				}
			}
		}
		System.out.println("After sorti  ng.........");
		System.out.println(Arrays.toString(arr));
	}

}
