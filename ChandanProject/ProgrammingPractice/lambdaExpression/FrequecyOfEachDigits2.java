package lambdaExpression;

public class FrequecyOfEachDigits2 {

	public static void main(String[] args) {
		        long num = 7580984188L;
		        int digit = 8;
		        int count = 0;
		        while (num > 0) {
		            if (num % 10 == digit) {
		                count++;
		            }
		            num /= 10;
		        }
		        System.out.println("Frequency of " + digit + " = " + count);
		    }
		

}
