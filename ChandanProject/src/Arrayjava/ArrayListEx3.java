package Arrayjava;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx3 {
	public static void main(String[] args) {
		ArrayList<Integer> ob = new ArrayList<Integer>();
		ob.add(4);
		ob.add(3);
		ob.add(10);
		ob.add(99);
		ob.add(2);
		ob.add(1);
		ob.add(5);
		ob.add(100);
		System.out.println("Before sorting");
		System.out.println(ob);
		System.out.println("After sorting");
		Collections.sort(ob);
		System.out.println(ob);

	}

}
