package Arrayjava;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListEx1 {
public static void main(String[] args) {
	ArrayList<Float>ob=new ArrayList<Float>();
	ob.add(2.5f);
	ob.add(10.5f);
	ob.add(9.3f);
	for (Float f1 : ob) {
		System.out.println(f1);
	}
	Collections.sort(ob);
	for (Float f1 : ob) {
		System.out.println(f1);
	}

}
}
