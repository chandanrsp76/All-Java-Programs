package Practice;

public class DeleteArray2 {
	public int[] deleteArray(int[] ar, int in) {
		if (in < 0 || in >= ar.length) {
			System.out.println("Not possible to delete");
			return ar;
		}

		int[] br = new int[ar.length - 1];
		for (int i = 0; i < br.length; i++) {
			if (i < in)
				br[i] = ar[i];
			else
				br[i] = ar[i + 1];
		}
		return br;
	}



}

