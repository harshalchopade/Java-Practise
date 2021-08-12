package Practise;

public class StringIsAValidNumber {

	public static boolean IsCorrectPhoneNumber(String number) {
		//return number.matches("[0-9]{10}"); //Digit should be in between 0-9 and length should be 10.
		return number.matches("//d{10}"); //alternative for above regex
		
	}
	
	public static boolean IsNumber(String number) {
		try {
			Long.parseLong(number);
			System.out.println("It's a valid no " + number);
		} catch (NumberFormatException e) {
			System.out.println("Not a valid no " + number);
			return false;
		}
		return true;
	}

	public static boolean isValidPhoneNumber(String number) {
		if (number.length() == 10 && IsNumber(number)) {
			System.out.println("Valid Phone No " + number);
			return true;
		}
		System.out.println("Not a valid phone no " + number);
		return false;

	}

	public static void main(String[] args) {
		System.out.println(isValidPhoneNumber("96656356358"));
	}
}
