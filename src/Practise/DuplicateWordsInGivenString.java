package Practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInGivenString {

	public static void duplicateWordsFromString(String str) {
		String[] words = str.split(" ");

		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		for (String eachWord : words) {
			if (wordCount.containsKey(eachWord))
				wordCount.put(eachWord.toLowerCase(), wordCount.get(eachWord) + 1);
			else
				wordCount.put(eachWord, 1);
		}

		// extracting all keys
		Set<String> wordsInString = wordCount.keySet();
		for (String word : wordsInString) {
			if (wordCount.get(word) > 1)
				System.out.println(word + " : " + wordCount.get(word));
		}
	}

	public static void main(String[] args) {
		duplicateWordsFromString("Hi java is OOP lang. java is robust.");
	}
}
