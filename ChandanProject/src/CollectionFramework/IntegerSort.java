package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerSort {
public static void main(String[] args) {
	ArrayList<Integer>ob=new ArrayList<Integer>();
	ob.add(10);
	ob.add(20);
	ob.add(30);
	ob.add(5);
	ob.add(15);
	ob.add(10);
	System.out.println("Before sorting:-");
	for (Integer i : ob) {
		System.out.println(i);
	}
	System.out.println("After Sorting:-");
	Collections.sort(ob);
	for (Integer i : ob) {
		System.out.println(i);
	}
}
}
