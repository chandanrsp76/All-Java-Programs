package string;

public class Convert_String_Integer {

	public static void main(String[] args) {
//		1. //String to Int
		String str4 = "1000";
		int n = Integer.parseInt(str4);
		System.out.println(n);
//
//		2. // int to String;
		int i = 1000;
		String str3 = Integer.toString(i);
		System.out.println(str3);

//		3. String to char
		String str = "chandan";
		char ch = str.charAt(0);
		char ch1 = str.charAt(1);
		char ch2 = str.charAt(2);
		char ch3 = str.charAt(3);
		char ch4 = str.charAt(4);
		char ch5 = str.charAt(5);
		char ch6 = str.charAt(6);
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch6);

//    4. char to String
		char ch7= 'a';
		String str5 = Character.toString(ch7);
		System.out.println(str5);
		
		
//	 5. Double to String
		double d=123.43d;
		String str2=Double.toString(d);
		System.out.println(str2);


		
// 	6.String to Double	
		String str1="123";
		double d2=Double.parseDouble(str1);
		System.out.println(d2);
		
		

	}

}
