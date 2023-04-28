package string;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		System.out.println("Before Reverse:-");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		int[] rev = reverse(arr);
		System.out.println();
		System.out.println("After Reverse:-");
		for (int i = 0; i < rev.length; i++) {
			System.out.print(rev[i] + ",");
		}
	}

	private static int[] reverse(int[] arr) {
		int i = 0, j = arr.length - 1;
		while (i <= j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return arr;
	}

}
