package Practice;

import java.util.Iterator;
import java.util.Scanner;

public class FrequecyArrayElement {
	static void readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array:-");
		int size = sc.nextInt();
		System.out.println("Enter " + size + " values");
		int[] ar = new int[size];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println("Enter no. to find frequency:-");
		int key = sc.nextInt();
		count(ar,key);
	}

	static void count(int[] ar, int key) {
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == key)
				count++;
		}
		System.out.println("Frequency of "+key+"="+count);
	}
	public static void main(String[] args) {
		readArray();
	}
}
