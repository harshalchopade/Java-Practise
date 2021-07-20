package Practise;

public class VowelsCount {

	public static boolean countVowels(char i)
	{
		return i=='a' || i=='e' ||i=='i' ||i=='o' ||i=='u' 
				||i=='A' ||i=='E' ||i=='I' ||i=='O' ||i=='U';
		
	}
	public static void main(String[] args) 
	{
		String str = "Harshal";
		int count=0;
		for(int i=0; i<str.length();i++)
		{
			if(countVowels(str.charAt(i)))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	//Using Google Guava
//	String str = "Harshal";
//	int voCount = CharMatcher.anyOf("aeiouAEIOU").counIn(str);
//	System.out.println(voCount);

}
