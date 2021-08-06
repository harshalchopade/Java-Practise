package Practise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateElementsAndSort {
	static FileReader fileReader;
	static BufferedReader bufferedReader;

	/*
	 * This method will help us to remove duplicate String elements from the file.
	 */
	public static HashSet<String> removeDuplicateElements() throws IOException {
		HashSet<String> lang = new HashSet<String>();
		String data;
		try {
			fileReader = new FileReader("D:\\input-2.txt");
			bufferedReader = new BufferedReader(fileReader);
		} catch (Exception e) {
			e.printStackTrace();
		}
		while ((data = bufferedReader.readLine()) != null) {
			lang.add(data.toLowerCase());
		}
		return lang;
	}

	/*
	 * This method will help us to convert first letter of each word upper case.
	 * Sort the items by default natural sorting order.
	 */
	public static List<String> convertFirstWordToUpperCaseAndPrint() throws IOException {
		List<String> list = new ArrayList<String>();
		for (String word : removeDuplicateElements()) {
			/*
			 * If there are two words in a String e.g 'Java script' in our case to convert
			 * each word into Uppercase.
			 */
			if (word.trim().contains(" ")) {
				String temp = "";
				String[] strArray = word.split(" ");
				for (String eachWord : strArray)
					temp += Character.toUpperCase(eachWord.charAt(0)) + eachWord.substring(1) + " ";
				list.add(temp);
			}
			//When String has only one word
			else
				list.add(Character.toUpperCase(word.charAt(0)) + word.substring(1).trim());
		}
		Collections.sort(list); // sorting the element according to default sorting order.
		return list;
	}

	public static void main(String[] args) throws IOException {
		System.out.println(convertFirstWordToUpperCaseAndPrint());
	}
}
