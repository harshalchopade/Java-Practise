package Practise;

import java.util.Scanner;

public class PalindromeNumber {

	public static void verifyNoIsPanlindrome() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please a enter a number :");
		int number = sc.nextInt();
		int original_no = number;
		int rev = 0;

		while (number != 0) {
			rev = rev * 10 + number % 10;
			number = number / 10;
		}
		if (original_no == rev)
			System.out.println("Entered number is palindrome.");
		else
			System.out.println("Entered number is not palindrome.");
	}

	public static void main(String[] args) 
	{
		verifyNoIsPanlindrome();
	}
}
