package Practise;

//String to Number without using Integer.parseInt() method

//We can solve this on the basis of ASCII value
//48 is ASCII value of 0
//We take first character from string convert them into int which nothing but ASCII value of character
//then will subtract 48 which nothing but 0.
public class StringToNumberWithoutWithoutInbuiltMethod {

	public static int convertStringToIntMethod1(String str) {
		
		if (str.length() == 1) {
			return (int) (str.charAt(0) - 48);
		}
		
		int num = 0;
		for (int i = 0; i < str.length(); i++) {
			num = num * 10 + ((int) str.charAt(i) - 48);
		}
		return num;
	}

	public static int convertStringToIntMethod2(String str) {
		
		if (str.length() == 1) {
			return (int) (str.charAt(0) - 48);
		}
		
		char[] ch = str.toCharArray();
		int zeroAscii = (int) '0';
		int sum = 0;
		for (int i = 0; i < ch.length; i++) {
			int asc = (int) ch[i];
			sum = sum * 10 + (asc - zeroAscii);
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(convertStringToIntMethod1("412"));
		System.out.println(convertStringToIntMethod2("212"));
	}
}
