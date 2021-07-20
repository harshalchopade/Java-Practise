package Practise;

public class StringContainsOnlyDigits {

	public static boolean isEmpty(CharSequence charac) {
		
		return charac ==null || charac.length() ==0;
		
	}
	
	public static boolean isNumeric(CharSequence cs) {
		if(isEmpty(cs))
			return false;
		
		for(int i=0; i<cs.length();i++)
		
		if(!Character.isDigit(cs.charAt(i)))
		{
			return false;
		}
		return true;
		
	}
	public static void main(String[] args) {
		
		System.out.println(isNumeric("Hi Alkesha 123"));
	}

}
