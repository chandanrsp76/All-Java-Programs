package Arrayjava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyOEachCharacterUsingMap {
	public static void main(String[] args) {
	String str="Chandan prasad chandanrsp8@gmail.com";
	char[] ch=str.toCharArray();
	Map<Character, Integer>freq=new HashMap<>();
	for (int i = 0; i < ch.length; i++) {
		if(freq.containsKey(ch[i])) {
			freq.put(ch[i], freq.get(ch[i])+1);
		}
		else {
			freq.put(ch[i], 1);
		}
			
	}
	for(Map.Entry<Character, Integer>f:freq.entrySet()) {
		System.out.println(f.getKey()+"---->"+f.getValue());
	}
	
	}
}
