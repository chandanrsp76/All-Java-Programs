package CollectionFramework;
import java.util.*;
public class CollectionShortMethood {
 public static void main(String[] args) {
	ArrayList<String>ob=new ArrayList();
	ob.add("Btm");
	ob.add("btm");
	ob.add("chandan");
	ob.add("Chandan");
	ob.add("Layout");
	ob.add("layout");
	System.out.println("Before shorting");
	for (String i : ob) {
		System.out.println(i);
	}
	System.out.println("After shorting");
	Collections.sort(ob);
	for (String i : ob) {
		System.out.println(i);
	}
}
}
