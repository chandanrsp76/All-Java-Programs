package string;

public class FibbonacciSeries {

	public static void main(String[] args) {
     int n=6;
     fibonacciseries(n);
	}

	private static void fibonacciseries(int n) {
        int a=0;
        int b=1;
     System.out.println(a);
        while(n>0) {
        	int c=a+b;
        	a=b;
        	b=c;
        	n--;
        	System.out.println(a);
        }
    	
	}

}
