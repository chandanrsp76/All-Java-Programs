package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class SearchElement {
public static void main(String[] args) {
	ArrayList<Object>ob=new ArrayList<Object>();
	ob.add("hii");
	ob.add('a');
	ob.add(10);
	ob.add(20.5f);
	ob.add('A');
	ob.add("Hello");
	System.out.println(ob.contains("Hello"));
	for (int i = 0; i <ob.size(); i++) {
		System.out.println(ob.get(i));
		
	}
	ob.clear();
	System.out.println(ob);
}
}
