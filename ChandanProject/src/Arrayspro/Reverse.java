package Arrayspro;

public class Reverse {
   public static void main(String[] args) {
	int[] x= {50,55,60,65,70,75,80,85,90,95,100};
	System.out.println("Before reverse:-");
	for (int i = 0; i < x.length; i++) {
		System.out.print(x[i]+" ");
	}
	getReverse(x);
	System.out.println("\nAfetr reverse:-");
	for (int i = 0; i < x.length; i++) {
		System.out.print(x[i]+" ");
	}
}

    static void getReverse(int[] ar) {
	int i=0,j=ar.length-1;
	while(i<j) {
		int temp=ar[i];
		ar[i]=ar[j];
		ar[j]=temp;
		i++;
		j--;
		
	}
}
   
    
}
