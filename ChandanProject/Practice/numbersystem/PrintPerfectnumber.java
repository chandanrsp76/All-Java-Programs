package numbersystem;

public class PrintPerfectnumber {

	public static void main(String[] args) {
   int n=1000;
   for (int v = 1; v < n; v++) {
   boolean rs=isPerfect(v);
   if(rs)
	   System.out.println(v+" is a perfect number.");
   }
  
	}

	private static boolean isPerfect(int x) {
		int sum = 0;
		for (int i = 1; i <= x / 2; i++) {
			if (x % i == 0)
				sum = sum + i;
		}
		return sum == x;
	}

}
