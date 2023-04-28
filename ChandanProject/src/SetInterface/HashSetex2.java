package SetInterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetex2 {
public static void main(String[] args) {
	HashSet<Object>h=new HashSet<Object>();
	h.add(3.6f);
	h.add("BTM");
	h.add(123);
	h.add('A');
	h.add(true);
	h.remove("BTM");
	System.out.println("print using  for each loop");
	for (Object i : h) {
		System.out.println(i);
	}
	System.out.println("print using Iterator");
	Iterator<Object>ob=h.iterator();
while(ob.hasNext()) {
	System.out.println(ob.next());
}



	
}
}
