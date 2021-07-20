package Practise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLength {

	public static void findStringLength() {

		String str = "testing";

		// 1
		System.out.println(str.toCharArray().length);
		// 2
		System.out.println(str.lastIndexOf(""));
		//3
		Matcher m = Pattern.compile("$").matcher(str);
		m.find();
		int len = m.end();
		System.out.println(len);
		//4
		System.out.println(str.split("").length);
		//5
		int l = new StringBuilder(str).length();
		System.out.println(l);
		//6
		int count =0;
		for(char ch :str.toCharArray())
		{
			count++;
		}
		System.out.println(count);
		
	}

	public static void main(String[] args) {
		findStringLength();
	}

}
