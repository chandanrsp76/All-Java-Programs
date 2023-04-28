package CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrauyListReverse {
public static void main(String[] args) {
	  ArrayList<Object>ob=new ArrayList<Object>();
	  ob.add('a');
	  ob.add("Btm");
	  ob.add(10);
	  ob.add(true);
	  ob.add(100);
	  ob.add(12);
	  ob.add("Chandan");
	  System.out.println(ob);
	  System.out.println(ob.contains(11));
	  for (int i =ob.size()-1; i>=0; i--) {
		System.out.println(ob.get(i));
	}
	  System.out.println("bye foeach loop");
	  for (Object i : ob) {
		System.out.println(i);
	}
	  HashSet<Object>h=new HashSet<Object>(ob);
	  System.out.println(h);
}
}
