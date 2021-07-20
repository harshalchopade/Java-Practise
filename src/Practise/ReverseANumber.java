package Practise;

import java.util.Scanner;

public class ReverseANumber {

	public static void approach1() {

		// Approach1
		Scanner sc = new Scanner(System.in);
		System.out.println("Please eneter the number: ");
		int num = sc.nextInt();

		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		System.out.println("Reveres number is " + rev);
	}

	public static void approach2() {

		// Approach2
		Scanner sc = new Scanner(System.in);
		System.out.println("Please eneter the number: ");
		String num = sc.next();
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		sb.reverse();
		System.out.println("Reveres number is " + sb);
	}

	public static void approach3() {

		// Approach1
		Scanner sc = new Scanner(System.in);
		System.out.println("Please eneter the number: ");
		String num = sc.next();
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		sb.reverse();
		System.out.println("Reveres number is " + sb);
	}
	
	
	public static void main(String[] args) {
		approach1();
		approach2();
		approach3();

	}

}
