package string;

public class ReverseString2 {

	public static void main(String[] args) {
     String str="Chandan Prasad Automation Engineer";
     reverse(str);
	}

	private static void reverse(String str) {
      char[] ch=str.toCharArray();
      int i=0,j=ch.length-1;
      while(i<j) {
    	  char temp=ch[i];
    	  ch[i]=ch[j];
    	  ch[j]=temp;
    	  i++;
    	  j--;
      }
      String str1=new String(ch);
     System.out.print(str1);
	}

}
