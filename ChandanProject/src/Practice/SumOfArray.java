package Practice;

public class SumOfArray {
public static void main(String[] args) {
	int[] x= {12,12,10,15,1};
	int sum = getSum(x);
	System.out.println("sum of Element is: "+sum);
}

private static int getSum(int[] ar) {
	int sum=0;
	for (int i = 0; i < ar.length; i++) {
		sum=sum+ar[i];
	}
	return sum;
}
}
