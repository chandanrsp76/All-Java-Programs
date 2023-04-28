package Arrayspro;
public class ArrayBiggestNumber {
   public static void main(String[] args) {
	int[] x= {40,37,15,12,14};
	int bg=getBiggest(x);
	System.out.println("biggest is:"+bg);
}
   static int getBiggest(int[] ar) {
	int big=ar[0];
	for (int i = 1; i < ar.length; i++) {
		if(ar[i]>big)
			big=ar[i];
		
	}
	return big;
		
	}
	   
}


