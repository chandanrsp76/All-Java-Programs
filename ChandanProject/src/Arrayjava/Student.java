package Arrayjava;

public class Student {
   String name;
   int id;
   float percentage;
private Object s1;
public Student(String name, int id, float percentage) {
	this.name = name;
	this.id = id;
	this.percentage = percentage;
}


public boolean equals(Object ob) {
	if(this==ob) 
	{
		return true;
	}
 if(ob instanceof Student) {
	 Student ss=(Student)ob;
	 if(this.name.equals(ss.name)&& this.id==ss.id && this.percentage==ss.percentage)
	 {
		 return true;
	 }
	 else
	 {
		 return false;
	 } 
 }
return false;
}

public static void main(String[] args) {
	Student s=new Student("chandan",101,79.3f);
	Student s1=new Student("sonu",102,78.3f);
	Student s2=new Student("pawan",103,77.3f);
	Student s3=s;
	Student s4=new Student("chandan",101,79.3f);
    System.out.println(s.equals(s1));    //   false
    System.out.println(s.equals(s2));    //   false 
    System.out.println(s2.equals(s1));   //   false 
    System.out.println(s3.equals(s));   //    true
    System.out.println(s4.equals(s));   //   true  
   
}
  
}
