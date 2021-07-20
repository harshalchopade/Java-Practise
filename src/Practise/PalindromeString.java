package Practise;

import java.util.Scanner;

public class PalindromeString {
	
	public static void verifyStringIsPalindrome()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string :");
		String str = sc.next();
		String original_string = str;
		
		//Approach1
		String rev = "";
		for(int i= str.length()-1; i>=0;i--)
		{
			rev = rev+str.charAt(i);
		}
		if(original_string.equals(rev))
			System.out.println("Entered string is palindrome.");
		else
			System.out.println("Entered string is not palindrome.");
	}

	public static void main(String[] args)
	{
		verifyStringIsPalindrome();
	}
}
