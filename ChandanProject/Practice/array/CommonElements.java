package array;

public class CommonElements {
	public static void main(String[] args) {
		int[] arr1 = { 12, 25, 16, 34, 30 };
		int[] arr2 = { 35, 122, 123, 34, 30, 69, 93, 20 };
		int[] rs = findCommon(arr1, arr2);
		System.out.println("common Elements are:-");
		for (int i = 0; i < rs.length; i++) {
			System.out.println(rs[i] + " ");
		}
	}

	private static int[] findCommon(int[] arr1, int[] arr2) {
		int[] rs = new int[arr1.length];
		int k = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					rs[k] = arr1[i];
					k++;
				}
			}

		}
		int[] rp = new int[k];
		for (int i = 0; i < rp.length; i++) {
			rp[i] = rs[i];

		}
		return rp;
	}
}
