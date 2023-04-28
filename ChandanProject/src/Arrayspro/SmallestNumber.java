package Arrayspro;

public class SmallestNumber {
   public static void main(String[] args) {
	int[] x= {10,30,7,40,46,20,5};
	int sm=getSmallest(x);
	System.out.println("Smallest Number is:"+sm);
   }
   static int getSmallest(int[] ar) {
	   int small=ar[0];
	   for(int i=1;i<ar.length;i++) {
		   if(ar[i]<small)
             small=ar[i];			   
	   }
	   return small;
   }
   


}