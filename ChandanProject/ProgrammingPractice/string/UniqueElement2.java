package string;

import java.util.HashSet;
import java.util.Set;

public class UniqueElement2 {

	public static void main(String[] args) {
		String[] str = { "google", "facebook", "gmail", "google", "facebook", "yahoo" };
		Set<String> hs = new HashSet<>();
		for (String s : str) {
			hs.add(s);
		}
		System.out.println(hs);
	}

}
