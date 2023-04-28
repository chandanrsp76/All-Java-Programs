package string;

import java.util.Arrays;

public class DeleteArrayValues {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 3, 1, 3, 5 };
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0  ;
		}
		System.out.println(Arrays.toString(arr));
	}

}
