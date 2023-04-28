package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueElement {

	public static void main(String[] args) {
		String[] str = { "google", "facebook", "gmail", "google", "facebook", "yahoo" };
		Set hs1 = new HashSet<>(Arrays.asList(str));
		System.out.println(hs1);
	}

}
