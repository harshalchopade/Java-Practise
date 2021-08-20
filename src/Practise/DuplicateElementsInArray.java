package Practise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsInArray {

	static String[] str = { "Java", "C++", "Python", "Java" };

	public static void findDuplicatesElements() {
		boolean status = false;

		for (int i = 0; i <= str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i] == str[j]) {
					status = true;
					System.out.println("Duplicate element found " + str[i]);
				}
			}
		}
	}

	// Approach2
	public static void usingHashset() {
		HashSet<String> lang = new HashSet<String>();
		for (String eachLang : str) {
			if (lang.add(eachLang) == false)
			System.out.println("Duplicate element found " + lang);
		}
	}

	// Approach3
	public static void usingHashMap() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (String eachLang : str) {
			Integer count = map.get(eachLang);
			if (count == null)
				map.put(eachLang, 1);
			else
				map.put(eachLang, ++count);
		}

		// get values from string
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> each : entrySet) {
			if (each.getValue() > 1)
				System.out.println("Duplicate element is ::" + each.getKey());
		}
	}

	public static void main(String[] args) {
		usingHashMap();
	}
}
