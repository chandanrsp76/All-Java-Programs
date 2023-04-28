import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachCharacterUsingMap {

	public static void main(String[] args) {
		String str = "Chandan Prasad Chandanrsp76@gmail.com";
		char[] ch = str.toCharArray();
		Map<Character, Integer> freq = new HashMap<>();
		for (int i = 0; i < ch.length; i++) {
			if (freq.containsKey(ch[i])) {
				freq.put(ch[i], freq.get(ch[i]) + 1);
			} else {
				freq.put(ch[i], 1);
			}

		}
		for (Map.Entry<Character, Integer> f : freq.entrySet())
			System.out.println(f.getKey() + "------>" + f.getValue());
	}
}
