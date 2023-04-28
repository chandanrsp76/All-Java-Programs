package array;

public class CommonElement2 {

	public static void main(String[] args) {
		int[] x = {12,23,45,67};
		int[] y = {13,23,4,12,34,13,};
		int[] rs=findCommon(x, y);
		System.out.println("Common Elements:-");
		for (int i = 0; i < rs.length; i++) {
			System.out.println(rs[i]+" ");
		}
	}

	public static int[] findCommon(int[] x, int[] y) {
		int[] z = new int[x.length];
		int k = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {
				if (x[i] == y[j]) {
					z[k] = x[i];
					k++;
				}
			}
		}
		int[] rs=new int[k];
		for (int i = 0; i < rs.length; i++) {
			rs[i]=z[i];
		}
		return rs;
	}
}
