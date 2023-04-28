package CollectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class BidirectionalIterator {
public static void main(String[] args) {
	ArrayList<Integer>ob=new ArrayList<Integer>();
	ob.add(10);
	ob.add(9);
	ob.add(13);
	ListIterator<Integer>i=ob.listIterator();
	while(i.hasNext())
	{
	System.out.println(i.next());
	}
	while(i.hasPrevious()) {
		System.out.println(i.previous());
	}
	
	
}
}
