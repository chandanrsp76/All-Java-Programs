package string;

import java.util.Arrays;
import java.util.Iterator;

public class SortigWords {

	public static void main(String[] args) {
		String str = "A quick brown fox jumps over the lazy Dog ";
		String[] word = str.split(" ");
		System.out.println("Before sorting.....");
		System.out.println(Arrays.toString(word));
		String temp = "";
		boolean rs = true;
		while (rs) {
			rs = false;
			for (int i = 0; i < word.length - 1; i++) {
				if (word[i].length() > word[i + 1].length()) {
					temp = word[i];
					word[i] = word[i + 1];
					word[i+1] = temp;
					rs = true;
				}
				
			}
		}
		System.out.println("After sorting......");
		System.out.println(Arrays.toString(word));

	}

}
