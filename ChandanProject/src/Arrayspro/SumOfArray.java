package Arrayspro;

public class SumOfArray {
  public static void main(String[] args) {
	int[] x= {40,30,10,50,15};
	int s=isSum(x);
	System.out.println("sum of element is:"+ s);
}
  static int isSum(int[] ar) {
	  int sum=0;
	  for (int i = 0; i < ar.length; i++) {
		sum=sum+ar[i];
	}
	  return sum;
  }
}
