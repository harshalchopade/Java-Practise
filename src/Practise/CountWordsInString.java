package Practise;

import java.util.Scanner;

public class CountWordsInString {
	public static void countWords() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine();
		int count = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ') && !Character.isDigit(str.charAt(i+1)))
				count++;
		}
		System.out.println("No of words are : " + count);
	}

	public static void main(String[] args) {
		countWords();
	}

}
