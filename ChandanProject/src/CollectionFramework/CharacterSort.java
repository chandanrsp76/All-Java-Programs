package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class CharacterSort {
public static void main(String[] args) {
	ArrayList <Character>ob=new ArrayList <Character>();
	ob.add('a');
	ob.add('B');
	ob.add('z');
	ob.add('Z');
	ob.add('P');
	ob.add('p');
	System.out.println("Before sorting:-");
	for (Character c : ob) {
		System.out.println(c);
	}
	System.out.println("Afetr sorting:-");
	Collections.sort(ob);
	for (Character c : ob) {
		System.out.println(c);
	}
	
	
	
}
}
