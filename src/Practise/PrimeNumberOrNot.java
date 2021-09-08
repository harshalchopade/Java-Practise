package Practise;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void checkNumberPrimeOrNot() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		while (num > 0) {
			if (num % 2 != 0) {
				System.out.println("Entered number is prime.");
				break;
			} else
				System.out.println("Entered number is not prime.");
		}
	}

	public static void main(String[] args) {

		checkNumberPrimeOrNot();
	}
}
