package Arrayjava;

import java.util.ArrayList;

public class Pen {
   String brand;
   int price;
   public Pen(String brand,int price) {
	   this.brand=brand;
	   this.price=price;
   }
   public String toString()
   {
	   return brand+" "+price;
   }
   public static void main(String[] args) {
	ArrayList<Pen>p=new ArrayList<Pen>();
	p.add(new Pen("Cello",10));
	p.add(new Pen("Renolds",15));
	p.add(new Pen("Fair",20));
	p.add(new Pen("Link",7));
	p.add(new Pen("max",12));
	System.out.println("print by for each loop");
	for (Pen p1 : p) {
		System.out.println(p1);
	}
	
	
}
}
