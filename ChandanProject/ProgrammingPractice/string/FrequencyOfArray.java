package string;

public class FrequencyOfArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 1, 2, 5, 3, 5, 2, 1, };
		frequncy(arr);
	}

	public static void frequncy(int[] arr) {
		boolean[] b = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (b[i] == false) {
				int count = 1;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
						b[j] = true;
					}

				}
				if (count != 0) {
					System.out.println(arr[i] + "----->" + count);
				}
			}
		}
	}

}
