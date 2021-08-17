package Practise;

public class CapitalizedString {

	// Words starting with a capital letter. - Capitalized String
	public static int CapitalizedString(String str) {

		// App1
//		int count=0;
//		for(int i=0; i<str.length();i++)
//		{
//			if(str.charAt(i) >='A' && str.charAt(i)<='Z')
//			{
//				count++;
//			}		
//		}
//		return count;

		// App2
//		int count1=0;
//		for(int i=0; i<str.length();i++)
//		{
//			if(str.charAt(i) >=65 && str.charAt(i)<=90)
//			{
//				count1++;
//			}		
//		}
//		return count1;

//		// App3
//		int count2 = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if (Character.isUpperCase(str.charAt(i))) {
//				count2++;
//			}
//		}
//		return count2;

		// App4
//		long count5 = str.chars().filter(e -> Character.isUpperCase(e)).count();
//		System.out.println(count5);
//		return count5;

		// App4
		long count6 = str.chars().filter(e -> e>=65 && e<=90).count();
		System.out.println(count6);
		return (int) count6;
	}

	public static void main(String[] args) {
		System.out.println(CapitalizedString("HarshalChopade"));
	}

}
