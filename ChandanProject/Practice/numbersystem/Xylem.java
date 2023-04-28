package numbersystem;

public class Xylem {

	public static void main(String[] args) {
    int x=13243;
    if(isXylem(x))
    	System.out.println(x+" is xylem Number");
    else
    	System.out.println(x+" is phloem"); 
    	
	}

	private static boolean isXylem(int n) {
        int d=n%10;
        n=n/10;
        int mid=0;
        while(n>9) {
        	int dc=n%10;
        	mid=mid+dc;
        	n=n/10;
        }
        int end=n+d;
        return mid==end;
	}

}
