package Practice;

import java.util.Scanner;

public class FrequencyArray2 {
	int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Arrays:-");
		int size = sc.nextInt();
		System.out.println("Enter " + size + " values:-");
		int[] ar = new int[size];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		return ar;
	}

	void displayArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] + " ");
		}
		System.out.println();
	}
	void printFrequency(int[] a) {
		boolean rs[]=new boolean[a.length];
		for (int i = 0; i < rs.length; i++) {
			if(rs[i]==false) {
				int count=1;
				for (int j = i+1; j < a.length; j++) {
					if(a[i]==a[j]) {
						count++;
						rs[j]=true;
					}
				}
				System.out.println("Frequency of "+a[i]+" = "+count);
			}
		}
	}

}
