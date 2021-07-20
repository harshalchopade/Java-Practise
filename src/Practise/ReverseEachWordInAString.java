package Practise;

import java.util.Scanner;

public class ReverseEachWordInAString {

	public static void reverseEachWordInString() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String str = sc.nextLine();
		
		String[] array = str.split("\\s");
		String reversoword = "";
		for (String string : array) {
			StringBuilder sb = new StringBuilder(string);
			sb.reverse();
			reversoword = reversoword+sb.toString()+" ";
			
		}
		System.out.println("Reverse each word in a string :"+reversoword);
	}
	public static void main(String[] args) 
	{
		reverseEachWordInString();
	}

}
