package CollectionFramework;

import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Student4 implements Comparable<Student4> {
int id;
String name;
public Student4(int id, String name) {
	this.id = id;
	this.name = name;
}
public String toString() {
	return name+" "+id+"";
}
public int compareTo(Student4 ob) {
	if(this.name.compareTo(ob.name)>0) 
		return 1;
	else if(this.name.compareTo(ob.name)<0)
		return -1;
	else
		return 0;
	
}
public static void main(String[] args) {
	HashMap<Integer, Student4>hm=new HashMap<Integer,Student4>();
	Student4 s1=new Student4(101,"chandan");
	hm.put(16, s1);
	Student4 s2=new Student4(102,"Sonu");
	hm.put(17, s2);
	Student4 s3=new Student4(100,"Aryan");
	hm.put(9, s3);
	
	TreeMap<Integer,Student4>t=new TreeMap<Integer,Student4>(hm);
	
	System.out.println(t);	
	
	
}

}
