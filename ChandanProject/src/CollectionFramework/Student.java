package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
	String name;
	int id;
	float percentage;
	int rollno;
	public Student(String name, int id, float percentage, int rollno) {
		super();
		this.name = name;
		this.id = id;
		this.percentage = percentage;
		this.rollno = rollno;
	}
		public String toString() {
			return name+" "+id+" "+percentage+" "+rollno+" ";
		}
	
public static void main(String[] args) {
	ArrayList <Student> ob=new ArrayList <Student>();
	Student s1=new Student("Chandan",102,78.0f,10);
	ob.add(s1);
	Student s2=new Student("Pawan",103,68.5f,14);
	ob.add(s2);
	Student s3=new Student("Sonu",104,58.9f,13);
	ob.add(s3);
	Student s4=new Student("Shysm",105,78.7f,12);
	ob.add(s4);
	System.out.println("Printing by foreach loop:-");
	for (Student i : ob) {
		System.out.println(i);
	}
	
}
}
