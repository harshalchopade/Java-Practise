package Practise;

import java.text.DecimalFormat;

public class CheckPercentageOfCharacters {
	
	public static void getCharPercentage(String str) 
	{
		int upperCaseCharacters = 0;
		int lowerCaseCharacters = 0;
		int numbers = 0;
		int specialCharacters = 0;
		DecimalFormat formatter = new DecimalFormat("##.##");
		
		for(int i=0; i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch))
				upperCaseCharacters++;
			else if(Character.isLowerCase(ch))
				lowerCaseCharacters++;
			else if(Character.isDigit(ch))
				numbers++;
			
			else
				specialCharacters++;
		}
		
		double upperCaseCharactersPercentage = (upperCaseCharacters*100.0)/str.length();
		double lowerCaseCharactersPercentage = (lowerCaseCharacters*100.0)/str.length();
		double numbersPercentage = (numbers*100.0)/str.length();
		double specialCharactersPercentage = (specialCharacters*100.0)/str.length();
		
		System.out.println("Upper case characters % is "+formatter.format(upperCaseCharactersPercentage));
		System.out.println("Lower case characters % is "+formatter.format(lowerCaseCharactersPercentage));
		System.out.println("Numbers % is "+formatter.format(numbersPercentage));
		System.out.println("Special characters % is "+formatter.format(specialCharactersPercentage));
	}

	public static void main(String[] args) {
		getCharPercentage("Hello 123 #$%^");

	}
}
