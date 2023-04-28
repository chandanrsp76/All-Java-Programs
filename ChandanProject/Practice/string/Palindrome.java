package string;

public class Palindrome {

	public static void main(String[] args) {
     int n=12212;
   boolean rs=  isPalindrome(n);
   if(rs) {
	   System.out.println(n+" is a Palindrome Number");
   }
   else{
	   System.out.println(n+" is not a Palindrome Number.");
   }
	}

	private static boolean isPalindrome(int n) {
       int rev=0,temp=n;
       while(n!=0) {
    	   int d=n%10;
    	   rev=rev*10+d;
    	   n=n/10;
       }
       return rev==temp;
	}

}
