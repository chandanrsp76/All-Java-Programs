package MapInterface;

import java.util.HashMap;
import java.util.TreeMap;

public class MapEx1 {
	public static void main(String[] args) {
		HashMap<String, Long> h = new HashMap<String, Long>();
		h.put("Chandan", 7580984188l);
		h.put("Sonu", 8757737328l);
		h.put("Sunil", 9880984188l);
		h.put("Syam", 7567984188l);
		h.put("Pritam", 7980984188l);
		h.put("Moti", 9880984188l);
		h.put("Gavraw", 8180984188l);
		h.put("Chandan", 7580984188l);
		System.out.println("All the keys: " + h.keySet());
		System.out.println("All the Values: " + h.values());
		h.putIfAbsent("Manish", 780984188l);
		System.out.println("Printing by foreach loop:- ");
		for (String s : h.keySet()) {
			System.out.println(s + " =" + h.get(s));
		}
		
		TreeMap<String, Long> tm = new TreeMap<String, Long>(h);
		System.out.println("After convert HashMap to TreeMap:-");
		System.out.println(tm);
		System.out.println("Printing forEach loop:- ");
		for (String s : tm.keySet()) {
			System.out.println(s + "= " + tm.get(s));
		}
	}
}
