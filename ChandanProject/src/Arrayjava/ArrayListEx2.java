package Arrayjava;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx2 {
	public static void main(String[] args) {
		ArrayList<Character> ob = new ArrayList<Character>();
		ob.add('A');
		ob.add('p');
		ob.add('C');
		ob.add('L');
		ob.add('E');
		ob.add('O');
		System.out.println("Before sorting");
		for (Character ch : ob) {
			System.out.println(ch);
		}
		Collections.sort(ob);
		System.out.println("After sorting");
		for (Character ch : ob) {

			System.out.println(ch);
		}

	}
}
