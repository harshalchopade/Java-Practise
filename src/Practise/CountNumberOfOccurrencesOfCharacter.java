package Practise;

public class CountNumberOfOccurrencesOfCharacter {
	
	public static long countOccurenceOfCharacter(String str, char ch ) {
		
		return str.chars().filter(e-> (char)e == ch).count();
		
	}

	public static void main(String[] args) {
		System.out.println(countOccurenceOfCharacter("Harshal", 'H'));

	}

}
