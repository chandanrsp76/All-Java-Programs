package string;

public class FrequecyOfEachCharacter {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 6, 2, 3, 4, 2, 4, 5 };
		frequecy(arr);

	}

	private static void frequecy(int[] arr) {
		boolean[] b = new boolean[arr.length];
		System.out.println("Number"+"----->" +"Frequency");
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
					
					System.out.println("     "+arr[i] + "----->" + count);
				}
			}
		}
	}

}
