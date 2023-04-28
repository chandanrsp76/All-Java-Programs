package CollectionFramework;

import java.util.ArrayList;

public class Student3 {
String name;
int id;
public Student3(String name, int id) {
	
	this.name = name;
	this.id = id;
}
public String toString() {
	return name+" "+id+" ";
}
public static void main(String[] args) {
	ArrayList<Student3>ob=new ArrayList<Student3>();
	Student3 s1=new Student3("Chandan",101);
	ob.add(s1);
	Student3 s2=new Student3("Sonu",102);
	ob.add(s2);
	Student3 s3=new Student3("Sunil",103);
	System.out.println(ob);
	for (Student3 s : ob) {
		System.out.println(s);
		ob.contains(s1);
		System.out.println();   
		
	}
}



}
