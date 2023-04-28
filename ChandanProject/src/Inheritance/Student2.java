package Inheritance;

public class Student2 {
int id;
String name;
public Student2(int id, String name) {
	this.id = id;
	this.name = name;
}
public String toString() {
	return id+" "+name+" ";
}
public boolean equals(Student2 ob) {
	
	if(this.name.equals(ob.name)){
		return true;
		
	}
	else {
		return false;
	}
}
public static void main(String[] args) {
Student2 s=new Student2(102,"Chandan");
Student2 s1=new Student2(102,"Chandan");
System.out.println(s.equals(s1));
}
}