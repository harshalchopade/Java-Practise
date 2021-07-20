package Practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class PrintCountOfDuplicateCharacters
{

	public static void printCountOfDuplicateCharacters() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String str = sc.next();
		if (str == null || str.length() == 0 || str.isEmpty()) 
		{
			System.out.println("Please enter a valid string.");
			return;
		}

		char[] charArray = str.toCharArray();
		HashMap<Character, Integer> mapCount = new HashMap<Character, Integer>();
		for (char c : charArray) 
		{
			if (mapCount.containsKey(c)) {
				mapCount.put(c, mapCount.get(c) + 1);
			} else
				mapCount.put(c, 1);
		}
		
		//Print Map
		Set<Map.Entry<Character, Integer>> set = mapCount.entrySet();
		for (Entry<Character, Integer> entry : set) 
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey() + ":"+ entry.getValue());
			}
		}
	}

	public static void main(String[] args) 
	{
		printCountOfDuplicateCharacters();
	}
}
