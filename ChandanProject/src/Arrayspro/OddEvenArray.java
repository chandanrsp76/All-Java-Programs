package Arrayspro;

public class OddEvenArray {
	public static void main(String[] args) {
		int[] x= {23,16,3,19,58,59,39,44,94};
		int[] ct=countEO(x);
		System.out.println("Number of even value is:"+ct[0]);
		System.out.println("Number of odd value is:"+ct[1]);
	}

    static int[] countEO(int[] ar) {
	     int ec=0, oc=0;
	     for (int i = 0; i < ar.length; i++) {
			if(ar[i]%2==0)
				ec++;
			else
				oc++;
		}
	     int[] count= {ec,oc};
		return count;
	}
	

}
