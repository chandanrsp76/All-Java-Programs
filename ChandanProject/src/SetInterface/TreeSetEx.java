package SetInterface;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>();
		try {
			t.add("Chandan");
			t.add("Sonu");
			t.add("shysm");
			t.add("Sunil"); 
			t.add("Ram");
			t.add(null);
			t.add("Amit");	
			for (String s : t) {
				System.out.println(s);
			}
		} catch (NullPointerException a) {
			System.out.println(a);
		}
		finally {
			System.out.println("All ok");
		}
		
		
		

	}
}
