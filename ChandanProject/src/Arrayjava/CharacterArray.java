package Arrayjava;

public class CharacterArray {
	public static void main(String[] args) {
		char ch[]= {'a','b','c','d','e'};
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		String s=new String(ch);
		System.out.println(s);
	}

}
