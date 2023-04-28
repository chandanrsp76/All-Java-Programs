package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Pen {
   String brand;
   int price;
public Pen(String brand, int price) {
	super();
	this.brand = brand;
	this.price = price;
}
public String toString() {
	return brand+" "+price+" ";
}
public static void main(String[] args) {
	LinkedList<Pen>ob=new LinkedList<Pen>();
	Pen p1=new Pen("Cello",15);
	ob.add(p1);
	Pen p2=new Pen("Renolds",20);
	ob.add(p2);
	Pen p3Pen=new Pen("Link",30);
	ListIterator i=ob.listIterator();
	System.out.println("printin element in forword diction");
	
while(i.hasNext()){
	System.out.println(i.next());
}
}
}
