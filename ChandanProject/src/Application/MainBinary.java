package Application;

import java.util.Scanner;

public class MainBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal Number:");
		int dec=sc.nextInt();
		String bn=decToBin(dec);
		System.out.println("Binary equivalent of "+dec+" is "+bn);
    }
	static String decToBin(int dec) {
		String bin="";
		do {
			int r=dec%2;
			bin=r+bin;
			dec=dec/2;
		}
		while(dec!=0);
		return bin;
			
		}
	}
