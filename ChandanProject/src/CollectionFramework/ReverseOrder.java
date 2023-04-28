package CollectionFramework;

import java.util.ArrayList;

public class ReverseOrder {
public static void main(String[] args) {
	ArrayList<Integer>ob=new ArrayList<Integer>();
	ob.add(10);
	ob.add(20);
	ob.add(30);
	ob.add(40);
	ob.add(100);
	ob.add(200);
	System.out.println("Reverse printing:-");
	for (int i =ob.size()-1; i >=0; i--) {
		System.out.println(ob.get(i));
		}
}

}

