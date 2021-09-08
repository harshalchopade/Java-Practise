package Practise;

public class StringProgram {

	public static void main(String[] args)

	{
		String[] str = { "HelloWorld", "WelcomeJava" }; // o/p -  hello_world welcome_java
		String temp = "";

		for (String each : str) {
			char[] charArray = each.toCharArray();
			for (int j = 0; j < charArray.length; j++) {
				if (Character.isUpperCase(charArray[j])) {
					if (j != 0)
						temp = temp + "_" + Character.toLowerCase(charArray[j]);
					else
						temp = temp + Character.toLowerCase(charArray[j]);
				} else {
					temp = temp + charArray[j];
				}
			}
		}
		System.out.println(temp);
	}
}
