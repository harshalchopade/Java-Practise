package Practise;

public class RemoveSpecialAndJunkChar {

	public static void removeJunk() {

		String str = "ADCSGG@#$%^&*hfnfg()_+";
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
	}

	public static void removeWhiteSpaces() {

		String str = "ADCSGG@# $ %^ & * hf n f g ()_+";
		str = str.replaceAll("\\s", "");
		System.out.println(str);
	}

	public static void removeSpaces() {

		String str = " Automation Engineer ";
		String empty = "";
		for (int i = 0; i <str.length(); i++) {
			if ((str.charAt(i) != ' ') && (str.charAt(i + 1) != '\t')) 
			{
				empty = empty + str.charAt(i);
			}
		}
		System.out.println(empty);

	}

	public static void main(String[] args) {
		removeWhiteSpaces();
	}

}
