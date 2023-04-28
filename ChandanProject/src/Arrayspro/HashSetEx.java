package Arrayspro;

import java.util.HashSet;
import java.util.Iterator;

 class HashSetEx {
public static void main(String[] args) {
  HashSet<Character>h=new HashSet<Character>();
  h.add('A');
  h.add('B');
  h.add('c');
  h.add('D');
  h.add('E');
  h.add('T');
  h.add('t');
  System.out.println("using for each loop");
  for (Character c : h) {
	System.out.println(c);
}
  System.out.println("using Iterator");
  Iterator<Character>ob=h.iterator();
  while(ob.hasNext())
  {
	  System.out.println(ob.next());
  }
}
}
