package numbersystem;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the decimal Number = ");
		int n = sc.nextInt();
		String bin = deciBinary(n);
		System.out.println("Binary number = "+bin);
		String oct = decioct(n);
		System.out.println("Octal Number = "+oct);
		String hex = decihex(n);
		System.out.println("Hexadecimal Number = "+hex);
	}

	private static String decioct(int n) {
		String oct = "";
		do {
			int dc = n % 8;
			oct = dc + oct;
			n = n / 8;
		} while (n != 0);
		return oct;
	}

	private static String decihex(int n) {
		String hex = "";
		do {
			int r = n % 16;
			if(r<10)
			hex = r + hex;
			else
				hex=(char)(r+55)+hex;
			n = n / 16;
		} while (n != 0);
		return hex;
	}

	public static String deciBinary(int n) {
		String bin = "";
		do {
			int dc = n % 2;
			bin = dc + bin;
			n = n / 2;
		} while (n != 0);
		return bin;
	}


}
