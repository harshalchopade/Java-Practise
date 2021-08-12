package Practise;

import java.util.HashMap;

public class CountOccurrencesOfEachCharacter {

	public static void getCharCount(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		// to ignore blank space use String.valueOf(c).IsBlank;
		for (char c : ch) {
			// if(!String.valueOf(c).IsBlank())
			if (map.containsKey(c))
				map.put(Character.toLowerCase(c), map.get(c) + 1);
			else
				map.put(Character.toLowerCase(c), 1);

		}
		System.out.println("Characters repeated in " + map);

	}

	public static void main(String[] args) {

		getCharCount("Test");
	}
}
