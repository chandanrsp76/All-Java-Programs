package Arrayjava;

public class EachWordReverse {

	public static void main(String[] args) {
         String str="chandan Automation Engineer";
         reverseWord(str);
	}

	private static void reverseWord(String str) {
		 String[] str1=str.split(" ");
		 for (int i = 0; i < str1.length; i++) {
			String strc=reverse(str1[i]);
			System.out.print(strc+" ");
		}
	}

	private static String reverse(String str2) {
       		char[] ch=str2.toCharArray();
       		int i=0,j=ch.length-1;
       		while(i<j) {
       			char t=ch[i];
       			ch[i]=ch[j];
       			ch[j]=t;
       			i++;
       			j--;
       		}
       		String strc=new String(ch);
       		return strc;
	}

}
