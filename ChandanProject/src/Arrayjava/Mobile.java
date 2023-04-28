package Arrayjava;

public class Mobile {
  String brand;
  double price;
  String color;
  String CameraCapacity;
  String storage;
public Mobile(String brand, double price, String color) {
	this.brand = brand;
	this.price = price;
	this.color = color;
}
public Mobile(String brand, double price, String color, String cameraCapacity, String storage) {
	this(brand,price,color);
	CameraCapacity = cameraCapacity;
	this.storage = storage;
}
public Mobile(String brand, double price, String color, String cameraCapacity) {
	this(brand,price,color);	
	CameraCapacity = cameraCapacity;
}
public String toString() {
	return "Mobile brand:-"+brand+" "+"Price:-"+price+" "+"Color:-"+color+" "+"CameraCapacity:-"+CameraCapacity+" "+"Storage:-"+storage;
}
public static void main(String[] args) {
	Mobile m1=new Mobile("Vivo",25000d,"Black","64mp","Ram-4gb,Rom-64gb");
	System.out.println(m1);
	Mobile m2=new Mobile("Redmi",22000d,"Grey");
	System.out.println(m2);
	Mobile m3=new Mobile("Samsung",30000d,"Darkblue","120mp");
	System.out.println(m3);
}
   

  
}
