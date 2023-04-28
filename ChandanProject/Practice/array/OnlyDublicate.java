package array;

public class OnlyDublicate {
	public static void main(String[] args) {
		String str = "ChAndan PrasAd";
		findFreq(str);
	}

	private static void findFreq(String str) {
		str=str.toLowerCase();
		char[] arr=str.toCharArray();
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
				if(count==1)
					if(arr[i]!=' ')
				System.out.println(arr[i]+"-->"+count);
			}
		}
	}
}
